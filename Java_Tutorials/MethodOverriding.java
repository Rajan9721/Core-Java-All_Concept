package Java_Tutorials;
class Super{
    int x = 10;
    void display(){
        System.out.println("Super Value: "+x);
//        System.out.println("Hello ");
    }
}
class Sub extends Super{
    void display()// Method overriding so its not print super class display method statements
            //(Statements not executes which are written in super class display method )

    {
        int y = 20;
        System.out.println("Super Value: "+x);
        System.out.println("Sub Value: "+y);
    }
}

class MethodOverriding {
        public static void main(String[] args){
            Sub obj = new Sub();
            obj.display();
        }
}

