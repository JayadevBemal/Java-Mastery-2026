package Day12_Permutation;

import java.util.ArrayList;

public class permutation {
    public static ArrayList <String> list = new ArrayList<>();
    public static void arrange(String str,String combination){

        if (str.length()==0){
            list.add(combination);
            return;
        }
        for (int i = 0; i < str.length();i++){

            char current = str.charAt(i);
            String remain = str.substring(0,i)+str.substring(i+1);

            arrange(remain,combination+current);
        }
    }
    public static void main(String[] args) {
        arrange("abc","");
        System.out.println(list);

    }
}
