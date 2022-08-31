class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<Boolean>();
        int max=0;
        boolean check=false;
        for(int i=0;i<candies.length;i++)
        {
            max=candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++)
            {
                if(candies[j]>max)
                {
                    max=0;
                }
            }
            if(max==0)
            {
                list.add(false);
            }
            else
            {
                list.add(true);
            }
        }
        return list;
    }
}