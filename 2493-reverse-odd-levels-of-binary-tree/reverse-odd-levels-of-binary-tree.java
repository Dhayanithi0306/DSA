class Solution {
    // private void bfs(TreeNode node,int crtLvl){
    //     if(node==null) return ;
    //     if(crtLvl%2==0){
    //         node.left.val = node.right.val;
    //         node.right.val = node.left.val;
    //     }
    //     if(node.left != null)
    // }
        // Queue<TreeNode> queue = new LinkedList<>();
        // List<Integer> l = new LinkedList<>();
        // queue.offer(root);
        // boolean boo = true;
        // while(!queue.isEmpty()){
        //     int n = queue.size();
        //     for(int i=0;i<n;i++){
        //         TreeNode node = queue.poll();
        //         if(boo){
        //             l.addLast(node.val);
        //         }
        //         else{
        //             l.addFirst(node.val);
        //         }
        //         // l.add(node.val);
        //         if(node.left != null){
        //             queue.offer(node.left);
        //         }
        //         if(node.right != null){
        //             queue.offer(node.right);
        //         }
        //     }
        //         boo=!boo;
        // }
        // System.out.print(l);
        // return root;   
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left,root.right,1);
        return root;
    }
    private void dfs(TreeNode left, TreeNode right,int lvl){
        if(left==null || right ==null) return ;

        if(lvl%2==1){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }
        
        dfs(left.left,right.right,lvl+1);
        dfs(left.right,right.left,lvl+1);
    }
}