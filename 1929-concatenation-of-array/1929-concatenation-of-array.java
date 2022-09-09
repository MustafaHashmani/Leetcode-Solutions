class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2*nums.length;
        int[] ans = new int[length];
        for(int i=0;i<length/2;i++)
        {
            ans[i] = nums[i];
            ans[i+(length/2)]=nums[i];
        }
        return ans;
        
    }
}