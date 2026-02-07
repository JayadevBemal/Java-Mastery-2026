package Day02_Patterns;
import java.util.* ;
public class Pyramid {
    public static void main(String[] args) {


        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");     //1st
            }
            System.out.println();
        }

        //2nd

        for (int i = 1;i<=4;i++){
            for (int j = 4;j >= i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        //3rd

        for (int i =1;i <= 4;i++){
            for (int j = 1; j <= 4 - i;j++){
                System.out.print(" ");

            }
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //4th

        for (int i = 1;i<=4;i++){

            for (int j = 1;j <= i-1;j++ ){
                System.out.print(" ");
            }
            for (int j = 4;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
