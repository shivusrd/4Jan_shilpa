package array_programs;

import java.util.Scanner;

public class Minimum_no {

	public void getminimum() {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the 5 numbers");
		for (int i = 0; i <= 4; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0];
		for (int j = 0; j <= 4; j++) {
			if (a[j] < min) {
				min = a[j];
			}
		}
		System.out.println("the lowest no of your inputs is -  "+min);
	}

	public static void main(String[] args) {
		Minimum_no ob = new Minimum_no();
		ob.getminimum();

	}
}
