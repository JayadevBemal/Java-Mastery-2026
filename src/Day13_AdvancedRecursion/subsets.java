package Day13_AdvancedRecursion;

import java.util.ArrayList;

public class subsets {
    public static void printSubsets(int n, ArrayList<Integer> subsets){

        if (n == 0){
            System.out.println(subsets);
            return;
        }

        subsets.add(n);
        printSubsets(n-1, subsets);

        subsets.remove(subsets.size()-1);
        printSubsets(n-1,subsets);
    }
    public static void main(String[] args) {

        ArrayList<Integer> subsets = new ArrayList<>();
        printSubsets(4,subsets);
    }
}
