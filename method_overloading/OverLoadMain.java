package method_overloading;

public class OverLoadMain {
    public static void main(int a)  //overloaded main method
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {

        System.out.println("main method invoked");
        main(6);
    }
}
