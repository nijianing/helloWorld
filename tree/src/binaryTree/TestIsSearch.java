package binaryTree;

public class TestIsSearch {
    public static void main(String args[]) {
        Integer[] list = {6,4,9,1,null,10,11,null,null,null,8,null,14};
        IsSearchTree TreePackage = new IsSearchTree();
        TreeNode tree = CreateTree.create(list);
        boolean b = TreePackage.isSearchTree2(tree);
        System.out.println(b);
    }
}
