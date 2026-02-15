package Day10_Recursion;

public class ClockHanoi {
    public static void Tower(int n,String A,String B,String C){

        if (n==1){
            System.out.println("move "+A+" to "+B);
            System.out.println("move "+B+" to "+C);
            return;
        }
        Tower(n-1,A,B,C);
        System.out.println("move "+A+" to "+B);
        Tower(n-1,C,B,A);
        System.out.println("move "+B+" to "+C);
        Tower(n-1,A,B,C);
    }

    public static void main(String[] args) {

        Tower(3,"A","B","C");
    }
}
