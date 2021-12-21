package com.hw.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/12/17.
 */
public class Solution2175 {

    public static int[] printNumbers(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        double pow = Math.pow(10L, new Double(n));
        while(list.size()<pow){
            list.add(i);
            i++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }


    public static void main(String[] args) {
        int[] ints = printNumbers(1);
        System.out.println(ints.toString());
    }


}
