package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CreateTree {
    public static TreeNode create(Integer[] list) {
        if(list == null || list[0] == null) {
            return null;
        }
        TreeNode root = new TreeNode(list[0]);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        TreeNode node = root;
        boolean direction = true;
        for(int i=1; i<list.length; i++) {
            Integer val = list[i];
            TreeNode newNode = null;
            if(val != null) {
                newNode = new TreeNode(val);
                q.offer(newNode);
            }
            if(direction) {
                node.left = newNode;
                direction = false;
            }
            else {
                node.right = newNode;
                direction = true;
                if(q.isEmpty()) {
                    break;
                }
                node = q.poll();
            }
        }
        return root;
    }
}
