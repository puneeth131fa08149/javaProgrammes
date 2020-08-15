package SDET;

import java.util.Scanner;

public class FindLargest_3_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter first number: ");
		int b=sc.nextInt();

		System.out.println("Enter first number: ");
		int c=sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println(a+": is largest number");
		}else if (b>a &&b>c) {
			System.out.println(b+": is largest number");
		}else {
			System.out.println(c+" : is largest number");
		}
	}

}
