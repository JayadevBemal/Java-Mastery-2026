package Day03_AdvancePatterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 1; i <= m;i++){
            for (int j = 1; j <= (m-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i;j++){
                System.out.print("*");
            }
            for (int j = 1; j <= i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int i = 1; i<= m-1;i++){
            for (int j = 1; j <= i;j++){
                System.out.print(" ");
            }
            for (int j = 1; j<= (m-i);j++){
                System.out.print("*");
            }
            for (int j = 1; j <= m-1-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
