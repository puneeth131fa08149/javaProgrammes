package Practice;

import java.util.Random;
import java.util.RandomAccess;

public class GenerateRandomeNumbersInGivenRange {

	public static Random number;
	public static void main(String[] args) {
		// int length = 10; 
	      //  System.out.println(geek_Password(length)); 
	    

		//Generating random integers between 0 and 50 using Random class
		System.out.println("Random integers between 0 and 50 using Random class :");
		number = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.print(number.nextInt(50)+" ");
		}System.out.println();
		//Generating random integers between 0 and 50 range using Math.random()

		System.out.println("Random integers between 0 and 50 using Math.random() :");
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random()*50)+" ");
		}

	}
	
}
