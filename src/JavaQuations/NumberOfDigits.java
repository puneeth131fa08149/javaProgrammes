package JavaQuations;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 2 3 4---4
		//1 2 3--3
		
		int num=1234000;
		int count=0;
		while (num!=0) {
			num=num/10;
			++count;
		}
		System.out.println("number od digits : "+ count);
	}

}
