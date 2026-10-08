/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        boolean zag=true;
        if(root==null) {
            return result;
        }
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> al=new ArrayList<>();
            int size =q.size();
            for(int i=0;i<size;i++) {
                TreeNode f=q.poll();
                al.add(f.val); 
                if(f.left!=null) {
                    q.add(f.left);
                }
                if(f.right!=null) {
                    q.add(f.right);
                }
            }
             if(!zag) {
                    Collections.reverse(al);
                }
            zag=!zag;
            result.add(al);
        }
        return result;
    }
}