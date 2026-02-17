package Day11_Recursion;

public class ChangePosition {
    public static void moveToEnd(int i,String s,String str,char element,int count){

        if (i == s.length()){
            for (int j =1;j <= count;j++ ){
                str += element;
            }
            System.out.println(str);
            return;
        }

       if (s.charAt(i) == element){
           count ++;
           moveToEnd(i+1,s,str,element,count);
       }else {
           str +=s.charAt(i);
           moveToEnd(i+1,s,str,element,count);
       }

    }
    public static void main(String[] args) {
        String s = "axbbcxd";
        moveToEnd(0,s,"",'x',0);
    }

}
