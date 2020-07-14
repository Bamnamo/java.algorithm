package chapter15;




import java.io.*;

public class FastTwoNumSum {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine().trim());


        for(int i=0; i<T; i++){
            String input = br.readLine();
            String [] word = input.split(" ");
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write((a+b)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
