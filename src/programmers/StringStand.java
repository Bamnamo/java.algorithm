package programmers;

public class StringStand {
    public boolean solution(String str) {
        if (str.length() == 4 || str.length() == 6) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch < '0' || ch > '9')
                    return false;
            }
            return true;
        } else
            return false;
    }
}
