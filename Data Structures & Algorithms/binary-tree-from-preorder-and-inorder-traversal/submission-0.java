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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] idx = new int[1];
        return helper(preorder, inorder, 0, preorder.length-1, idx);
    }

    private TreeNode helper(int[] preorder, int[] inorder, int start, int end, int[] idx){
        if(start>end) return null;
        int rootVal = preorder[idx[0]];
        int i = start;
        for(;i<inorder.length;i++){
            if(inorder[i]==rootVal){
                break;
            }
        }
        idx[0]++;
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder, inorder, start, i-1,idx);
        root.right = helper(preorder, inorder, i+1, end,idx);
        return root;
    }
}
