package programmers;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrDivsorSort {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) a1.add(arr[i]);
        }
        if (a1.isEmpty()) {
            a1.add(-1);
        }
        answer = new int[a1.size()];

        for (int i = 0; i < a1.size(); i++) {
            answer[i] = a1.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
