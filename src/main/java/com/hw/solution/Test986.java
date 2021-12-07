package com.hw.solution;

import java.util.ArrayList;

/**
 * 给定两个由一些 闭区间 组成的列表，每个区间列表都是成对不相交的，并且已经排序。
 *
 * 返回这两个区间列表的交集。
 * Created by huwei on 2020/12/16.
 */
public class Test986 {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        ArrayList<int[]> ints = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<A.length && j<B.length){
            int[] ints1 = A[i];
            int[] ints2 = B[j];
            if (ints1[0]>ints2[1]) {
                j++;
            }else if (ints1[1]<ints2[0]){
                i++;
            }else{
                int[] ints3 = new int[2];
                ints3[0] = Math.max(ints1[0],ints2[0]);
                ints3[1] = Math.min(ints1[1],ints2[1]);
                ints.add(ints3);
                if (ints1[1]<ints2[1]){
                    i++;
                }else{
                    j++;
                }
            }
        }
        int[][] result = new int[ints.size()][];
        for (int ii = 0;ii<ints.size();ii++){
            result[ii] = ints.get(ii);
        }
        return result;
    }

    public static void main(String[] args) {
        intervalIntersection(new int[][]{{0,2},{5,10},{13,23},{24,25}},new int[][]{{1,5},{8,12},{15,24},{25,26}});
        
    }

}
