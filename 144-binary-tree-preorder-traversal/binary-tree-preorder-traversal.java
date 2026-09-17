class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        preorder(root, al);
        return al;
    }

    private void preorder(TreeNode root, List<Integer> al) {
        if (root == null) {
            return;
        }

        // Root
        al.add(root.val);

        // Left
        preorder(root.left, al);

        // Right
        preorder(root.right, al);
    }
}