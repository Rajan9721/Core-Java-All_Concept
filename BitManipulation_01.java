import java.util.Scanner;

public class BitManipulation_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int pos = 3;
        int Bit_mask = 1<<pos;
        if((Bit_mask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was One");
        }
    }
}
