package chapter06;

import java.util.Scanner;

public class Ex09_2 {

	static int ShellSort2(int[] a, int n) {
		int ccnt = 0;

		int h;
		for (h = 1; h < n / 9; h = h * 3 + 1)
			;

		for (; h > 0; h /= 3)
			for (int i = h; i < n; i++) {
				int j;
				int tmp = a[i];
				for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
					ccnt++;
				}
				a[j + h] = tmp;
				ccnt++;
			}
		return ccnt;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬(버전2)");
		System.out.print("요옷수:");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}

		int ccnt = ShellSort2(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
		System.out.println("옮김 횟수는 " + ccnt + "회 했습니다.");
	}

}
