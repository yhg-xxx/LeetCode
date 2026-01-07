package com.example.shuzu;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LeetCode219 {
    @Test
    public void test(){
        int[] nums = {1,2,3,1};
        int k = 3;

        System.out.printf(String.valueOf(containsNearbyDuplicate(nums,k)));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int length = nums.length;
        for (int i = 0; i<length;i++){
            int num = nums[i];
            if(map.containsKey(num) && i - map.get(num) <= k){
                return true;
            }
            map.put(num,i);
        }
        return false;
    }
}
