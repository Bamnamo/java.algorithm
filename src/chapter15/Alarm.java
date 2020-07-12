package chapter15;

import java.util.Scanner;

public class Alarm {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b<45){
            a--;
            b= 60-(45-b);
            if(a<0){
                a=23;
            }
            System.out.println(a+" "+b);
        }
        else{
            System.out.println(a+" "+(b-45));
        }
    }
}
