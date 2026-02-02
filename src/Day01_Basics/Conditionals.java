package Day01_Basics;

import java.util.Scanner;

class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int age = sc.nextInt();
//        if (age > 18) {
//            System.out.println("adult");
//
//        } else {
//            System.out.println("not adult");
//
//        }
//
//        int num = sc.nextInt();
//        if (num % 2 == 1) {
//            System.out.println("its odd");
//        } else if (num <= 1) {
//            System.out.println("neither odd nor even");
//        } else {
//            System.out.println("its even");
//        }


//        int one = sc.nextInt();
//        int two = sc.nextInt();
//        if (one == two){
//            System.out.println(one + "is greater than" + two);
//
//        }else if (one > two) {
//            System.out.println("one is greater than two");
//        }
//         else {
//            System.out.println("one is less than two.");
//        }

        int button = sc.nextInt();
        switch (button){
            case 1 : System.out.println("congrats");
            break;
            case 3 : System.out.println("hurray");
            break;
            case 5 : System.out.println("good to go");
            break;
            default: System.out.println("not a valid input");
            

        }

        int num = sc.nextInt();
        int sum = sc.nextInt();
        if (num == sum){
            System.out.println("both are equal");
        }else if(num > sum){
            System.out.println("num is greater");

        }else{
            System.out.println("num is lesser");


        }

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = a + b;
        System.out.println(c);

    int numb = sc.nextInt();
        switch(numb){
            case 1 :
                System.out.println("hello a");
                break;
            case 4 :
                System.out.println("hello 2");
                break;
            default:
                System.out.println("not found");
        }

    }

}