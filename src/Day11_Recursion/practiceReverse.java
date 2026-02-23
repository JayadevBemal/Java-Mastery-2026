package Day11_Recursion;

public class practiceReverse {
    public static void reverseString(String str,int id){

        if (id == str.length()-1){
            System.out.println(str.charAt(id));
            return;
        }

        reverseString(str,id+1);
        System.out.println(str.charAt(id));
    }
    public static void main(String[] args) {

        reverseString("12345",0);
    }
}
