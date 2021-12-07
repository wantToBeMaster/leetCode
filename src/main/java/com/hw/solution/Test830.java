package com.hw.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huwei on 2021/1/5.
 */
public class Test830 {
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        if (s.length()==0){
            return list;
        }
        int num = 1;
        for(int i = 0;i<s.length();i++){
            if (i == s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                if (num>3){
                    list.add(Arrays.asList(i-num+1,i));
                }
                num = 1;
            }else{
                num++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "aaa";
        largeGroupPositions(s);
    }
}
