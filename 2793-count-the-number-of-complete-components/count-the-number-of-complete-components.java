class Solution {
    int nodes=0;
    private int dfs(int node,int edgeCount,int[] vis,List<Integer>[] graph){
        nodes++;
        vis[node] = 1;
        edgeCount = graph[node].size();
        for(int neigh: graph[node]){
            if(vis[neigh]==0){
                edgeCount+=dfs(neigh,0,vis,graph);
            }
        }
        return edgeCount;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        int[] vis = new int[n];
        int res=0;
        int edge=0;
        for(int i=0;i<n;i++){
            // node++;
            if(vis[i]==0){
                edge = dfs(i,0,vis,graph)/2;  
                if((nodes*(nodes-1))/2 == edge) res++;
                nodes=0; 
            }
        }
        return res;
    }
}