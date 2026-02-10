package Day06_BitManipulation;

public class Get {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;
        int bitmask = 1 << pos ;
        int result = bitmask & n;
        if (result != 0){
            System.out.println("Bit is one");
        }else {
            System.out.println("Bit is zero");
        }
    }
}
