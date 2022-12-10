package Java_Tutorials;
public class StaticMethodEx2 {
    static int Cube(int x){
        return x*x*x;
    }
}

class Result{
    public static void main(String[] args){
        int res = StaticMethodEx2.Cube(6);
        System.out.println("Result is: "+res);
    }
}