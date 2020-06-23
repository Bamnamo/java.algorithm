package chapter02;

import java.util.Scanner;
import java.util.Random;

public class Ex03 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("요소의 합을 구합니다.");

		int num = rand.nextInt(10);

		int[] a = new int[num];
		for (int i = 0; i < num; i++) {

			a[i] = rand.nextInt(100);
			System.out.println("a[" + i + "] :" + a[i]);
		}
		System.out.println("전 요소의 합은" + sumOf(a) + "입니다.");
	}

}
