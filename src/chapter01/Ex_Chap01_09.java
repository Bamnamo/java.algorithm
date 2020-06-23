package chapter01;

import java.util.Scanner;

public class Ex_Chap01_09 {
	static int sumof(int a, int b) {
		int sum = 0;
		if (a < b) {
			int temp=a;
			a=b;
			b=temp;	
	}
		for(int i=a; i<=b; i++) {
			sum +=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값：");
		int a = stdIn.nextInt();
		System.out.print("b의 값：");
		int b = stdIn.nextInt();

		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
	}

}
