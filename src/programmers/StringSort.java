package programmers;

import java.util.Arrays;
import java.util.Collections;

public class StringSort {
    public String solution(String str) {
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        return str;
    }
}
