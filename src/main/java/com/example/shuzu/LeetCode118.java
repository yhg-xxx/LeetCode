package com.example.shuzu;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCode118 {

    @Test
    public void test(){
        int numRows = 5;

        System.out.printf(String.valueOf(generate(numRows)));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for(int i = 0;i<numRows;++i){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j<= i;++j){
                if(j==0 ||j == i){
                    row.add(1);
                }else{
                    row.add(ret.get(i-1).get(j-1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }
}
