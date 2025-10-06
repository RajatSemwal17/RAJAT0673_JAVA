package COM.RAJAT.day47;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,5,1,4,9,7,8};
        int n = arr.length;
        insertionSort(arr,n);
        for(int it : arr){
            System.out.print(it + " ");
        }
    }
}