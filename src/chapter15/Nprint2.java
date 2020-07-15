package chapter15;

import java.util.Scanner;

public class Nprint2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<=100000 || n>0)

        for (int i = n; i >0; --i) {
            System.out.println(i);
        }
    }
}

