class Solution {
    public int minAddToMakeValid(String s) {
        int cnt=0;
        int res=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
            cnt++;
          }
          else{
            if(cnt>0){
                cnt--;
            }
            else{
                res++;
            }
          }
        }
       return res+cnt;
    }
}