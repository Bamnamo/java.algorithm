package chapter15;

import java.util.Arrays;
import java.util.Scanner;

public class NumOfMid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int[] arr = new int[3];
        String[] numArr=num.split(" ");
        arr[0]=Integer.parseInt(numArr[0]);
        arr[1]=Integer.parseInt(numArr[1]);
        arr[2]=Integer.parseInt(numArr[2]);
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}

