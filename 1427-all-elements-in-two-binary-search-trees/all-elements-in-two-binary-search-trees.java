
class Solution {
    List<Integer> a;
    List<Integer> b;
    private void dfs(TreeNode node){
        if(node == null) return ;
        dfs(node.left);
        a.add(node.val);
        dfs(node.right);
    }
    private void dfs1(TreeNode node){
        if(node == null) return ;
        dfs1(node.left);
        b.add(node.val);
        dfs1(node.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        a = new ArrayList<>();
        b = new ArrayList<>();
        dfs(root1);   
        dfs1(root2);   
        int l=0;
        int r=0;
        while(l<a.size() && r<b.size()){
            int num1 = a.get(l);
            int num2 = b.get(r);
            if(num1<num2){
                l++;
                res.add(num1);
            }
            else{
                r++;
                res.add(num2);
            }
        }
        while(l<a.size()){
            res.add(a.get(l));
            l++;
        }
        while(r<b.size()){
            res.add(b.get(r));
            r++;
        }
        return res;
    }
}