package sample.addition.ex;

public class StaticExample {
	static int a=5;
	static int add()
	{
		return a;
	}

	int b=10;
	
	int sub() {
		b=30;
		return b;
	}
	
	public static void main(String[] args) {
		
		StaticExample s=new  StaticExample();
		s.a=6;
		System.out.println(StaticExample.a);
		System.out.println(StaticExample.add());
		
		StaticExample n=new  StaticExample();
		n.a=7;
		System.out.println(StaticExample.a);
		System.out.println(StaticExample.add());
		
		System.out.println(n.sub());
		 
	}	

}
