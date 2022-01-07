package com.hw.solution;

/**
 * 1576. 替换所有的问号
 * 给你一个仅包含小写英文字母和 '?' 字符的字符串 s，请你将所有的 '?' 转换为若干小写字母，使最终的字符串不包含任何 连续重复 的字符。
 *
 * 注意：你 不能 修改非 '?' 字符。
 *
 * 题目测试用例保证 除 '?' 字符 之外，不存在连续重复的字符。
 *
 * 在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。
 * Created by huwei on 2022/1/5.
 */
public class Solution1576 {
    public static String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!='?'){
                continue;
            }
            char before = '1';
            char after = '1';
            chars[i] = 'a';
            if (i>0) before = chars[i-1];
            if (i<chars.length-1) after = chars[i+1];
            while(before==chars[i]||after==chars[i]){
                chars[i]++;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
//        String a = "j?qg??b";
//        System.out.println(modifyString(a));
        char c = 'a';
        c++;
        System.out.println(c);
    }
}
