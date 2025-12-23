package com.example.shuzu;

import org.junit.Test;


public class LeetCode27 {

    @Test
    public void test(){
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.printf(String.valueOf(removeElement(nums,val)));
    }

        public int removeElement(int[] nums, int val) {
            int index = 0;
            for(int i =0;i<nums.length;i++){
                if(nums[i] != val){
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }

}
