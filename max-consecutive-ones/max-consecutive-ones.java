class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            if(nums[i]==1)
            {
                sum++;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==1 && nums[j]==1)
                {
                    sum+=1;
                }
                else
                {
                    break;
                }
                
            }
            if(sum>max)
            {
                max=sum;
            }
            
        }
        return max;
        
    }
}