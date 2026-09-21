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
    private int dfs(TreeNode node){
        if(node == null)return 0;
        // if(node.left==null && node.right==null) 
        int left=0,right=0;
        if(node.left != null){
            left=dfs(node.left);
        }
        if(node.right != null){
            right=dfs(node.right);
        }
        return 1+Math.max(left,right);
    }
    private void dfs2(int deepthCnt ,int crtLvl,TreeNode node){
        // int cnt=0;
        // System.out.println(crtLvl);
        if(node == null) return ;
        if(crtLvl == deepthCnt) sum+=node.val; 
        if(node.left != null){
            dfs2(deepthCnt,crtLvl+1,node.left);
        }
        if(node.right != null){
            dfs2(deepthCnt,crtLvl+1,node.right);
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        int deepthCnt = dfs(root);
        dfs2(deepthCnt,1,root);
        return sum;
    }
}