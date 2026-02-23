package Day11_Recursion;

public class practice3 {
    public static void shiftEnd(String str,int id,int count,char element,String newstr){

        if (id == str.length()){
            for (int i = 1;i <= count;i++){
                newstr+=element;
            }
            System.out.println(newstr);
            return;
        }
        char current = str.charAt(id);
        if (current == element){

            count++;
            shiftEnd(str,id+1,count,element,newstr);
        }else {
            newstr+=current;
            shiftEnd(str,id+1,count,element,newstr);
        }
    }
    public static void main(String[] args) {

        shiftEnd("Jayadev",0,0,'a',"");

    }
}
