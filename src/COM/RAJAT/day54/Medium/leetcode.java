package COM.RAJAT.day54.Medium;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class leetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,8};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Solution s = new Solution();
        s.merge(nums,m,nums2,n);
        System.out.println(Arrays.toString(nums));
    }
}
