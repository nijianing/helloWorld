package binaryTree;

public class TreeNode {
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

    public String toString() {
        String s = " ";
        s += this.val;
        if(this.left != null) {
            s += this.left.toString();
        }
        if(this.right != null) {
            s += this.right.toString();
        }
        return s;

    }

}
