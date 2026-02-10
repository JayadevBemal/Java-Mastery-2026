package Day06_BitManipulation;

public class Clearbit {
    public static void main(String[] args) {

       int n = 5;
       int pos = 2;
       int bitmask = 1 << pos;
       int result = ~bitmask & n;
        System.out.println(result);
    }
}
