package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());

        for (int i = 1; i < s; i++) {
            String[] str = br.readLine().split(" ");

            int r = Integer.parseInt(str[0]);

            String y = str[1];

            for (int j = 0; j < y.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.println(y.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
