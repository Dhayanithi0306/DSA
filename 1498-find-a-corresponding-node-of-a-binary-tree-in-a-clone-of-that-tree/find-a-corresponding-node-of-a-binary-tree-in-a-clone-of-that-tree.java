/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    // TreeNode res;
    // private void dfs(TreeNode or, TreeNode clo,TreeNode tar){
    //     if(or.val == tar.val || or==null || clo==null) {
    //         res = clo;
    //         return ;
    //     }
    //     dfs(or.left,clo.left,tar);
    //     dfs(or.right,clo.right,tar);
    // }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // dfs(original,cloned,target);
        // return res;
         if (original == null) {
            return null;
        }

        if (original == target) {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);

        if (left != null) {
            return left;
        }

        return getTargetCopy(original.right, cloned.right, target);
    }
}