class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sum=0;
        int[] sums=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            for(int j=0;j<nums.length;j++)
            {
                if(j!=i && nums[j]<nums[i])
                {
                    sum++;
                }
                sums[i]=sum;
            }
        }
        return sums;
    }
}