package Day02_Patterns;

public class Numbers {
    public static void main(String[] args) {
        //1 pyramid

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();
        }

        //2 inverted pyramid

        for (int i = 5;i >= 1 ; i--){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        //3  Floyd's triangle
        int number = 1;
        for (int i = 1; i <= 5 ; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(number + "  ");
                number ++;
            }
            System.out.println();
        }

        //0-1 triangle

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                System.out.print("1"+"  ");

                } else {
                    System.out.print("0" + "  ");
                }

            }
            System.out.println();

        }




    }
}