package Recursion1;

public class SumOfNaturalNumber {
    public static void sumNatural(int i, int n, int sum){
        if(i == n){
            sum += i ;
            System.out.println("Sum of "+n+" natural numbers are: "+sum);
            return;
        }
        sum = sum+i; // Or sum += i ;
        sumNatural(i+1, n , sum);

    }
    public static void main(String[] args){
        sumNatural(1 , 5, 0);
//        int n = 5, sum = 0;
//        for(int i = 1; i<=n; i++){
//            sum = sum+i;
//        }
//        System.out.println("Sum of "+n+" natural numbers are: "+sum);
    }
}
