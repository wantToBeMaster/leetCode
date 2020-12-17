package com.hw.demo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出：[3, 14.5, 11]
 * 解释：
 * 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-of-levels-in-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2020/12/16.
 */
public class Test637 {

    //抄的
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list = new ArrayList<>();
        LinkedList<TreeNode> list1 = new LinkedList<>();
        list1.add(root);
        while (list1.size()!=0){
            int size = list1.size();
            double sum = 0;
            for (int i = 0;i<size;i++){
                TreeNode poll = list1.poll();
                sum +=poll.val;
                if (poll.left!=null) list1.add(poll.left);
                if (poll.right!=null) list1.add(poll.right);
            }
            list.add(sum/size);
        }
        return list;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
