// Last updated: 11/15/2026, 9:41:26 PM
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
16class Solution {     //practice 144 , 145
17    List<Integer> l = new ArrayList<>();
18    public List<Integer> inorderTraversal(TreeNode root) {   //we have to return List as output.
19        inOrderTraversal(root);
20        return l;
21    }
22    void inOrderTraversal(TreeNode root)   //left,root,right.
23    {
24        if(root == null) return;
25        else
26        {
27            inOrderTraversal(root.left);
28            l.add(root.val);
29            inOrderTraversal(root.right);    
30        }
31    }
32}