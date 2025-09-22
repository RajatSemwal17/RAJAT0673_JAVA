package COM.RAJAT.day45;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {3,5,6,8,9,12,13,23,34,54};
        int low = 0;
        int high = arr.length - 1;
        int target = 54;

//        if the array is not sorted while solving binary Search then the answer would never come as
//        binary search imagines that the array is sorted already.

        int count = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                count++;
                System.out.println(mid + "=index\nsteps to reach there is/are: " + count);
                break;
            }
            else if(arr[mid] < target){
                count++;
                low = mid+1;
            }
            else{
                count++;
                high = mid-1;
            }
        }
    }
}
