package com.hw.demo;

import java.util.Collection;
import java.util.HashMap;

/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
 *
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/16.
 */
public class Test290 {
    public static boolean wordPattern(String pattern, String s) {
        char[] split = pattern.toCharArray();
        String[] s1 = s.split(" ");
        if (split.length!=s1.length){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0;i<split.length;i++){
            if (map.containsKey(split[i])){
                if (!map.get(split[i]).equals(s1[i]))
                    return false;
            }else{
                if (map.containsValue(s1[i])) return false;
                map.put(split[i],s1[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = wordPattern("abba", "dog dog dog dog");
        System.out.println(b);
    }
}
