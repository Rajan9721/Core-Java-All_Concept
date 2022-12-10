package Java_Tutorials;

public class JumpInLoops {
    public static void main(String[] args){
        System.out.println("Example of Break ");
        for(int n = 1; n <=10; n++){
            if(n == 5){
                break;
            }
            System.out.print(n +" ");
        }
        System.out.println();
        System.out.println("Example of continue");
        for(int n = 1; n <=10; n++){
            if(n == 5){
                continue;
            }
            System.out.print(n +" ");
        }
    }
}
