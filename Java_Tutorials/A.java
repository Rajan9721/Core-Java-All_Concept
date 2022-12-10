package Java_Tutorials;

interface A {
    int roll = 101;
    void display1();
}
interface B{
    void display2();
}
class C implements A , B{
    public void display1(){
        System.out.println("Interface A");
        System.out.println("Roll No. : "+roll);
    }
    public void display2(){
        System.out.println("Interface B");
    }
    public static void main(String[] args){
        C obj = new C();
        obj.display1();
        obj.display2();
    }
}