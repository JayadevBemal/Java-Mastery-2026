package Day11_Recursion;

public class practiceOccurances {
    public static void occurAt(String str,char element,int id,int first,int last){

        if (id == str.length()-1){
            System.out.println(first + " and "+last);
            return;
        }

        char current = str.charAt(id);
        if (current == element){
            if (first == 0){
                first = id;
                last = id;
                occurAt(str,element,id+1,first,last);
            }else {
                last = id;
                occurAt(str,element,id+1,first,last);
            }
        }else {
            occurAt(str,element,id+1,first,last);
        }
    }
    public static void main(String[] args) {


        occurAt("jagannath",'a',0,0,0);
    }
}
