class Solution {
    private void backTrack(int n,StringBuilder s, List<String> ans){
        if(s.length() == n){
            ans.add(s.toString());
            return ;
        }

        s.append('1');
        backTrack(n,s,ans);
        s.deleteCharAt(s.length()-1);

        if(s.length() == 0 || s.charAt(s.length()-1)== '1'){
            s.append('0');
            backTrack(n,s,ans);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(n,new StringBuilder(),ans);
        return ans;
    }
}