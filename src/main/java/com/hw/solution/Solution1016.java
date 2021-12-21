package com.hw.solution;

/**
 *
 * Created by huwei on 2021/12/16.
 */
public class Solution1016 {
    public static boolean queryString(String s, int n) {
        String s1 = Integer.toBinaryString(n);
        System.out.println(s1);
        return s.contains(Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        queryString("110101011011000011011111000000",15);
    }
}
