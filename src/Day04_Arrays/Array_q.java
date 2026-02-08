package Day04_Arrays;

import java.util.Scanner;

public class Array_q {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rock[] = new int[size];


        for (int i = 0;i < size; i++){

            rock[i] = sc.nextInt();

        }

        int find = sc.nextInt();

        for (int i = 0; i < size; i++){

            if(find == rock[i]){
                System.out.println("the number "+ find +" is in index " + i);
            }else {
                System.out.println("not found");
            }
        }
    }
}
