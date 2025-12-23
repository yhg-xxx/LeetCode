package com.example.shuzu;

import org.junit.Test;

import java.util.Arrays;
// 加一
public class LeetCode66 {

//    只要+1求余数，余数不等于0，说明没有进位，直接返回。
//    如果余数等于0，说明有进位，遍历前一个数字，加1再求余数，以此循环。
//    如果for循环都遍历完了，说明最高位也有进位，则重新建立一个数组，初始化为0，将第一位设置为1就可以了，
//    因为，99、999之类的数字加一为100、1000
    @Test
    public void test(){
        int[] digits = {3, 2, 4};

        System.out.printf(Arrays.toString(plusOne(digits)));
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

