package Day11_Recursion;

public class Keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void keypadCombination(String str,int i,String combination){

        if (i == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(i);
        String choice = keypad[currChar - '0'];

        for (int j = 0 ; j < choice.length();j++){
            keypadCombination(str,i+1,combination+choice.charAt(j));
        }



    }
    public static void main(String[] args) {

        keypadCombination("025",0,"");

    }
}
