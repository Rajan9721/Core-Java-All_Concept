public class ReverseString {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Rajan MCA");
        System.out.println("Given String is : "+sb);
        for(int i = 0; i<sb.length()/2; i++){
            int First = i;
            int Last = sb.length()-i-1;

            char FrontChar = sb.charAt(First);
            char BackChar = sb.charAt(Last);

            sb.setCharAt(First, BackChar);
            sb.setCharAt(Last, FrontChar);

        }
        System.out.print("Reverse String are: "+ sb);
        String sc = "Rajan Mca";
        System.out.println();
        System.out.print("Using substring method: "+sc.substring(0, 5));
        System.out.println();
        System.out.print(sc.substring(0));

    }
}
