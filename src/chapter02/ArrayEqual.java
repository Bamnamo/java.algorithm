package chapter02;

import java.util.Random;
import java.util.Scanner;

public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("배열a의 요솟수:");
		int na = rand.nextInt(20);
		int[] a = new int[na];
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(30);
			System.out.println("a[" + i + "] :" + a[i]);

		}

		System.out.print("배열b의 요솟수:");
		int nb = rand.nextInt(20);
		int[] b = new int[nb];
		for (int i = 0; i < b.length; i++) {
			b[i] = rand.nextInt(30);
			System.out.println("b[" + i + "] :" + b[i]);
		}

		System.out.println("배열 a와b는 " + (equals(a, b) ? "같습니다." : "같지 않습니다."));
	}

}
