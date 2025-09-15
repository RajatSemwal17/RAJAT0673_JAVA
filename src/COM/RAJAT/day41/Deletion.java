package COM.RAJAT.day41;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 32, 4, 5};
        int pos = 4;
        int n = arr.length;
        for (int i = pos; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        n--;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}