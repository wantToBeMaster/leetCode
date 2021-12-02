package com.hw.demo;

/**
 *
 * 给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：3
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：0
 * 解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分。
 *  
 *
 * 提示：
 *
 * 1 <= n <= 231 - 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nth-digit
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/11/30.
 */
public class Solution400 {

    public static int findNthDigit(int n){
        int len = 1,c = 9;//数字过大后，int会溢出 存在隐患
        while (n> len*c){
            n -= len*c;
            len++;
            c *= 10;
        }

        long s = (long) Math.pow(10, len - 1);
        long x = n / len - 1 + s;
        n -= (x - s + 1) * len;
        return n == 0 ? (int) (x % 10) : (int) ((x + 1) / (int) (Math.pow(10, len - n)) % 10);
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(302));
    }
}
