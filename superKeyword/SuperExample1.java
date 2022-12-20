package superKeyword;



class Animal{
    String color = "White";
}
class Dog extends Animal{
    String color = "Black";
    public void getColor(){
        System.out.println(color); // Prints color of dog Class

        System.out.println(super.color); // Prints color of Animal class
    }
}
public class SuperExample1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.getColor();
    }
}
