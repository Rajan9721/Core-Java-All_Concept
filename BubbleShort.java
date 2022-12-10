public class BubbleShort {
    public static void main(String[] args){
        int[] a = {5, 6, 7, 2, 4, 1, 3};

        // Bubble sort
        for(int i = 0; i<a.length-1; i++){
            for(int j = 0; j<a.length-1-i; j++){
                if (a[j] > a[j+1]) {
                    // Swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            } // Time Complexity O(n^2)
        }
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
