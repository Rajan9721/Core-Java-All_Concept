package Java_Tutorials;

public class L_72_delete_deleteCharAt_Ex {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("Raman");
        System.out.println("String is= "+str);
        str.delete(1,4);
        System.out.println("After delete(1,4) new string is= "+str);
        str.deleteCharAt(1);
        System.out.println("After deleteCharAt = "+str);

    }
}
