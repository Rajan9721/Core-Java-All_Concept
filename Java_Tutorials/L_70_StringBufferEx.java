package Java_Tutorials;

public class L_70_StringBufferEx {
    public static void main(String[] args){

        /*Java StringBuffer class is used to create mutable (modifiable) String objects.
        The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
         */



        StringBuffer s1 = new StringBuffer();

        System.out.println("S1 length = "+s1.length());
        /*By_default StringBuffer capacity is 16
        when we add other string its capacity increase
         */
        System.out.println("S1 Capacity = "+ s1.capacity());

        StringBuffer s2 = new StringBuffer(10);
        System.out.println("S2 length = "+s2.length());
        System.out.println("S2 capacity = "+ s2.capacity());

        StringBuffer s3 = new StringBuffer("Java");
        System.out.println("S3 length = "+s3.length());
        System.out.println("S3 capacity = "+ s3.capacity());

// Important methods of StringBuffer class:

// append();

        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

// insert()

        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);

// delete().

        StringBuffer sb1=new StringBuffer("Hello");
        sb1.delete(1,3);
        System.out.println(sb1);

// replace()

        StringBuffer sb3=new StringBuffer("Hello");
        sb3.replace(1,3,"Java");
        System.out.println(sb3);//prints HJavalo

// reverse()

        StringBuffer sb4=new StringBuffer("Hello");
        sb4.reverse();
        System.out.println(sb4);//prints olleH

    }
}
