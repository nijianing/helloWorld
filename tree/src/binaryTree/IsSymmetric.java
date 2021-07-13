package binaryTree;

import java.util.Stack;

public class IsSymmetric {
    public boolean run(TreeNode root) {
        if(root == null) {
            return true;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        TreeNode node1 = root.left;
        TreeNode node2 = root.right;

        while(node1 != null || node2 != null || !s1.isEmpty() || !s2.isEmpty()) {
            if(node1 != null && node2 != null) {
                s1.push(node1);
                node1 = node1.left;
                s2.push(node2);
                node2 = node2.right;
                continue;
            }
            if(node1 != null || node2 != null){
                return false;
            }
            TreeNode tmpNode1 = s1.pop();
            TreeNode tmpNode2 = s2.pop();
            if(tmpNode1.val != tmpNode2.val) {
                return false;
            }
            node1 = tmpNode1.right;
            node2 = tmpNode2.left;

        }
        return true;
    }

    public static void main(String args[]) {
        Integer[] list = {1,2,2,null,3,null,3};
        TreeNode root = CreateTree.create(list);
        boolean flag = new IsSymmetric().run(root);
        System.out.println(flag);
    }
}
