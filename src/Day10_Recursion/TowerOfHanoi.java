package Day10_Recursion;

public class TowerOfHanoi {

    public static void Tower(int n,String src,String hlp,String dst) {

        if (n==1){
            System.out.println("transfer "+ n +" from "+src+" to "+dst);
            return;
        }
       Tower(n-1,src,dst,hlp);
        System.out.println("transfer "+ n +" from "+src+" to "+dst);
       Tower(n-1,hlp,src,dst);
    }

    public static void main(String[] args) {



        Tower(4,"1","2","3");

    }
}
