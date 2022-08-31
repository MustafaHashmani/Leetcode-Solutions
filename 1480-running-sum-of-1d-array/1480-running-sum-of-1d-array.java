class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int total=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                sum[0] = nums[0];
            }
            else
            {
                total = total + nums[i];
                sum[i] = total;
            }
        }
        return sum;
    }
}