package chapter03;

class Id {
	private static int counter = 0;
	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	public static int getCounter() {
		return counter;
	}
}

public class IdTester {
	public static void main(String[] args) {
		Id a = new Id(); // 아이디 1
		Id b = new Id(); // 아이디 2

		System.out.println("a의 아이디:" + a.getId());
		System.out.println("b의 아이디:" + b.getId());

		System.out.println("아이디를 부여한 갯수" + Id.getCounter());
	}

}
