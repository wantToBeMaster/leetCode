package com.hw.solution;

import java.util.List;
import java.util.Set;

/**
 * 472. 连接词
 * 给你一个 不含重复 单词的字符串数组 words ，请你找出并返回 words 中的所有 连接词 。
 *
 * 连接词 定义为：一个完全由给定数组中的至少两个较短单词组成的字符串。
 *
 * 示例 1：
 *
 * 输入：words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
 * 输出：["catsdogcats","dogcatsdog","ratcatdogcat"]
 * 解释："catsdogcats" 由 "cats", "dog" 和 "cats" 组成;
 *      "dogcatsdog" 由 "dog", "cats" 和 "dog" 组成;
 *      "ratcatdogcat" 由 "rat", "cat", "dog" 和 "cat" 组成。
 * 示例 2：
 *
 * 输入：words = ["cat","dog","catdog"]
 * 输出：["catdog"]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/concatenated-words
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/12/28.
 */
public class Solution472 {
    public static List<String> findAllConcatenatedWordsInADict(String[] words) {

        return null;
    }

    public static boolean check(String s, Set<String> set){
        int n = s.length();
        if (set.size() == 0 || n == 0) {
            return false;
        }

        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (!dp[j]) {
                    continue;
                }
                if (set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        boolean[] booleans = new boolean[2];
        System.out.println(booleans[0]);
        System.out.println(booleans[1]);
        System.out.println(new Boolean("1"));
        String s = "";
    }

}
