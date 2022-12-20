package CovariantReturnType;

class A{
   A get(){ // return type is A
      return this;
    }
}
class B extends A{
    B get(){ // return type is B
        /*there are two methods that have return types
        are different but method are overriding*/
        return this;
    }
    void message(){
        System.out.println("Welcome to covariant return type.");
    }
}

public class Example1 {
    public static void main(String[] args){
     new B().get().message();
 }
}
