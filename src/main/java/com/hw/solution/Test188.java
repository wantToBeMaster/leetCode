package com.hw.solution;

/**
 * 给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
 *
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 *
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iv
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/28.
 */
public class Test188 {
    public static int maxProfit(int k, int[] prices) {
        int[][] ints = new int[prices.length][];
        if (prices.length==0){
            return 0;
        }
        ints[0][0] = 0;
        ints[0][1] = 0;
        for (int i = 1;i<prices.length;i++){
            //

        }

        return 0;
    }
}