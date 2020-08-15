package JavaQuations;

public class FactrioalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5!=5*4*3*2*1=120
		
		int num=5;
		getFact(num);
//		int fact=1;
//		
//		for (int i = 1; i <= num; i++) {
//			fact=fact*i;
//		}
//		System.out.println("factariol is: "+num+" is: "+fact);
	}
public static void getFact(int num) {
	int fact=1;
	
	for (int i = 1; i <= num; i++) {
		fact=fact*i;
	}
	System.out.println("factariol is: "+num+" is: "+fact);
}
}
