package chapter15;

import java.util.Scanner;

public class MaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];                      // 정수 9개의 배열선언

        for (int i = 0; i < arr.length; i++) {       // 배열에 저장
            arr[i] = sc.nextInt();
        }

        int max = arr[0];                           // 기준이 될 첫번째 max 값 저장
        int index = 0;                              // 최대값의 위치를 알아낼 변수 생성

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {                    // max는 arr[0]이기 때문에 max보다 큰 값이 있으면 그 값이 max가 됨
                max = arr[i];
                index = i + 1;                     //  max가 된 값의 위치를 index에 저장
            }
        }
        System.out.println(max + "\n" + index);

    }
}
