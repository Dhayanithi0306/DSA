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
    private boolean dfs(TreeNode node ){
        if(node.left == null && node.right == null){
            return node.val==1;
        }
        boolean left = dfs(node.left);
        boolean right = dfs(node.right);
        if(node.val == 2 ){
            return left||right;
        }
        else{
            return left&&right;
        }
    }
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }
}