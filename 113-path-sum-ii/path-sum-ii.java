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
    List<List<Integer>> res;
    List<Integer> l;
    private void getPath(TreeNode node,int tar){
        if(node==null) return ;
        l.add(node.val);
        tar-=node.val;
        if(node.left == null && node.right == null){
            if(tar == 0){
                res.add(new ArrayList<>(l));
                l.remove(l.size()-1);
                return ;
            }
        }
        getPath(node.left,tar);
        getPath(node.right,tar);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int tar) {
        l = new ArrayList<>();
        res = new ArrayList<>();
        getPath(root,tar);
        return res;
    }
}