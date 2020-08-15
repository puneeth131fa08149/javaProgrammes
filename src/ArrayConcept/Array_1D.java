package ArrayConcept;

public class Array_1D {
	public static void main(String[] args) {
		/*
		int a[]=new int[5];

		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;

		System.out.println(a.length);

		System.out.println(a[2]);
	*/
		 

		int b[]= {100,200,300,400,500};
		/*
		System.out.println("length of an array is :"+ b.length);

		for (int i = 0; i <= b.length-1; i++) {
			System.out.println(b[i]);
		}*/
		for(int i:b) {
			System.out.println(i);
		}
		
		
	String	s="welcome";
		System.out.println(s.substring(0, 4));
		System.out.println(s.substring(2));
		System.out.println(s.substring(4));
		System.out.println(s.substring(2, 4));
		
		String s1="WElCOME";
		System.out.println(s1.toLowerCase());
		String s2="welcome";
		System.out.println(s2.toUpperCase());
	}

}
