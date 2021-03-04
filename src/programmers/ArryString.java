package programmers;

public class ArryString {
    boolean solution(String str) {
        boolean answer = true;
        int cnt = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'p' || ch == 'P')
                cnt++;
            else if (ch == 'y' ||ch =='Y')
            cnt--;
        }
        if (cnt != 0)
            return false;
        return true;
    }
}
