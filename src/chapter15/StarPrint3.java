package chapter15;

import java.util.Scanner;

public class StarPrint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {       //n 번째 행에는 n개의 별이 출력
            for (int j = 0; j < i; j++) {    //i 번째 행에는 i개 만큼 출력
                System.out.print("*");
            }
            System.out.println();            // 각 행의 출력이 끝나면 줄바꿈
        }

        for (int i = n - 1; i > 0; i--) {    // n+1 행의 별의 개수는 N-1 개가 되고, N+2 행의 별의 개수는 N-2 개가 된다.
                                             // 즉 앞선 for문이 끝나고 새로 시작되는 for문을 i 행이라 할 때, i 의 첫 행은 N-1 이 된다.
            for (int j = 0; j < i; j++) {    // i 자체가 행의 별을 개수가 되기 때문에 이중 for문을 통해 i의 값 만큼 반복 출력
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
