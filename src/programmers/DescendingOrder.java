package programmers;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public long solution(long n) {
        long answer = 0;

        String[] arr = ("" + n).split("");
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        answer = Long.parseLong(String.join("", arr));

        return answer;
    }
}
