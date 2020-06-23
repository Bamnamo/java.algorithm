package chapter01;

import java.util.Scanner;

public class Ex_Chap01_15 {

	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

	static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++)
				System.out.print(' ');

			for (int j = 1; j <= n - i + 1; j++)
				System.out.print('*');
			System.out.println();
		}

	}

	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');

			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("삼각형 출력");

		do {
			System.out.printf("단수는:");
			n = stdIn.nextInt();
		} while (n <= 0);

		System.out.println("왼쪽 아래 직각인 삼각형");
		triangleLB(n);
		System.out.println("왼쪽 위 직각인 삼각형");
		triangleLU(n);
		System.out.println("오른쪽 아래 직각인 삼각형");
		triangleRB(n);
		System.out.println("오른쪽 위 직각인 삼각형");
		triangleRU(n);
	}
}
