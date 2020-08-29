package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class LeftBehind {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> h = new HashSet<Integer>();


		for (int i = 0; i < 10; i++) {
        try {
            h.add(Integer.parseInt(br.readLine()) % 42);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(h.size());
    }
}


