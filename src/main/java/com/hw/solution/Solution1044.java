package com.hw.solution;

/**
 * 1044. 最长重复子串
 * 给你一个字符串 s ，考虑其所有 重复子串 ：即，s 的连续子串，在 s 中出现 2 次或更多次。这些出现之间可能存在重叠。
 *
 * 返回 任意一个 可能具有最长长度的重复子串。如果 s 不含重复子串，那么答案为 "" 。
 *
 * 示例 1：
 *
 * 输入：s = "banana"
 * 输出："ana"
 * 示例 2：
 *
 * 输入：s = "abcd"
 * 输出：""
 *
 * 提示：
 *
 * 2 <= s.length <= 3 * 104
 * s 由小写英文字母组成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-duplicate-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/12/23.
 */
public class Solution1044 {
    public static String longestDupSubstring(String s) {
        int maxSize = s.length()-1;
        for (int i = maxSize; i > 0; i--) {
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, i+j);
                if (s.indexOf(substring)!=s.lastIndexOf(substring)){
                    return substring;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(longestDupSubstring(s));
//        System.out.println(s.substring(0,1));
    }

}
