class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indeg = new int[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses]; 
        for(int i=0;i<numCourses;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length;i++){
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
            indeg[prerequisites[i][0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                queue.offer(i);
            }
        }
        // int idx=0;
        List<Integer> ans = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.peek();
            ans.add(queue.remove());
            for(int neigh : graph[node]){
                indeg[neigh]--;
                if(indeg[neigh]==0) queue.offer(neigh);
            }
        }
        return ans.size()==numCourses ? ans.stream().mapToInt(Integer::intValue).toArray() : new int[0];
    }
}