package chapter07;

public class IntSet {
	private int max;
	private int num;
	private int[] set;

	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public int indexOf(int n) {
		int pl = 0;
		int pr = 0;
		do {
			int pc = (pl + pr) / 2;
			if (set[pc] == n)
				return pc;
			else if (set[pc] < n)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);
		return -pl - 1;
	}

	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}

	public boolean add(int n) {
		if (num >= max || contains(n) == true)
			return false;
		else {
			set[num++] = n;
			return true;
		}
	}

	public boolean remove(int n) {
		int idx;

		if (num <= 0 || (idx = indexOf(n)) == -1)
			return false;
		else {
			set[idx] = set[--num];
			return true;
		}
	}

	public void copyTo(IntSet s) {
		int n = (s.max < num) ? s.max : num;
		for (int i = 0; i < n; i++)
			set[i] = s.set[i];
		s.num = n;
	}

	public void copyFrom(IntSet s) {
		int n = (max < s.max) ? max : s.num;
		for (int i = 0; i < n; i++)
			set[i] = s.set[i];
		num = n;
	}

	public boolean equalsTo(IntSet s) {
		if (num != s.num)
			return false;

		for (int i = 0; i < num; i++) {
			int j = 0;
			for (; j < s.num; j++)
				if (set[i] == s.set[j])
					break;
			if (j == s.num)
				return false;
		}
		return true;
	}

	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);
		for (int i = 0; i < s2.num; i++)
			add(s2.set[i]);
	}

	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for (int i = 0; i < num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}

//--------------Ex01----------------------
	public boolean isEmpty() {
		return num == 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void clear() {
		num = 0;
	}

//--------------Ex02----------------------
	public boolean add(IntSet s) {
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (add(set[i]) == true)
				flag = true;
		return false;
	}

	public boolean retain(IntSet s) {
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		return false;
	}

	public boolean remove(IntSet s) {
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}

//--------------Ex03----------------------
	public boolean isSubsetOf(IntSet s) {
		for (int i = 0; i < num; i++) {
			int j = 0;
			for (; j < s.num; j++)
				if (set[j] == s.set[j])
					break;
			if (j == s.num)
				return false;
		}
		return true;
	}

	public boolean isProperSubsetOf(IntSet s) {
		if (num >= s.num)
			return false;
		return s.isSubsetOf(s);
	}

//--------------Ex04----------------------
	public void intersectionOf(IntSet s1, IntSet s2) {
		clear();
		for (int i = 0; i < s1.num; i++)
			if (s2.contains(s1.set[i]))
				add(s1.set[i]);
	}

	public void differenceOf(IntSet s1, IntSet s2) {
		clear();
		for (int i = 0; i < s1.num; i++)
			if (!s2.contains(s1.set[i]))
				add(s1.set[i]);
	}

}
