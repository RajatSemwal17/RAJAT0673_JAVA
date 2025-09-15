package COM.RAJAT.day41;

public class Insertion{
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40 , 0,}; // Size 5, last space free
        int n = 4; // Current number of elements
        int value = 25;
        int pos = 2; // Insert at index 2
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i-1]; // Shift right
        }
        arr[pos] = value;
        n++;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}