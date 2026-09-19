class Solution {
    public int findCenter(int[][] edges) {
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1])
            return edges[0][1];
        return edges[0][0];
        // int v=edges[0][0];
        // int u=edges[0][1];
        // int v2 = edges[1][0];
        // int u2 = edges[1][1];
        // boolean boo = false;
        // for(int i=1;i<edges.length;i++){
        //     if(edges[i][0]!=v && edges[i][1] != v){
        //         boo = true;
        //         break;
        //     }
        // }
        // return boo?u:v;


        // if(v==v2) return v2;
        // if(v==u2) return u2;
        // if(u==v2) return v2;
        // if(u==u2) return u2;
        // return -1;
    }
}