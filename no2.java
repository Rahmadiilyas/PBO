

import java.util.LinkedList;
import java.util.Queue;


public class no2 {

    public static void main(String[] args) {
        Queue<Double> data = new LinkedList<>();

        data.offer(91.35);
        data.offer(4.72);
        data.offer(26.0);
        data.offer(3.5);
        data.offer(8.0);
        data.offer(61.0);
        data.offer(65.36);
        data.offer(12.0);
        data.offer(5.6);
        data.offer(7.11);
        data.offer(27.0);
        data.offer(9.53);
        data.offer(549.0);
        data.offer(2.23);
        data.offer(4.25);
        data.offer(2.13);
        data.offer(83.0);
        data.offer(7.0);
        data.offer(102.4);
        data.offer(53.21);
        data.offer(3.42);
        data.offer(0.21);
        data.offer(70.02);
        data.offer(819.4);
        data.offer(6173.0);
        data.offer(4.25);
        data.offer(19.8);
        data.offer(17.35);
        data.offer(5.768);

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double sum = 0;
       
        int size = data.size(); 

        while (!data.isEmpty()) {
            double value = data.poll();
           
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
            sum += value;
        }

        double average = sum / size; 

        System.out.println("Min     : " + min);
        System.out.println("Max     : " + max);
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
    }
}
