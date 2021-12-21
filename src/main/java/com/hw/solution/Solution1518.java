package com.hw.solution;

/**
 * 空瓶换酒问题-简单
 * 1518. 换酒问题
 * 小区便利店正在促销，用 numExchange 个空酒瓶可以兑换一瓶新酒。你购入了 numBottles 瓶酒。
 *
 * 如果喝掉了酒瓶中的酒，那么酒瓶就会变成空的。
 *
 * 请你计算 最多 能喝到多少瓶酒。
 * Created by huwei on 2021/12/17.
 */
public class Solution1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int i = numBottles;
        int i1 = 0;
        while (i+i1>=numExchange){
            int sum = i + i1;
            i = sum/numExchange;
            i1 = sum % numExchange;
            numBottles+=i;
        }
        return numBottles;
    }

    public static int numWaterBottles2(int numBottles, int numExchange) {
        return (numBottles-1)/(numExchange-1)+numBottles;
    }

    public static void main(String[] args) {
        int i = numWaterBottles2(15, 8);
        System.out.println(i);
    }


}
