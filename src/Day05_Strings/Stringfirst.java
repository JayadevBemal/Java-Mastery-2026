package Day05_Strings;

import com.jogamp.nativewindow.ScalableSurface;

import java.util.Scanner;

public class Stringfirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //substring or parsing
        String name = sc.nextLine();
        System.out.println(name.substring(4));
      //compare
        String none = sc.nextLine();
        String ntwo = sc.nextLine();

        if (none.compareTo(ntwo) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }



//concatenation
    String fname = sc.nextLine();
    String lname = sc.nextLine();

        System.out.println("Your name is "+fname +"@"+lname);

    //charAt
        for(int i = 0; i<fname.length();i++){
        System.out.print(fname.charAt(i) + " ");
    }


}


}
