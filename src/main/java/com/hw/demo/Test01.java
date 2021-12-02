package com.hw.demo;

import java.util.PriorityQueue;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/11.
 */
public class Test01 {

    public static int[] twoSum(int[] nums, int target) {
        int[] in = new int[2];
        in[1] = -1;
        int index = 0;
        for (int i: nums){
            int i1 = target - i;//取返
            int index2 = 0;
            for (int i2: nums){
                if (i2==i1&&index!=index2){
                    in[1] = index2;
                    break;
                }
                index2++;
            }
            if (in[1]!=-1){
                in[0] = index;
                break;
            }
            index++;
        }
        return in;
    }

    public static void main(String[] args) {
//        int[] nums = {3,3};
//        int target = 6;
//        int[] ints = twoSum(nums, target);
//        System.out.println(ints[0]);
//        System.out.println(ints[1]);

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->Double.compare(b[0]*1.0/b[1],a[0]*1.0/a[1]));

        PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compare);
        queue.add(5);
        queue.add(2);
        queue.add(1);
        queue.add(3);
        queue.add(4);
        Object[] objects = queue.toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
        System.out.println(queue.poll());

    }
}
