package Java_Tutorials;


public class L_71_CharAt_setCharAt {
    public static void  main(String[] args){

        // StringBuffer
        StringBuffer str = new StringBuffer("Raman");
        System.out.println("Given string are: "+str );
        System.out.println("Character at index 0 : "+str.charAt(0));
        str.setCharAt(0,'S');
        System.out.println("New string after setCharAt(0, 'M'): "+ str);
        System.out.println("Character at index 0: "+str.charAt(0));

        // String
        String sc = "Java";
        System.out.println("Character at index of 0: "+sc.charAt(0));
    }
}
