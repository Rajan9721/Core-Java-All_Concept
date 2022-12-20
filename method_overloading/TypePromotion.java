package method_overloading;

import java.lang.reflect.Type;

public class TypePromotion {
    public static void sum(int a , char b){
        System.out.println(a+b);
    }
    public static void sum(int a , int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        TypePromotion ab = new TypePromotion();
        ab.sum(20 , 'A');
        ab.sum(15, 16);
    }
}
