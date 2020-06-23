package chapter01;
import java.util.Scanner;

public class EX_Chap01_08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값:");
		int n = stdIn.nextInt();
		
		int sum = (n+1)*(n/2)+(n%2==1?(n+1)/2:0);
		System.out.println("1부터"+n+"까지의 합은"+sum+"입니다.");
		
	}

}
