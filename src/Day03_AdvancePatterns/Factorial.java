package Day03_AdvancePatterns;

import java.util.Scanner;

public class Factorial {

    public static int findFacto(int a){
        if (a >10 ){
            System.out.println("thats a lazy job man");
            return -1;
        }
        int product = 1;
        for (int i = a;i >= 1;i--){
            product = product * i;

        }

        return product;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("the facto is :  " +  findFacto(a));

    }
}
