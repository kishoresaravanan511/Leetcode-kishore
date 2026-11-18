// Last updated: 11/18/2026, 8:11:19 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int maxDepth(TreeNode root) {
18        if(root == null)
19            return 0;
20
21        int l = maxDepth(root.left);
22        int r = maxDepth(root.right);
23
24        System.out.println(l+ " " + r);
25        
26        return 1+Math.max(l,r);
27    }
28}