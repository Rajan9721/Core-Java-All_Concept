package Arrays;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int cols = sc.nextInt();
        int numbers[][] = new int[row][cols];

        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Result is:");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
