package COM.RAJAT.day45;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] arr = {2,4,7,9,5,0};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println("element found at index: " + i);
                break;
            }
        }
    }
}
