package Operator;

public class UnaryOperator {
    public static void main(String args[]){
        System.out.println("Example 1");
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        System.out.println("Example 2");

        int a=15;
        int b=16;
        System.out.println(a++ + ++a);//15+17=32
        System.out.println(b++ + b++);//15+16=31

        System.out.println("Example 3");
        int r=10;
        int s=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~r);//-11 (minus of total positive value which starts from 0)
        System.out.println(~s);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
