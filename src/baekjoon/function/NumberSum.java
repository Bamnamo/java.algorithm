package baekjoon.function;

public class NumberSum {
    public static void main(String[] args) {
        class Test {
            long sum(int[] a) {
                long sum = 0;
                for (int i = 0; i < a.length; i++) {
                    sum += a[i];
                }
                return sum;
            }
        }
    }
}
