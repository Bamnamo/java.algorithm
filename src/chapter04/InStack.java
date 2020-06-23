package chapter04;

public class InStack {
	private int max;
	private int ptr;
	private int[] stk;

	public class EmptyInStackException extends RuntimeException {
		public EmptyInStackException() {
		}
	}

	public class OverflowInStackException extends RuntimeException {
		public OverflowInStackException() {
		}
	}

	public InStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int push(int x) throws OverflowInStackException {
		if (ptr >= max)
			throw new OverflowInStackException();
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyInStackException {
		if (ptr <= 0)
			throw new EmptyInStackException();
		return stk[--ptr];
	}

	public int peek() throws EmptyInStackException {
		if (ptr <= 0)
			throw new EmptyInStackException();
		return stk[ptr - 1];
	}

	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--)
			if (stk[i] == x)
				return i;
		return -1;
	}

	public void clear() {
		ptr = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return ptr;
	}

	public boolean isEmpty() {
		return ptr <= 0;
	}

	public boolean isFull() {
		return ptr >= max;
	}

	public void dump() {
		if (ptr <= 0)
			System.out.println("스택이 비었습니다.");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}

}
