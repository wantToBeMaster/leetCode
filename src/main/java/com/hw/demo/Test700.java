package com.hw.demo;

/**
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 *
 * 例如，
 *
 * 给定二叉搜索树:
 *
 *         4
 *        / \
 *       2   7
 *      / \
 *     1   3
 *
 * 和值: 2
 * 你应该返回如下子树:
 *
 *       2
 *      / \
 *     1   3
 * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-a-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by huwei on 2021/11/26.
 */
public class Test700 {

    public static TreeNode searchBST(TreeNode root, int val) {
        return (root==null || root.val==val)?root:searchBST(root.val>val?root.left:root.right,val);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode();
        node.val=4;
        node.left = new TreeNode(2,new TreeNode(1,null,null),new TreeNode(3,null,null));
        node.right = new TreeNode(7,null,null);
        TreeNode treeNode = searchBST(node,2);
        System.out.println(treeNode);

        final int i = 8;

    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }
}


