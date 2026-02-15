package Day10_Recursion;

public class Tvarient {

    public static void Tower(int n,String src,String hlp,String dst) {

        if (n == 1) {
            System.out.println("move "+src+" to "+hlp);
            System.out.println("move "+hlp+" to "+dst);
            return;
        }

        Tower(n-1,src,hlp,dst);
        System.out.println("move "+src+" to "+hlp);
        Tower(n-1,dst,hlp,src);
        System.out.println("move "+hlp+" to "+dst);
        Tower(n-1,src,hlp,dst);




    }

    public static void main(String[] args) {



        Tower(4,"1","2","3");

    }

}
