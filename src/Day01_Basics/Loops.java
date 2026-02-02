package Day01_Basics;

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        for (int x = 0; x < 10; x++) {
//            System.out.print(x);
//        }
//
//        for (int counter = 0; counter < 10; counter++) {
//            System.out.print("helloWorld");
//        }
//
//        int i = 0;
//        while (i < 10) {
//            System.out.print(i);
//            i++;
//        }
//
//        int j = 0;
//        do {
//            System.out.print(j);
//            j++;
//        } while (j < 10);
//
//
//        int sum = 0;
//        for (int n = sc.nextInt(); n > 0; n--) {
//            sum = n + sum;
//
//        }
//        System.out.println(sum);
//
        int table = sc.nextInt();
        for(int i = 1;i <= 10;i++){
            int result = table * i;
            System.out.println(table +"*" + i +"=" + result);
        }
    }
}