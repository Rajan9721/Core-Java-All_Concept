package OOPS_Concept;

public class StaticBlockEx {

    public static void main(String args[]){
        System.out.println("Hello main");
    }
    {
        System.out.println("static block is invoked"); // 1st Static block is invoked then main method is invoked
    }

}
