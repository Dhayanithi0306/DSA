class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    List<Integer> ans = new ArrayList<>();
    int n = nums.length;
    int lows = 0;
    int dubs = 0;
    for(int i=0;i<n;i++){
        if(nums[i]<target){
            lows++;
        }
        if(nums[i]==target){
            dubs++;
        }
    }
    for(int i=0;i<dubs;i++){
        ans.add(lows++);
    }
    return ans;
    }
}