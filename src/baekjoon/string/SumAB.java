package baekjoon.string;

public class SumAB {
    public long solution(int a, int b) {
        long answer = 0;
        long total = 0;
        if (a > b) {
            int tmp = 0;
            tmp = a;
            a = b;
            b = tmp;
        }
        for (int start = a; start <= b; start++) {
            total += start;
        }
        return total;
    }
}
