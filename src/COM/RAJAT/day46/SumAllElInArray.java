package COM.RAJAT.day46;

public class SumAllElInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Time Complexity is O(n) and sum is: " + sum);
    }
}
