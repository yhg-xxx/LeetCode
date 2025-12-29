package com.example.shuzu;

import org.junit.Test;

public class LeetCode26 {

    @Test
    public void test(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.printf(String.valueOf(removeDuplicates(nums)));
    }

    public int removeDuplicates(int[] nums) {

        if(nums.length ==0){
            return 0;
        }
        int index = 1;
        for (int i=1;i<nums.length;i++){
            if(nums[i] != nums[index-1]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
