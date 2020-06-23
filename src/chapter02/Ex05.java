package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
	static void recopy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for (int i = 0; i < num; i++)
			a[i] = b[b.length-i-1];
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("a의 요솟수는:");
		int numa = rand.nextInt(10);
		int[] a = new int[numa];
		for (int i = 0; i < numa; i++) {
			a[i] = rand.nextInt(30);
			System.out.println("a[" + i + "] :" + a[i]);
		}

		System.out.println("b의 요솟수는:");
		int numb = rand.nextInt(10);
		int[] b = new int[numb];
		for (int i = 0; i < numb; i++) {
			b[i] = rand.nextInt(30);
			System.out.println("b[" + i + "] :" + b[i]);

		}

		recopy(a, b);
		System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 복사 했습니다.");
		for (int i = 0; i < numa; i++)
			System.out.println("a[" + i + "] :" + a[i]);
	}

}
