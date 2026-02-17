package Day11_Recursion;

import Day04_Arrays.Array;

public class Sorted {

    public static boolean isSorted(int[] a,int i){

        if (i == a.length -1){
            return true;
        }

        if (a[i] < a[i+1]){
            return isSorted(a,i+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr,0));

    }
}
