package com.hw.solution;

import java.util.*;

/**
 * Created by huwei on 2020/12/22.
 */
public class Test103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while(queue.size()!=0){
            List<Integer> ints = new ArrayList<>();
            int max = queue.size();
            for (int i = 0;i<max;i++){
                TreeNode poll = queue.poll();
                if (poll!=null){
                    ints.add(poll.val);
                    if (poll.left!=null) queue.add(poll.left);
                    if (poll.right!=null) queue.add(poll.right);
                }
                if (flag){
                    Collections.reverse(ints);
                }
            }
            flag = !flag;
            list.add(ints);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        treeNode.right = right;

        List<List<Integer>> lists = zigzagLevelOrder(treeNode);
        System.out.println("--");
        for (List<Integer> list:lists){
            for (Integer i:list){
                System.out.println(i);
            }
            System.out.println("---");
        }
        System.out.println("--");
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}