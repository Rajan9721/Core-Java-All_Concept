package Java_Tutorials;

public class NestingMethod {
    int m, n;
    NestingMethod(int x, int y){
        m = x;
        n = y;
    }
    int largest(){
        if(m>n){
            return m;
        }
        else{
            return n;
        }
    }
    void display(){
        int ans = largest(); // Nesting of method
        // When we call a method in between another method then it is called Nesting of method.
        System.out.println("Largest Number is: "+ans);
    }
    public static void main(String[] args){
        NestingMethod obj = new NestingMethod(10, 15);
        obj.display();

    }
}
