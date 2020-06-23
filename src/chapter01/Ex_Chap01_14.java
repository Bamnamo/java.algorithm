package chapter01;

import java.util.Scanner;

public class Ex_Chap01_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("정사각형");
		do {
			System.out.print("단수는:");
			n = stdIn.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				System.out.print('*');
			System.out.println();
		}

	}

}
