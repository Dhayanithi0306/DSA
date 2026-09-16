class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n =mat.length;
        int ans[] = new int[k];
        int[][] weak = new int[n][2];
        for(int i=0;i<n;i++){
            byte cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) cnt++;
                else break;
            }
            weak[i][0] = i;
            weak[i][1] = cnt;
        }
        Arrays.sort(weak,(a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            return a[1] - b[1];
        });
        for(int i=0;i<k;i++){
            ans[i] = weak[i][0];
        }
        return ans;
    }
}