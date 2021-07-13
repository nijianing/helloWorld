package binaryTree;

import java.util.Stack;

public class IsSearchTree {
    int currentVal = 0;

    public boolean isSearchTree1(TreeNode root) {
        if(root == null) {
            return true;
        }
        boolean isLeft = isSearchTree1(root.left);
        if(root.val <= currentVal) {
            return false;
        }
        currentVal = root.val;
        boolean isRight = isSearchTree1(root.right);
        return isLeft && isRight;

    }

    public boolean isSearchTree2(TreeNode root) {
        if(root == null) {
            return true;
        }
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current = null;
        s.push(root);
        TreeNode node = root;
        while(!s.isEmpty()) {
            if(node != null && node.left != null) {
                s.push(node.left);
                node = node.left;
                continue;
            }
            node = s.pop();
            if(current != null && current.val >= node.val) {
                return false;
            }
            current = node;
            node = node.right;
            if(node != null){
                s.push(node);
            }
        }
        return true;
    }
}
