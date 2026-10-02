/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> res;
    private void dfs(Node node){
        if(node==null) return ;
        if(!node.children.isEmpty()){
            for(int i=0;i<node.children.size();i++){
                dfs(node.children.get(i));
            }
        }
        res.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();
        dfs(root);
        return res;
    }
}