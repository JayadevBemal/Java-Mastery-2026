package Day11_Recursion;

public class Occurance {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String s,char e,int i){

        if (i == s.length()){
            System.out.println("first: "+first );
            System.out.println("last: "+last );
            return;
        }
        char currChar = s.charAt(i);

        if (currChar == e){
            if (first == -1){
                first = i;
                last = i;
            }else {
                last = i;
            }
        }

        findOccurance(s,e,i+1);



    }
    public static void main(String[] args) {

        int i = 0;
        findOccurance("afghanistan",'h',i);
    }
}
