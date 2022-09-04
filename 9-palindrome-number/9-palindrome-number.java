class Solution {
    public boolean isPalindrome(int x) {
        int digit,sum=0,temp=x;
        while(x>0)
        {
            digit=x%10;
            x=x/10;
            sum = sum*10 + digit;
        }
        if(temp==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}