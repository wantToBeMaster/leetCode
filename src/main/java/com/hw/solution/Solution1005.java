package com.hw.solution;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
 *
 * 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
 * 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
 *
 * 以这种方式修改数组后，返回数组 可能的最大和 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximize-sum-of-array-after-k-negations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/12/3.
 */
public class Solution1005 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            Arrays.sort(nums);
            nums[nums.length-1] = -nums[nums.length-1];
        }
        int sum = 0;
        for (int num : nums) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ints = {4, 2, 3};
        int i = largestSumAfterKNegations(ints, 1);
        System.out.println(i);
    }
}
