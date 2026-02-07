package Day02_Patterns;


import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    for(int i = 1;i < 5;i++){
        for (int j = 1;j<10;j++){
        System.out.print("*");
    }
        System.out.println();
    }


//     int r = sc.nextInt();
//    int c = sc.nextInt();
//    for(int i = 1;i <= r;i++){
//        for(int j = 1;j <= c;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


    //print hollow type pattern
     int m = 4;int n = 5;
        for(int i = 1; i <= m;i++){
            for(int j = 1;j <= n;j++){
                if (j == n || j == 1 || i == m || i ==1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}
