package SDET;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args) {
		System.out.println("User Enter the String");
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {


			if((s.charAt(i)==' ') &&(s.charAt(i-1)!=' ')) {
				count++;
			}
		}
		System.out.println("User recive words : "+count);
	}
}
