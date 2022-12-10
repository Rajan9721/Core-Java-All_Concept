package Recursion1;

public class Factorial {
    public static int printFact(int n){
        if(n == 1 || n == 0 ){
            return 1;
        }

        int cal_fact = printFact(n-1);
        int fact = n * cal_fact;
        return fact;
    }
    public static void main(String[] args){
        int n = 7;
        int ans = printFact(n);
        System.out.println("Factorial of "+n+" is: "+ans);
    }
}
