package JavaQuations3;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong(153);

	}
	public static void armstrong(int num) {
		int cube=0,r,t;
		t=num;
		while (num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);			
		}
		if (t==cube) {
			System.out.println(t+" is Armstrong number");
		} else {
			System.out.println(t+" is not a Armstrong number");
		}

	}
}
