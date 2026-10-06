class Solution {
    private TreeNode dfs(TreeNode node,int tar){
        if(node==null) return null ;
        node.left = dfs(node.left,tar);
        node.right = dfs(node.right,tar);
        if(node.left==null && node.right==null && node.val == tar){
            node = null;
        }
        return node;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dfs(root,target);
    }
}