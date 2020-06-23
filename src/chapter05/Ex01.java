package chapter05;

import java.util.Scanner;

public class Ex01 {
	static int factorialEx(int n) {
		int fact = 1;
		while (n > 1)
			fact *= n--;
		return fact;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요:");
		int x = stdIn.nextInt();

		System.out.println(x + "의 팩토리얼은" + factorialEx(x) + "입니다.");
	}

}
