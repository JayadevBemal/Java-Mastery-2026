package Day09_Recursion;

import javax.print.attribute.standard.PresentationDirection;
import java.util.Scanner;

public class Problem1 {


    public static int printX(int x,int n){
        if (x==0){
            return 0;
        }
        if (n == 0){
            return 1;
        }
        int xPn1 = printX(x,n-1);
        int xpn = x * xPn1;
        return xpn;

    }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int n = sc.nextInt();

        System.out.println(printX(x,n));
    }
}



