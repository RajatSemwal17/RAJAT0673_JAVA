package COM.RAJAT.day44;
import java.util.*;
public class BinarySearch_REC {
    public static int binary_search(int[] arr, int low, int high, int target) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binary_search(arr, mid + 1, high, target);
        } else {
            return binary_search(arr, low, mid - 1, target);
        }
    }

    public static void main(String[] args){
        int[] arr = {2,5,7,9,10,34};
        int low=0, high=arr.length-1;
        System.out.println(binary_search(arr,low,high,9));
    }
}
