package com.hw.demo;

import java.util.HashMap;

/**
 * 无重复字符的最长子串
 * Created by huwei on 2020/12/11.
 */
public class Test03 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i = 0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                left = Math.max(map.get(s.charAt(i))+1,left);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("aabbccddeeffgg");
//        System.out.println(sb);
//        System.out.println(sb.delete(0,0));
        lengthOfLongestSubstring("abcabcbbaaaabbc");
    }
}
