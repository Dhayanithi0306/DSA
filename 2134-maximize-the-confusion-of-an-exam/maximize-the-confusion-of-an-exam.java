class Solution {
    private int longestSub(String s , char c,int k){
        int count=0;
        int left=0;
        int ans = 0;
        for(int right=0;right<s.length();right++){
            if(s.charAt(right)!=c){
                count++;
            }
            while(count > k){
                if(s.charAt(left)!=c){
                    count--;
                }
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int T_c = longestSub(answerKey,'T',k);
        int F_c = longestSub(answerKey,'F',k);
        return Math.max(T_c,F_c);
    }
}