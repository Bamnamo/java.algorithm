package chapter15;

import java.util.Scanner;

public class XdownN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        int[] b = new int[n];
        for(int i =0; i<b.length; i++){
            b[i] = sc.nextInt();
        }
        for(int i =0; i<b.length; i++){
            if(b[i]<a){
                System.out.print(b[i]+" ");
            }
        }
    }
}
