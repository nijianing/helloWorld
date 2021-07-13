package binaryTree;

public class TestCreate {
    public static void preTraverse(TreeNode t) {
        if(t != null) {
            System.out.println(t.val);
            preTraverse(t.left);
            preTraverse(t.right);
        }
    }

    public static void main(String[] args) {
        Integer[] list = {5,null,4,2,7,3,null,null,null,6,5,null,null,9};
        TreeNode tree = CreateTree.create(list);
        preTraverse(tree);
    }
}
