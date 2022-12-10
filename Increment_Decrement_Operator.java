public class Increment_Decrement_Operator {
    public static void main(String[] args){
        int a = 10;
        int b;
        System.out.println("------------Post Increment------------");
        // Post Increment
        b = a++;  // (I) Use Value (II) Change value

        System.out.println(a); // Output 11
        System.out.println(b); // Output 10
        System.out.println("------------Pre Increment------------");
        int c = 10;
        int d;
        // Pre Increment
        d = ++c; // (I) Change Value , then (II) Use Value

        System.out.println("C: "+ c); // Output 11
        System.out.println("D: "+ d); // Output 11

        int r = 10;
        int s;
        System.out.println("------------Post Decrement------------");
        s = r--; // Post Decrement
        System.out.println("R: "+r); // Output 9
        System.out.println("S: "+s); // Output 10

        int p = 10;
        int q;
        System.out.println("------------Pre Decrement------------");
        q = --p; // Pre Decrement
        System.out.println("P: "+p);
        System.out.println("Q: "+q);

    }
}
