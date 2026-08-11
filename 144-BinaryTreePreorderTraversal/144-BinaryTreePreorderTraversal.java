// Last updated: 8/11/2026, 2:22:13 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrderTraversal(root);
        return l;
    }
    void preOrderTraversal(TreeNode root)
    {
        if(root == null)    return;
        else
        {
            l.add(root.val);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);   
        }
    }
}