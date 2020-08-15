package JavaQuations3;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//121
		
		int num=121;
		int rev=0;
		int actualNum=num;
		while (num!=0) {
			int n= num%10;
			
			rev= rev*10+n;
			
			num=num/10;	
		}
		System.out.println(rev);
		if (actualNum==rev) {
			System.out.println(actualNum+" :is a pallindrome number");
		} else {
			System.out.println(actualNum+" :is not a pallindrome number");
		}
		
		
	}

}
