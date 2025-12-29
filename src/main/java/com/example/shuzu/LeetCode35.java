package com.example.shuzu;

import org.junit.Test;

public class LeetCode35 {

    @Test
    public void test(){
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.printf(String.valueOf(searchInsert(nums,target)));
    }

    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0,right = n-1,ans = n;
        while(left <= right){
            int mid = ((right - left) >>1) + left;
            if(target <= nums[mid]){
                ans=mid;
                right = mid - 1;
            }else{
                left = mid +1;
            }
        }
        return ans;
    }
}
