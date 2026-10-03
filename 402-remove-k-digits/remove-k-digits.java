class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            while(!s.isEmpty() && s.peek() > c && k>0){
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k>0){ // missed#1
            s.pop();
            k--;
        }
        StringBuilder str = new StringBuilder();
        while(!s.isEmpty()){
            str.append(s.pop());
        }
        str.reverse();
        int i=0;
        while(i<str.length() && str.charAt(i)=='0'){  // missed logic
            i++; 
        }
        String ans = str.substring(i);
        return ans.isEmpty() ? "0": ans;  // missed#2 
    }
}