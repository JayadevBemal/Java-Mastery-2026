package Day13_AdvancedRecursion;

public class printNoOfWays {

    public static int noOfWays(int a ,int b,int m ,int n){

        if( a == m || b == n){
            return 0;
        }
        if(a == m-1 && b == n-1){
            return 1;
        }

        int down = noOfWays(a+1,b,m,n);
        int right = noOfWays(a,b+1,m,n);

        return down+right;
    }
    public static void main(String[] args) {

        System.out.println(noOfWays(0,0,3,3) );
    }
}
