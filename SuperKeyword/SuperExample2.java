package SuperKeyword;

class Animal2{
    public void eat(){
        System.out.println("Eating foods");
    }
}
class Dog2 extends Animal2{
    public void eat(){
        System.out.println("Eating...");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void work(){
        super.eat();
        bark();
    }
}
public class SuperExample2 {
    public static void main(String[] args) {
        Dog2 d2 = new Dog2();
        d2.work();
    }
}
