package Day03_AdvancePatterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //for the rows of upperhalf
        int n = sc.nextInt();
        for (int i = 1; i <=n;i++){

            //stars on the upper-left
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //spaces in between
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces;j++ ){
                System.out.print(" ");
            }
            //stars on the upper-right
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //lowerhalf

        //rows
        for (int i = n;i >= 1;i--){

            //stars on the lowerleft
            for (int j = 1; j <= i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(n-i);
            for (int j = 1;j <= spaces;j++){
                System.out.print(" ");
            }

            //stars on the lowerright
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
