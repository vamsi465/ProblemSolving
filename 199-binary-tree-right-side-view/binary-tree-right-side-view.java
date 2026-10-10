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
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) {
            return result;
        }
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> al=new ArrayList<>();
            int size=q.size();
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
            res.add(al);
        }
        for(List<Integer> subList:res) {
             int lastEle=subList.get(subList.size()-1);
             result.add(lastEle);
        }
        return result;
    }
}