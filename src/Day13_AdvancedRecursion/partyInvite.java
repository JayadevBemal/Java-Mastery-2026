package Day13_AdvancedRecursion;

public class partyInvite {
    public static int noOfWays(int n){

        if (n == 1 || n == 0){
            return 1;
        }
        if (n==2){return 2;};


        //single
       int single = noOfWays(n-1);

        //double
        int pair = (n-1)* noOfWays(n-2);//n-2 elements are chosen individually

        return single + pair;
    }

    public static void main(String[] args) {

        System.out.println(noOfWays(4));
    }
}
