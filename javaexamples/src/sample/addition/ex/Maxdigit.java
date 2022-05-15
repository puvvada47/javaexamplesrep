package sample.addition.ex;

public class Maxdigit {
	
	public static void main(String[] args) {
		int number=1648700,count=1,k,temp=0,digit;
	    k=number;
	    System.out.println(" the given number:"+number );
	    while(k/10>=1){
	        
	        count++;
	        k=k/10;
	        
	    }
	    System.out.println(" count of the digits in the given number:"+count);
	    for(int i=0;i<count;i++){
	    	
	    	digit=number%10;//remainder means digit
	    	number=number/10;//to get quotient
	    	if(temp>=digit){
	    		System.out.println("digit:"+digit);
	    		}
	    	else
	    	{
	    	temp=digit;
	    	System.out.println(" digit:"+digit);}
	    }
	    System.out.println(" maximum digit in the given number"+temp);
	 
	    }
	}


