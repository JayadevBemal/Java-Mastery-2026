package Day11_Recursion;

import java.util.HashSet;
import java.util.Locale;

public class Sequence {
    public static void removeDuplicates(String str,String newStr,int i,boolean[] atoz){

        if (i == str.length()){
            System.out.println(newStr);
            return;
        }
        if (atoz[str.charAt(i)-'a']){
            removeDuplicates(str,newStr,i+1,atoz);

        }else {
            atoz[str.charAt(i)-'a'] = true;
            newStr += str.charAt(i);
            removeDuplicates(str,newStr,i+1,atoz);
        }


    }
    public static void main(String[] args) {
        boolean[] atoz = new boolean[26];

        String str = "Aabbccdd";
        removeDuplicates(str.toLowerCase(),"",0,atoz);
    }
}
