package chapter02;

import java.util.Scanner;

public class Ex11 {
	int y;
	int m;
	int d;

	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 30, 30, 31 },
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 30, 30, 31 } };

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	Ex11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	Ex11 after(int n) {
		Ex11 temp = new Ex11(this.y, this.m, this.d);
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}

	Ex11 before(int n) {
		Ex11 temp = new Ex11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;
		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;

			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;

		System.out.println("그 해의  경과 일수를 구합니다.");

		System.out.print("년:");
		int year = stdIn.nextInt();
		System.out.print("월:");
		int month = stdIn.nextInt();
		System.out.print("일:");
		int day = stdIn.nextInt();
		
		Ex11 date = new Ex11(year, month, day);

		System.out.println("몇 일 앞/뒤의 날짜를 구할까요?: ");
		int n = stdIn.nextInt();

		Ex11 d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일 입니다\n", n, d1.y, d1.m, d1.d);

		Ex11 d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일 입니다\n", n, d2.y, d2.m, d2.d);

	}

}