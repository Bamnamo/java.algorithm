package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort2 {
    public String[] solution(String[] str, int n) {

        Arrays.sort(str, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);

                if (c1 == c2) {
                    return o1.compareTo(o2);
                } else
                    return c1 - c2;
            }
        });
        return str;
    }
}
