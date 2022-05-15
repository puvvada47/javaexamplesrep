package sample.addition.ex;

public class Student {
	
	public int a;
	public int b;
	public int c;
	public Address address;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	
	
	
public Student(int a, int b, int c, Address address) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.address = address;
	}

public static <T> void main(String[] args) throws ClassNotFoundException {
	
	
	Address a1=new Address("nandyal", "kurnool");
	Student s3=new Student(100,20,30,a1);
	Address a2=new Address("nandyal", "kurnool");
	Student s4=new Student(100,20,30,a2);
	
	CompareTwoObjectsUtil<Student> c=new CompareTwoObjectsUtil<Student>();
	try {
		System.out.println(c.CompareEquals(s3, s4));
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NoSuchFieldException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}




