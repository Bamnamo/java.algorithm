package chapter01;

import java.util.Scanner;

public class Min4 {
		static int min4(int a, int b, int c, int d) {
			int min = a;
			if (b < min)
				min = b;
			if (c < min)
				min = c;
			if (d < min)
				min = d;
			
			return min;		
		}
		public static void main(String[]args) {
			Scanner stdIn = new Scanner(System.in);

			System.out.println("세 정수의 최소값을 구합니다.");
			System.out.println("a의 값： ");	int a = stdIn.nextInt();
			System.out.println("b의 값： ");	int b = stdIn.nextInt();
			System.out.println("c의 값： ");	int c = stdIn.nextInt();
			System.out.println("d의 값： ");	int d = stdIn.nextInt();
			
			
			
			int min = min4(a, b, c, d);
			
			System.out.println("최소값은" + min + "입니다.");
		}

}
