package SuperKeyword;

class Animal3{
    Animal3() {
        System.out.println("animal is created");
    }
}
class Dog3 extends Animal3{
    Dog3(){
//        super();
        System.out.println("dog is created");
    }
}

public class SuperExample3 {
    public static void main(String[] args) {
        Dog3 d3 = new Dog3();
    }

}
