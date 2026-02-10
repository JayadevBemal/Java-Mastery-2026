package Day06_BitManipulation;

public class Set {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;     //set bit at this position
        int bitmask = 1 << pos;
        int result = bitmask | n;
        System.out.println(result);
    }
}
