package Java_Tutorials;
public class Static_Method {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args){
        int res = Static_Method.cube(5);
        System.out.println("Cube is: "+res);
    }
}
