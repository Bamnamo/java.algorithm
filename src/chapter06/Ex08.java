package chapter06;

import java.util.Scanner;

public class Ex08 {

	static void insertionSort(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			int key = a[i];
			int pl = 0;
			int pr = i - 1;
			int pc;
			int pd;

			do {
				pc = (pl + pr) / 2;
				if (a[pc] == key)
					break;
				else if (a[pc] < key)
					pl = pc + 1;
				else
					pr = pc - 1;
			} while (pl <= pr);
			pd = (pl <= pr) ? pc + 1 : pr + 1;
			for (int j = i; j > pd; j--)
				a[j] = a[j - 1];
			a[pd] = key;
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 삽입 선택");
		System.out.print("요옷수:");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}

}
