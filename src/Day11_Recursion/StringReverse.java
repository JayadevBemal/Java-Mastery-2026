package Day11_Recursion;

public class StringReverse {
    public static void Reverse(String s,int n){

        if (n == s.length()){
            System.out.println(s.charAt(0));
            return;
        }

        System.out.println(s.charAt(s.length()-n));
        Reverse(s,n+1);
    }
    public static void main(String[] args) {

        Reverse("Bhubaneswar",1);
    }
}
