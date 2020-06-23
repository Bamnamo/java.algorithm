package chapter06;

import java.util.Scanner;

public class Ex11 {

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void quickSort(int[] a, int left, int right) {
		InStack lstack = new InStack(right - left + 1);
		InStack rstack = new InStack(right - left + 1);

		lstack.push(left);
		rstack.push(right);
		System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, right);
		System.out.print("Lstack:");
		lstack.dump();
		System.out.print("Rstack:");
		rstack.dump();

		while (lstack.isEmpty() != true) {
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];
			System.out.printf("스택에서 분할하는 문제를 꺼냈습니다.a[%d]~a[%d]를 분할합니다.\n", left, right);

			do {
				while (a[pl] < x)
					pl++;
				while (a[pr] > x)
					pr--;
				if (pl <= pr)
					swap(a, pl++, pr--);
			} while (pl <= pr);

			if (left < pr) {
				lstack.push(left);
				rstack.push(pr);
				System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", left, pr);
				System.out.print("Lstack:");
				lstack.dump();
				System.out.print("Rstack:");
				rstack.dump();
			}
			if (pl < right) {
				lstack.push(pl);
				rstack.push(right);
				System.out.printf("a[%d]~a[%d]를 분할하는 문제를 스택에 푸시합니다.\n", pl, right);
				System.out.print("Lstack:");
				lstack.dump();
				System.out.print("Rstack:");
				rstack.dump();
			}
		}
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
