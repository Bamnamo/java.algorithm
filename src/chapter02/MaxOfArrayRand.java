package chapter02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		return max;

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("키의 최댓값을 구합니다.");
		
		
		int num = 3+rand.nextInt(20); 

		int[] height = new int[num];

		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 150 + rand.nextInt(50);
			System.out.println("height[" + i + "] : " + height[i]);
		}
		System.out.println("최대값은 " + maxOf(height) + "입니다.");
	}

}
