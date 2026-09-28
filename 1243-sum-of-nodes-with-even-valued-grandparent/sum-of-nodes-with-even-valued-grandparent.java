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
    int sum;
    private void helper(TreeNode node, TreeNode parent, TreeNode grandParent){
        if(node == null) return ;
        if(grandParent!= null && grandParent.val%2==0){
            sum+=node.val;
        }
        helper(node.left,node,parent);
        helper(node.right,node,parent);
    }
    public int sumEvenGrandparent(TreeNode root) {
        helper(root,null,null);
        return sum;
    }
}