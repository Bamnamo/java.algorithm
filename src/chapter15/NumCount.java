package chapter15;

import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = a * b * c ;

        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int temp = result;

            while (temp != 0) {
                if (temp % 10 == arr[i]) {
                    count++;
                }
                temp /= 10;
            }
            System.out.println(count);
        }
    }
}
