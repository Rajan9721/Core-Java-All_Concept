package method_overloading;

public class TypeMatchingFound {
    void sum(int a, int b){
        System.out.println("First sum() method");
        System.out.println(a+b);
    }
    void sum(long a, long b){
        System.out.println("Second sum method()");
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        TypeMatchingFound ab = new TypeMatchingFound();
        ab.sum(25,30);
        ab.sum(25,30);
    }
}
