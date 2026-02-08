package Day04_Arrays;

import java.util.Scanner;

public class Array_q2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        int size = sc.nextInt();
        int[] ntr = new int[size];

        for (int i = 0; i < ntr.length;i++){
            ntr[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int value = 1;
        for (int i = 0; i < ntr.length;i++){

            if (ntr[i] == find){
                System.out.println("index " + i);
                value = 0;
                break;

            }


        }if (value != 0){
            System.out.println("not found");
        }
    }
}
