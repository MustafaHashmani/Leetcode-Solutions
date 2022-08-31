class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        int k=0;
        for(int i=0;i<n;i++)
        {
            ans[k]=nums[i];
            ans[k+1]=nums[i+n];
            k+=2;
        }
        return ans;
        
    }
}