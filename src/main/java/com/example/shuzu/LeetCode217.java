package com.example.shuzu;

import org.junit.Test;

import java.util.Arrays;

public class LeetCode217 {

    @Test
    public void test(){
        int[] nums = {1,2,3,1};

        System.out.printf(String.valueOf(containsDuplicate(nums)));
    }

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n - 1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
