package chapter04;

import chapter04.IntQueue.EmptyIntAryQueueException;
import chapter04.IntQueue.OverflowIntAryQueueException;

public class Ex07 {
	private int max;
	private int front;
	private int rear;
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

	public Ex07(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int equeueFront(int x) throws OverflowIntAryQueueException {
		if (num >= max)
			throw new OverflowIntAryQueueException();
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	public int equeueRear(int x) throws OverflowIntAryQueueException {
		if (num >= max)
			throw new OverflowIntAryQueueException();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	public int dqueueFront() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	public int dqueueRear() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];
	}

	public int peekFront() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		return que[front];
	}

	public int peekRear() throws EmptyIntAryQueueException {
		if (num <= 0)
			throw new EmptyIntAryQueueException();
		return que[rear == 0 ? max - 1 : rear - 1];
	}

	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x)
				return idx;
		}
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
			System.out.println("큐가 비었습니다");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}

}
