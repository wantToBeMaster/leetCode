package com.hw.solution;

/**
 * Created by huwei on 2020/12/21.
 */
public class Test746 {
    public static int minCostClimbingStairs(int[] cost) {
        int[] ints = new int[cost.length+1];
        ints[0] = 0;
        ints[1] = cost[0];

        for (int i = 2;i < cost.length;i++){
            ints[i] = Math.min(ints[i-1]+cost[i],ints[i-2]+cost[i-1]);
        }
        return ints[cost.length-1];
    }

    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int i = minCostClimbingStairs(cost);
        System.out.println(i);
    }

}
