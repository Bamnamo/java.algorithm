package programmers;

public class Year2016 {
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] year = new String[366];
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int wantDay = 0;

        //1월 1일이 금요일이기에 (i+5)를 하여 금요일을 시작으로 만들었다.
        for (int i = 0; i < year.length; i++) {
            year[i] = day[(i + 5) % 7];
        }

        for (int i = 0; i < a - 1; i++) {
            wantDay += month[i];
        }

        //1월 1일도 하루 지난 것으로 되어서 -1을 해야한다!
        wantDay += b - 1;

        answer = year[wantDay];

        return answer;
    }
}
