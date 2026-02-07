package Day03_AdvancePatterns;
import java.util.*;
public class Add {
    public static int sum(int one,int two){
        int add = one + two;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();

        int add = sum(one,two);
        System.out.println(add);

    }
}
