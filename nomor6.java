package praktikum4;
import java.util.Scanner;
public class no6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        int n = input.nextInt();
        no6 program = new no6();
        
        System.out.println("Bilangan Fibonacci ke-" + n + " adalah: " + program.fibonacci(n));

            
        
        
    }

    // Method rekursif untuk menghitung bilangan Fibonacci ke-n
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
