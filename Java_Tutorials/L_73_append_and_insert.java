package Java_Tutorials;

public class L_73_append_and_insert {
    public static void main(String[] args){

        StringBuffer str = new StringBuffer("rn638600@gmail");
        System.out.println("String are: = "+str);

        // append()
        str.append(".com");
        System.out.println("After append string is= "+str);

        // insert()
        str.insert(0,"Gmail:  ");
        System.out.println("After insert method used String is: "+str);

    }
}
