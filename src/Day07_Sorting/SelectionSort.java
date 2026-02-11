package Day07_Sorting;

public class SelectionSort {

    public static void printN(int n[]) {
        {
            for (int i = 0; i < n.length; i++){
                System.out.print(n[i]);
            }
        }
    }
    public static void main(String[] args) {

        int n[] = {7,8,3,1,2};

        for (int i = 0; i < n.length;i++){
            int temp = n[i];
            int smallest = i;
            for (int j = i+1;j<n.length;j++){
                if (n[smallest] > n[j]){
                    smallest = j;
                }
            }
            n[i] = n[smallest];
            n[smallest]= temp;

        }
        printN(n);

    }
}
