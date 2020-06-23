package chapter04;

public class Ex04 {
	private int max;
	private int num;
	private int[] que;

	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {
		}
	}

	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {
		}
	}

	public Ex04(int capactiy) {
		num = 0;
		max = capactiy;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

}
