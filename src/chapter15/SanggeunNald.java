package chapter15;

import java.util.Scanner;

public class SanggeunNald {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int burger = 2001;
        int dirnk = 2001;

        for(int i = 0; i<3; i++){
            int value = sc.nextInt();
            if(value<burger){
                burger=value;
            }
        }

        for(int i=0; i<2; i++){
            int value = sc.nextInt();
            if(value<dirnk){
                dirnk=value;
            }
        }
        System.out.println(burger+dirnk-50);
    }
}
