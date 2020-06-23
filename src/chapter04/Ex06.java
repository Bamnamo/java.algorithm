package chapter04;

public class Ex06 {
	public static class Gqueue<E> {
		private int max;
		private int num;
		private int front;
		private int rear;
		private E[] que;

		public static class EmptyGqueueException extends RuntimeException {
			public EmptyGqueueException() {
			}
		}

		public static class OverGqueueException extends RuntimeException {
			public OverGqueueException() {
			}
		}

		public void Ex06(int capacity) {
			num = front = rear = 0;
			max = capacity;
			try {
				que = (E[]) new Object[max];
			} catch (OutOfMemoryError e) {
				max = 0;
			}
		}

		public E enque(E x) throws OverGqueueException {
			if (num >= max)
				throw new OverGqueueException();
			que[rear++] = x;
			num++;
			if (rear == max)
				rear = 0;
			return x;
		}

		public E deque(E x) throws EmptyGqueueException {
			if (num <= 0)
				throw new EmptyGqueueException();
			que[front--] = x;
			num--;
			if (front == max)
				front = 0;
			return x;
		}

		public E peek() throws EmptyGqueueException {
			if (num <= 0)
				throw new EmptyGqueueException();
			return que[front];
		}

		public int indexOf(E x) {
			for (int i = 0; i < num; i++)
				if (que[(i + front) % max] == x)
					return i + front;
			return -1;
		}

		public int search(E x) {
			for (int i = 0; i < num; i++)
				if (que[(i + front) % max].equals(x))
					return i + 1;
			return -1;
		}

		public void clear() {
			num = front = rear = 0;
		}

		public int capacity() {
			return max;
		}

		public int size() {
			return num;
		}

		public boolean isEmpty() {
			return num <= 0;
		}

		public boolean isFull() {
			return num >= max;
		}

		public void dump() {
			if (num <= 0)
				System.out.println("큐가 비었습니다.");
			else {
				for (int i = 0; i < num; i++)
					System.out.println(que[(i + front) % max].toString() + " ");
				System.out.println();
			}
		}

	}

}
