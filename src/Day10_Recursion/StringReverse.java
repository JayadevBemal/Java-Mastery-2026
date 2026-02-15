package Day10_Recursion;

public class StringReverse {

    public static void printReverse(String s,int n){

        if (n == 0){
            System.out.println(s.charAt(n));
            return ;
        }

        System.out.println(s.charAt(n));
         printReverse(s,n-1);
    }
    public static void main(String[] args) {

        String s = "hero";
    printReverse(s,s.length()-1);
    }
}
