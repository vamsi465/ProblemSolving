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
    public List<List<Integer>> levelOrder(TreeNode root) {
       Queue<TreeNode> q=new LinkedList<>();
       List<List<Integer>> ls=new ArrayList<>();
       q.add(root);
       while(!q.isEmpty()) {
        int size=q.size();
        List<Integer> s=new ArrayList<>();
        for(int i=0;i<size;i++) {
            TreeNode f=q.poll();
             if(f==null) {
                return ls;
             }
            s.add(f.val);
            if(f.left!=null)
           {
            q.add(f.left);
           }
           if(f.right!=null)
           {
            q.add(f.right);
           }
        }
         ls.add(s);
       }
       return ls;
    }
}