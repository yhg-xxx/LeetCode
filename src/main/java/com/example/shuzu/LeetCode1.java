package com.example.shuzu;

import org.junit.Test;

import java.util.Arrays;

public class LeetCode1 {

    @Test
    public void test(){
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.printf(Arrays.toString(twoSum(nums,target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0]; // 如果没有找到解，返回空数组

    }
}
