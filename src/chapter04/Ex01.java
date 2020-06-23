package chapter04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		InStack s = new InStack(64);

		while (true) {
			System.out.println("현재 데이터 수:" + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크" + "(4)검색 (5)비움" + "(6)정보 표시 (7)덤프 (0)종료 :");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {

			case 1:
				System.out.print("데이터:");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch (InStack.OverflowInStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (InStack.EmptyInStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (InStack.OverflowInStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 4:
				System.out.print("찾는 데이터:");
				x = stdIn.nextInt();
				int n = s.indexOf(x);
				if (n >= 0)
					System.out.println("꼭대기 부터 " + (s.size() - n) + "번 에 있습니다.");
				else
					System.out.println("그 데이터가 없습니다.");
				break;

			case 5:
				s.clear();
				break;

			case 6:
				System.out.println("용량:" + s.capacity());
				System.out.println("데이터 수:" + s.size());
				System.out.println("비어 " + (s.isEmpty() ? "있습니다" : "있지 않습니다."));
				System.out.println("가득 " + (s.isFull() ? "있습니다" : "있지 않습니다."));
				break;

			case 7:
				s.dump();
				break;
			}
		}
	}

}
