// Last updated: 8/11/2026, 2:22:45 PM
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
    List<Integer> l = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inOrderTraversal(root);
        return l;
    }
    void inOrderTraversal(TreeNode root)
    {
        if(root == null) return;
        else
        {
            inOrderTraversal(root.left);
            l.add(root.val);
            inOrderTraversal(root.right);    
        }
    }
}