package Practice;

public class EvenAndOddNumbersinArray {

	public static void main(String[] args) {


		int a[]= {10,7,2,5,6,3,22,88,44,42};
		int n=a.length;

		System.out.println("Enter Odd Numbers");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i]+" ");
			}
		}System.out.println();
		System.out.println("Enter Even number");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i]+" ");
			}
		}

	}

}
