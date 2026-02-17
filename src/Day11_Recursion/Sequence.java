package Day11_Recursion;

import java.util.HashSet;

public class Sequence {
    public static void removeDuplicates(String s, int i , String str,HashSet<String> set){
        if (i == s.length()){
           if (set.contains(str) ){
               return;
           }else {
               System.out.println(str);
               set.add(str);
               return;
           }
        }

        char current = s.charAt(i);
        removeDuplicates(s,i+1,str+current,set);
        removeDuplicates(s,i+1,str,set);
    }

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        removeDuplicates("aabb",0,"",set);
    }
}
