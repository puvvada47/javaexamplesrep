package sample.addition.ex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Enrollment {

	public Boolean filter(String a, String b) {
		
		
		DateFormat df = new SimpleDateFormat("yyyyMM");
		DateFormat mf = new SimpleDateFormat("MM");
		String c1=null;
		String c2=null;
		
		try {
			Date datea=df.parse(a);
			Date dateb= df.parse(b);
			System.out.println(datea);
			System.out.println(dateb.toString());
			
			 c1=mf.format(datea);
			 c2=mf.format(dateb);
			System.out.println(c1);
			System.out.println(c2);
		} catch (ParseException e) {
			System.out.println(e);
			
		}
		
		 /*String c1 = a.substring(4, 6);
		String c2 = b.substring(4, 6);*/

		if (c1.equals(c2)) {
			System.out.println("true");
			return true;
		}
		System.out.println("false");
		return false;
	}

	public static void main(String[] args) {
		Enrollment e = new Enrollment();
		e.filter("201104", "201504");
	}
}
