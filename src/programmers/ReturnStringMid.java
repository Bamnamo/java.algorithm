package programmers;

import java.util.Scanner;

public class ReturnStringMid {
    public String solution(String str) {
        String answer = "";

        if (str.length() % 2 == 0) {
            answer = str.substring(str.length() / 2 - 1, str.length()/2 + 1);
        } else {
            answer = str.substring(str.length() / 2, str.length() / 2 + 1);
        }
        return answer;
    }

}
