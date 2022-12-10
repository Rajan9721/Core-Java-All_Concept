package Java_Tutorials;


public class SuperClassEx1 {
    int num= 200;
}
class Ex1 extends SuperClassEx1{
    int num;
    void display(){

        System.out.println(super.num);
    }
    public static void main(String[] args){
        Ex1 obj = new Ex1();
        obj.display();
    }
}
