package Practice;

import java.util.Random;

public class GeneratingRandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		  
        //Generating random integers using Random class
 
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Random Integers : "+random.nextInt());
        }
        System.out.println("-----------------------------");
        
        //Generating random doubles using Random class
 
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }
        System.out.println("-----------------------------");
        
        //Generating random booleans using Random class
 
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Random booleans : "+random.nextBoolean());
        }
        System.out.println("-----------------------------");
        // Generating Random Numbers Using Math.random()
        //Generating random doubles using Math.random()
   
   for(int i = 0; i < 2; i++)
   {
       System.out.println("Random Doubles : "+Math.random());
   }
	}

}
