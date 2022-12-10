package Java_Tutorials;

import java.util.Scanner;

public class Conditional_Operator {
    public static void main(String[] args) {
        // find greater value between two numbers
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        a = sc.nextInt();
        System.out.println("Enter Second number: ");
        b = sc.nextInt();
        sc.close();
        c = (a>b)? a:b; // Conditional Operator
        System.out.println("Greater value is: "+c);
    }
}
