package Day11_Recursion;

public class PractiseTOH {
    public static void towerOfHanoi(int n ,String src,String help,String dst){

        if (n == 1){
            System.out.println("move "+src+" to "+ dst);
            return;
        }
        towerOfHanoi(n-1,src,dst,help);
        System.out.println("move "+src+" to "+ dst);
        towerOfHanoi(n-1,help,src,dst);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"S","H","D");
    }
}
