package Day11_Recursion;

public class practiceKeypad {
    public static void printCombination (String str,int id,String[] keys,String newstr){

        if (id == str.length()){
            System.out.println(newstr);
            return;
        }

        char currentInt = str.charAt(id);
        String currentString = keys[currentInt - '0'];



        for (int i = 0;i < currentString.length();i++){
            printCombination(str,id+1,keys,newstr+currentString.charAt(i));
        }
    }
    public static void main(String[] args) {
        String[] keys = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printCombination("23",0,keys,"");
    }
}
