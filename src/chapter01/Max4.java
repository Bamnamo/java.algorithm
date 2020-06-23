package chapter01;

import java.util.Scanner;

public class Max4 {
	static int max4(int a, int b, int c, int d) {
	int max = a;
	if (b > max)
		max = b;
	if (c > max)
		max = c;
	if (d > max)
		max = d;
	
	return max;
	}
	
	public static void main(String[]args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	int a = stdIn.nextInt();
		System.out.print("b의 값：");	int b = stdIn.nextInt();
		System.out.print("c의 값：");	int c = stdIn.nextInt();
		System.out.print("d의 값：");	int d = stdIn.nextInt();
		
		int max = max4(a, b, c, d);
		
		System.out.println("최대값은" + max + "입니다.");
	}

}
