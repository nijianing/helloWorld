package binaryTree;

import sun.reflect.generics.tree.Tree;

public class SortArrayToBST {

    public TreeNode sort(int[] nums) {
        return sortSupport(nums, 0, nums.length-1);
    }

    public TreeNode sortSupport(int[] nums, int left, int right) {
        if(left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortSupport(nums, left, mid-1);
        root.right = sortSupport(nums, mid+1, right);
        return root;
    }



    public static void main(String[] args) {
        int[] list = new int[]{-10, -3, 0, 5, 9};
        TreeNode root = new SortArrayToBST().sort(list);
        System.out.println(root.toString());
    }
}
