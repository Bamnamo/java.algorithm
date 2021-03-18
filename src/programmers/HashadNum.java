package programmers;

import java.io.IOException;

public class HashadNum {
    public boolean solution(int n) throws IOException {
        int sum = 0;
        int a = n;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
        }
        if (n % sum == 0) {
            return true;
        } else
            return false;
    }
}
