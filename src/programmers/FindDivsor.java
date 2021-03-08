package programmers;


public class FindDivsor {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean chek = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    chek = false;
                    break;
                }
            }
            if (chek) {
                answer++;
            }
        }
        return answer;
    }
}
