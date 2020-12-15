package com.hw.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 字母异位词分组
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/14.
 */
public class Test49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int[] ints = new int[26];
        int j = 2;
        for (int i = 0;i<26;){
            if (isPrime(j)){
                ints[i]=j;
                i++;
            }
            j++;
        }
        for(int i:ints){
            System.out.println(i);
        }
        HashMap<Double, List<String>> map = new HashMap<>();
        for (String ss:strs){
            char[] chars = ss.toCharArray();
            double i = 1;
            for (char c:chars){
                int index = c - 'a';
                i *= ints[index];
            }
            if (map.containsKey(i)){
                List<String> put = map.get(i);
                put.add(ss);
                map.put(i,put);
            }else{
                List<String> list = new ArrayList<>();
                list.add(ss);
                map.put(i,list);
            }
        }
        System.out.println(map.size());
        return new ArrayList<>(map.values());
    }

    private static boolean isPrime(int i){
        if (i<2){
            return false;
        }
        if (i==2||i==3){
            return true;
        }
        for (int j = 2;j<=(int)Math.sqrt(i);j++){
            if (i%j==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<String>> lists = groupAnagrams(new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"});
        System.out.println(lists.toString());
    }
}
