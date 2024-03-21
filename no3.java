
package praktikum3;

import java.util.Scanner;
import java.util.Stack;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sc = input.nextLine();
        Stack mystack = new Stack();
        for (char c :sc.toCharArray()) {
            mystack.push(""+c);
            
        }
       
        while(!mystack.isEmpty()){
            System.out.print(mystack.pop());
        }
        System.out.println();
    }
}
