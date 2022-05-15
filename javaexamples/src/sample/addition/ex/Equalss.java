package sample.addition.ex;

public class Equalss {

	int a;
	int b;
	
	
	
	public Equalss(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}



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



	public static void main(String[] args) {
		
		
		Equalss e1=new Equalss(1, 2);
		Equalss e2=new Equalss(1, 2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1.equals(e2));
		
		
		
		
	}
	
}
