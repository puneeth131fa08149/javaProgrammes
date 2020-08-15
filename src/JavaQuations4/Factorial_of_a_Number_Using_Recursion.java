package JavaQuations4;

public class Factorial_of_a_Number_Using_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiplyNum(5));
		System.out.println(multiplyNum(3));
	}
	
	public static int multiplyNum(int num) {
		if (num!=0) {
			return num*multiplyNum(num-1);
		}else {
			return 1;
		}
	}

}
