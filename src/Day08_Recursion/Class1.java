package Day08_Recursion;

import java.util.Scanner;

public class Class1 {
            //(returns value in descending order)
//    public static void printNumber(int n){
//           if (n== 0){
//               return ;
//           }
//        System.out.print(n);
//        printNumber(n-1);
//
//    }

    //(returns value in ascending order)

//    public static int printNumber(int n){
//        if (n== 0){
//            return 1;
//        }
//        printNumber(n-1);
//        System.out.print(n);
//        return n;
//    }

          //(print till 9 only)
//    public static int printNumber(int n){
//        if (n== 10){
//            return 0;
//        }
//        System.out.print(n);
//        printNumber(n+1);
//        return n;
//    }


    //sum of n natural numbers
    public static int printNumber(int n){
        if (n== 0){
            return 0;
        }

        return n + printNumber(n-1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNumber(n));

        }
    }

