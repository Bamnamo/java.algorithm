package chapter06;

import java.util.Scanner;

public class Ex14_1 {

	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b <= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void insertionSort(int[] a, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int j;
			int tmp = a[i];
			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	static void quickSort(int[] a, int left, int right) {
		if (right - left < 9)
			insertionSort(a, left, right);

		int pl = left;
		int pr = right;
		int x = med3(a[pl], a[(pl + pr) / 2], a[pr]);

		System.out.printf("a[%d]~a[%d]:{", left, right);
		for (int i = left; i < right; i++)
			System.out.printf("%d , ", a[i]);
		System.out.printf("%d}\n", a[right]);

		do {
			while (a[pl] < x)
				pl++;
			while (a[pr] > x)
				pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (pl - left < right - pl) {
			int temp;
			temp = left;
			left = pl;
			pl = temp;
			temp = right;
			right = pr;
			pr = temp;
		}

		if (left < pr)
			quickSort(a, left, pr);
		if (pl < right)
			quickSort(a, pl, right);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("퀵정렬");
		System.out.print("요솟수:");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		quickSort(x, 0, nx - 1);

		System.out.println("오름차순으로 정렬 했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]= " + x[i]);

	}

}
