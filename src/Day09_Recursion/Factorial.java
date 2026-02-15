package Day09_Recursion;

import java.util.Scanner;

public class Factorial {
    public static int getFactorial(int n) {
        if (n == 0){
            return 1;
        }

        int FofN1 = getFactorial(n-1);
        int result = n * FofN1;
        return  result;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getFactorial(n));
    }
}
