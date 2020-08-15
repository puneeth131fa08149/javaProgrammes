package JavaQuations;

public class swapNumber {

	public static void main(String[] args) {

		int a=10;
		int b=20;
//		System.out.println("before swapping:");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		
//		System.out.println("After swapping:");
//		
//		int temp;
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a"+a);
//		System.out.println("b"+b);
//		
		//without temp******************************
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("After swapping:");
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
