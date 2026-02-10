package Day06_BitManipulation;

import java.util.Scanner;

public class UpdatebitImproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int user = 9;
        int pos = sc.nextInt();
        int val = sc.nextInt();
        int bitmask = 1 << pos;
        int result;

        if (val == 1){
            result = bitmask | user;
            System.out.println("set "+result );
        }else {
            result = ~bitmask & user;
            System.out.println("cleared "+ result);
        }
    }
}
