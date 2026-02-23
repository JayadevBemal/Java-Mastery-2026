package Day11_Recursion;

public class practice {
    public static void sorting(String str,int id){

        if(id == str.length()-1){
            System.out.println("sorted");
            return;
        }
        char current = str.charAt(id);
        if (str.charAt(id) < str.charAt(id+1)){
            sorting(str,id+1);
        }else {
            System.out.println("not sorted");
        }
    }

    public static void main(String[] args) {

        sorting("12945",0);
    }
}
