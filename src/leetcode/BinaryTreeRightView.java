package leetcode;

import java.util.*;

public class BinaryTreeRightView {
    public static class TreeNode {
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
    public static void main(String args[]) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        List l1=rightSideView(root);
        System.out.println(l1);
    }
    public static List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q1=new ArrayDeque<>();
        List<Integer> l1=new ArrayList<>();
        q1.add(root);
        while(q1!=null){
            TreeNode tn=q1.poll();
            l1.add(tn.val);
            if(tn.right!=null)
            {
                q1.add(tn.right);
            }
            else  if(tn.left!=null){
                 q1.add(tn.right);
            }
        }
        return l1;
    }
}
