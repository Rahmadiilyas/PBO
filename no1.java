package praktikum3;

import java.util.Stack;

public class no1 {

    public static void main(String[] args) {
        Stack<Double> data = new Stack<>();
        double[] nilai = {91.35, 4.72, 26.0, 3.5, 8.0, 61.0, 65.36, 12.0, 5.6, 7.11,
            27.0, 9.53, 549.0, 2.23, 17.31, 4.25, 2.13, 83.0, 7.0, 102.4,
            53.21, 3.42, 0.21, 70.02, 819.4, 6173.0, 4.25, 19.8, 17.35, 5.768};

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < nilai.length; i++) {
            data.push(nilai[i]);

        }
        for (double value : data) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            sum += value;

        }
        double average = sum / data.size();

        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
