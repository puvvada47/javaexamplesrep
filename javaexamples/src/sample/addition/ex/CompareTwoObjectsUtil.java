package sample.addition.ex;

import java.lang.reflect.Field;
//import java.lang.reflect.Field;
import java.lang.reflect.Type;



public class CompareTwoObjectsUtil<T> {

	public Boolean compare(Object dataFromCompare, Object dataToCompare) {

		if (!dataFromCompare.equals(dataToCompare)) {
			System.out.println(false);
			System.out.println("after");
			System.out.println(dataFromCompare);
			System.out.println(dataToCompare);

			return false;
		}
		return true;
	}

	public Object CompareEquals(T objectFromCompare, T objectToCompare)
			throws IllegalArgumentException, IllegalAccessException,
			NoSuchFieldException, SecurityException, ClassNotFoundException {

		Object com1 = (Object) objectFromCompare;
	    Object com2 = (Object) objectToCompare;

		Object dataFromCompare = null;
		Object dataToCompare = null;
		String name;

		if (objectFromCompare == null && objectToCompare == null)
			return true;

		else if (objectFromCompare == null && objectToCompare != null)
			return false;

		else if (objectFromCompare != null && objectToCompare == null)
			return false;

		Class<? extends Object> T1 = objectFromCompare.getClass();
		Class<?>[] declaredclasses=T1.getDeclaredClasses();
		
		//System.out.println(declaredclasses[0]);
		Class T2 = objectToCompare.getClass();
		System.out.println(objectFromCompare.getClass());
		
		Field[] fields = objectFromCompare.getClass().getDeclaredFields();
		System.out.println(T1 + " " + fields);

		for (Field field : fields) {
			System.out.println(field.getClass());
			System.out.println(field.getType().getClass());          //Type  name of the class          Type  name of the class
			System.out.println(field.getType());//type of the field(class sample.addition.ex.Address,Integer java.lang.Integer)
			System.out.println(field.getType().getName());//type of the field(name of the class:sample.addition.ex.Address/java.lang.Integer)
			System.out.println(field.getName());//name of the field
			

			if (field.getType().getName().equals("int")) {
				System.out.println(field.getInt(com1));//value of the field which only belongs to int
			}

			else if (field.getType().getName().equals("java.lang.String")) {

				System.out.println(field.get(com1));////value of the field which only belongs to String
			}
		}

		for (Field field : fields) {

			try {

				if (field.getType().getName().equals("int")) {
					dataFromCompare = T1.getDeclaredField(field.getName())
							.getInt(com1);
					dataToCompare = T2.getDeclaredField(field.getName())
							.getInt(com2);
					System.out.println(dataFromCompare);
					System.out.println(dataToCompare);
					Boolean c = compare(dataFromCompare, dataToCompare);
					if (c == false)
						return false;
				}

				else if (field.getType().getName().equals("java.lang.String")) {

					dataFromCompare = T1.getDeclaredField(field.getName()).get(
							com1);
					dataToCompare = T2.getDeclaredField(field.getName()).get(
							com2);
					System.out.println(dataFromCompare);
					System.out.println(dataToCompare);
					Boolean c = compare(dataFromCompare, dataToCompare);
					if (c == false)
						return false;
				}

				// else if(field.getType().getName()).isMemberClass())
				
				
				//else if (field.getType().isMemberClass())
				else
				{
					//T1.is
					
					
				System.out.println(field.get(com1).getClass().isMemberClass());
					
					
					System.out.println("going");
					System.out.println(field.getDeclaringClass().isPrimitive());
					//System.out.println(field.getType().isMemberClass());
					System.out.println( T1.getDeclaredField(field.getName())
							.get(com1));
					dataFromCompare = T1.getDeclaredField(field.getName()).get(
							com1);

					dataToCompare = T2.getDeclaredField(field.getName()).get(
							com2);

					System.out.println(dataFromCompare);
					System.out.println(dataToCompare);

					Object result = CompareEquals((T) dataFromCompare,
							(T) dataToCompare);

					boolean compareResult = (boolean) result;
					if (!compareResult)
						return false;
				}

			} catch (IllegalArgumentException e) {

				
			} catch (SecurityException e) {

				
			}

			// System.out.println(Class.forName(field.getType().getName()).isMemberClass());

			System.out.println("before");
			System.out.println(dataFromCompare);
			System.out.println(dataToCompare);

		}

		return true;
	}

}





