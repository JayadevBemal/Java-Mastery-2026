package Day06_BitManipulation;

import java.util.Scanner;

public class Updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //set
        // 1 << i
        // OR

        //clear
        //1 << i
        //~ AND

        int user = 9;
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        int result ;

        if (pos == 1 || pos == 2){
            //set
            result = bitmask | user;
            System.out.println("set "+ result);

        }else{
            //clear

            result = ~bitmask & user;
            System.out.println("cleared " + result);

        }


    }
}
