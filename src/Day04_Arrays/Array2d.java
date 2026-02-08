package Day04_Arrays;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] twode = new int[rows][cols];

        for (int i = 0; i < rows ; i++){

            for (int j = 0; j < cols;j++){
                twode [i][j] = sc.nextInt();
            }

        }
        int find = sc.nextInt();

        for (int i = 0;i < rows;i++){
            for (int j = 0; j < cols;j++){
                if (twode[i][j] == find){
                    System.out.println("found at "+ i+","+j);
                }
            }
        }


    }
}
