package COM.RAJAT.day41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DeleteAllOccOfSpecificNumber {
    public static void main(String[] args){
        int[] arr = {3,5,6,3,2,1,4,6,3,6,6,4,3,3,2};
        int num = 3;
        int n = arr.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != num){
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }

//        using ArrayList;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arrListData = {3,5,6,3,2,1,4,6,3,6,6,4,3,3,2};
        for(int i : arrListData){
            list.add(i);
        }
        int num1 = 3;
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() == num1){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
