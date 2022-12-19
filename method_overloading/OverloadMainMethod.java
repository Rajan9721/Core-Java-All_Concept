package method_overloading;

public class OverloadMainMethod {
    public static void main(String[] args) {
        System.out.println("Main Method with String[]");
    }

    public static void main(String args) {
        System.out.println(args);
        System.out.println("Main Method with String");
    }

    public static void main() {
        System.out.println("Main method without argument");
    }
}
