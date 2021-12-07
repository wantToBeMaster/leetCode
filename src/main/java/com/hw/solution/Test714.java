package com.hw.solution;

import static java.lang.Math.max;

/**
 *
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
 *
 * 你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
 *
 * 返回获得利润的最大值。
 *
 * 注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/17.
 */
public class Test714 {
    public static int maxProfit(int[] prices, int fee) {
//        int[][] dp  = new int[prices.length][2];
//        int n = prices.length;
//        if(n<=1)  return 0;
//        //dp数组初始化
//        dp[0][0]=0;
//        dp[0][1]=-fee-prices[0];
//
//        for(int i=1;i<n;i++)
//        {
//            dp[i][0]=max(dp[i-1][1]+prices[i],dp[i-1][0]);//当天不持有股票的状态可能来自昨天有今天卖出或者昨天也不持有
//            dp[i][1]=max(dp[i-1][0]-prices[i]-fee,dp[i-1][1]);//当天持有股票的状态可能来自昨天没有今天买进或者昨天就持有了
//        }
//        return dp[n-1][0];
        int n = prices.length;
        int buy = prices[0] + fee;
        int profit = 0;
        for (int i = 1; i < n; ++i) {
            if (prices[i] + fee < buy) {
                buy = prices[i] + fee;
            } else if (prices[i] > buy) {
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int i = maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3);

        System.out.println(i);
    }
}
