package Day11_Recursion;

public class practiceCombination {
    public static String[] letters = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;

    public static void printCombination(String number,int id,String newstr){

        if (id == number.length()){
            System.out.println(newstr);
            return;
        }
        char current = number.charAt(id);
     printCombination(number,id+1,newstr);
     printCombination(number,id+1,newstr+current);


    }
    public static void main(String[] args) {


        String number = "1234";
        printCombination(number,0,"");
    }
}
