package Day11_Recursion;

public class practice2 {
public static void originalOnly(String str,int id,String newstr,boolean[] alphabet){

    if (id == str.length()){
        System.out.println(newstr);
        return;
    }

    char current = str.charAt(id);
    if (alphabet[current - 'a']){
        originalOnly(str,id+1,newstr,alphabet);
    }else {
        newstr+= current;
        alphabet[current-'a'] = true;
        originalOnly(str,id+1,newstr,alphabet);
    }

}

    public static void main(String[] args) {

    boolean[] alphabet = new boolean[26];

originalOnly("axxbrrctt",0,"",alphabet);

    }
}
