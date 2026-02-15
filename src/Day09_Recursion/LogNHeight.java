package Day09_Recursion;

import java.util.Scanner;
public class LogNHeight {


    public static long printX(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        long halfPower =  printX(x,n/2);

        if (n%2 == 0){

            return halfPower * halfPower;
        }
        else{
            return  x * halfPower * halfPower;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();


        System.out.println(printX(x, n));
    }
}