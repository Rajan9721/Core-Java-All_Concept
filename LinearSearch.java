import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        System.out.println("Enter the array element: ");
        for(int i = 0; i<size; i++){
            num[i] =sc.nextInt();
        }
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0; i<size; i++){
            if(num[i]==x){
                System.out.println("x is found at position= "+(i+1));
            }
        }
    }
}
