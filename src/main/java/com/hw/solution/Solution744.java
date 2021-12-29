package com.hw.solution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 744. 寻找比目标字母大的最小字母
 * 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
 *
 * 在比较时，字母是依序循环出现的。举个例子：
 *
 * 如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
 */
public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
//        Arrays.sort(letters);
        Set<Character> set = new HashSet<>();
        for (char letter : letters) {
            set.add(letter);
            if (set.size()==26) break;
        }
        return 'a';
    }

    public static void main(String[] args) {
        char c = 'a';
        System.out.println(c+0);
    }
}
