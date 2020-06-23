package chapter05;

import java.util.Scanner;

public class RecurX2 {
	static void recur(int n) {
		InStack s = new InStack(n);

		while (true) {
			if (n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}
			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요:");
		int x = stdIn.nextInt();

		recur(x);
	}
}
