package chapter01;

import java.util.Scanner;;

public class Ex_Chap01_11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n;
		do {
			System.out.print("정수값:");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int no = 0;
		while (n > 0) {
			n /= 10;
			no++;
		
		
		System.out.println(no);
		}

		System.out.println("그 수는" + no + "자리 입니다.");

	}

}
