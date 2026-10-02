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
};
*/

class Solution {
    
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                Node cur = q.poll();
                l.add(cur.val);
                if(!cur.children.isEmpty()){
                    for(int j=0;j<cur.children.size();j++){
                        q.add(cur.children.get(j));
                    }
                }
            }
            res.add(l);
        }
        return res;
    }
}