package programmers;

public class Str1 {
    public String solution(String s) {
        String answer = "";

        String str[] = s.split("");
        String space = " ";
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(space)) {
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    cnt++;
                    str[i] = str[i].toUpperCase();
                } else {
                    cnt++;
                    str[i] = str[i].toLowerCase();
                }
            }
            answer += str[i];
        }
        System.out.println(answer);
        return answer;
    }
}
