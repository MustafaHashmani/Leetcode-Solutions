class Solution {
    public int reverse(int x) {
        long sum=0;
        int digit;
        boolean flag=false;
        if(x<0)
        {
            x=x*-1;
            flag=true;
        }
        while(x>0)
        {
            digit=x%10;
            sum = sum*10 + digit;
            x=x/10;
        }
        if(flag)
        {
            sum=sum*-1;
        }
        if(sum>=Integer.MAX_VALUE || sum<=Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)sum;
    }
}