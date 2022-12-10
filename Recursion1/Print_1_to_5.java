package Recursion1;

public class Print_1_to_5 {
    public static void printNumber(int n){
        if(n == 6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args){
        printNumber(1);
    }
}
