package Java_Tutorials;
class Message1{
    int num;
    void message(){
        System.out.println("Super class Number is: "+num);
    }
}
class Message2 extends Message1{
    int num;
    Message2(int a, int b){
        super.num = a;
        num = b;
    }
    void message(){
        System.out.println("Sub class number is: "+num);
    }
    void display(){
        super.message();
        message();
    }
}
class MainMessage {
    public static void main(String[] args){
        Message2 obj = new Message2(100,200);
        obj.display();
    }
}
