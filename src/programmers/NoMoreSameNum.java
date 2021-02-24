package programmers;

import java.util.ArrayList;

public class NoMoreSameNum {
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                if(i==arr.length-2) {

                    temp.add(arr[i+1]);
                }
                continue;
            }else{
                temp.add(arr[i]);
                if(i==arr.length-2) {

                    temp.add(arr[i+1]);
                }
            }
        }
        answer = new int[temp.size()];
        for(int i =0; i<temp.size();i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
