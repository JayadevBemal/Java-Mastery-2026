package Day04_Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String mandal[] = {"a","b","c"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello "+mandal[i]);
        }
        int size = sc.nextInt();;
        int numbers[] = new int[size];

        for (int i = 0;i<size;i++){
             numbers[i] = sc.nextInt();
        }
        for (int i = 0;i<size;i++){
            System.out.print(numbers[i]);
        }
    }

}
