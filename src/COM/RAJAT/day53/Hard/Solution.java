package COM.RAJAT.day53.Hard;

import java.util.Arrays;

public class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int first = -1, last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6,6,7};
        int target = 3;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
};