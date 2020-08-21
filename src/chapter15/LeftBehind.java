package chapter15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class LeftBehind {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<Integer> h = new HashSet<Integer>();


		for (int i = 0; i < 10; i++) {
        h.add(Integer.parseInt(br.readLine()) % 42);
    }

		System.out.print(h.size());
}


