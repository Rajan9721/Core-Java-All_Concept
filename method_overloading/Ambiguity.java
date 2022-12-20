package method_overloading;

public class Ambiguity {
    public void sum(int a, long b){
        System.out.println(a+b);
    }
    public void sum(long a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Ambiguity ab = new Ambiguity();
        ab.sum(20,25L);
    }
}
