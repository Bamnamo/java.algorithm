package chapter08;

import java.util.Scanner;

public class EX04 {

	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtLen = txt.length();
		int patLen = pat.length();
		int[] skip = new int[Character.MAX_VALUE + 1];
		int count = 0;
		int k = -1;

		// skip 테이블 만들
		for (pt = 0; pt < Character.MAX_VALUE; pt++)
			skip[pt] = patLen;
		for (pt = 0; pt < patLen - 1; pt++)
			skip[pat.charAt(pt)] = patLen - pt - 1;

		// 검색
		while (pt < txtLen) {
			pp = patLen - 1;

			if (k == pt - pp)
				System.out.print("    ");
			else {
				System.out.printf("%2d ", pt - pp);
			}
			for (int i = 0; i < txt.length(); i++)
				System.out.print(txt.charAt(i) + " ");
			System.out.println();

			for (int i = 0; i < pt * 2 + 4; i++)
				System.out.print(" ");
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();

			for (int i = 0; i < (pt - pp) * 2 + 4; i++)
				System.out.print(" ");
			for (int i = 0; i < pat.length(); i++)
				System.out.print(pat.charAt(i) + " ");
			System.out.println();
			System.out.println();
			count++;

			while (txt.charAt(pt) == pat.charAt(pp)) {
				if (pp == 0)
					return pt;
				pp--;
				pt--;
				if (k == pt - pp)
					System.out.print("    ");
				else {
					System.out.printf("%2d ", pt - pp);
					k = pt - pp;
				}
				for (int i = 0; i < txt.length(); i++)
					System.out.print(txt.charAt(i) + " ");
				System.out.println();

				for (int i = 0; i < pt * 2 + 4; i++)
					System.out.print(" ");
				System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
				System.out.println();

				for (int i = 0; i < (pt - pp) * 2 + 4; i++)
					System.out.print(" ");
				for (int i = 0; i < pat.length(); i++)
					System.out.print(pat.charAt(i) + " ");
				System.out.println();
				System.out.println();
				count++;
			}
			pt += skip[txt.charAt(pt)];
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("텍스트:");
		String s1 = stdIn.next();

		System.out.print("패턴:");
		String s2 = stdIn.next();

		int idx = bmMatch(s1, s2);
		if (idx == 1)
			System.out.println("텍스트에 패턴이 없습니다.");
		else {
			int len = 0;
			for (int i = 0; i < idx; i++)
				len += s1.substring(i, i + 1).getBytes().length;
			len += s2.length();

			System.out.println((idx + 1) + "번째 문자부터 일치합니다");
			System.out.println("텍스트:" + s1);
			System.out.printf(String.format("패턴:%%%ds\n", len), s2);

		}
	}

}
