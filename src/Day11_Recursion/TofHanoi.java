package Day11_Recursion;

public class TofHanoi {

    public static void Hanoi(int n,String s,String h,String d){
        if (n == 1){
            System.out.println("move from "+ s + " to "+d);
            return;
        }

        Hanoi(n-1,s,d,h);
        System.out.println("move from "+ s + " to "+d);
        Hanoi(n-1,h,s,d);
    }

    public static void main(String[] args) {

        Hanoi(3,"s","h","d");
    }
}
