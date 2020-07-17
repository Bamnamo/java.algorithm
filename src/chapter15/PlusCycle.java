package chapter15;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();

        int a = n;
        int count = 0;
        do{
            a = a%10*10+(a/10+a%10)%10;
            count++;
        }while(n !=a);
        System.out.println(count);

    }
}
