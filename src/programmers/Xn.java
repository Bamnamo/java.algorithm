package programmers;

public class Xn {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int val = x;

        for (int i = 0; i < n; i++) {
            answer[i] = ((long) x * (i + 1));
        }
        return answer;
    }
}
