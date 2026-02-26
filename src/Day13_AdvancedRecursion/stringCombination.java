package Day13_AdvancedRecursion;

public class stringCombination {

    public static void printCombination(String str,String combination){

        if (str.length() == 0){
            System.out.println(combination);
            return;
        }
        for (int i = 0;i < str.length();i++){
            char currChar = str.charAt(i);
            String remain = str.substring(0,i)+str.substring(i+1);

            printCombination(remain,combination+currChar);

        }
    }
    public static void main(String[] args) {

        printCombination("1234","");
    }
}
