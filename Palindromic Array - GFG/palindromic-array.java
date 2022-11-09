//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               boolean res=true;
               for(int i=0;i<n;i++)
               {
                   res=helper(a[i]);
                   if(res==false)
                   {
                       return 0;
                   }
               }
               return 1;
           }
    static boolean helper(int n)
    {
        int sum=0,temp = n;
        while(n!=0)
        {
            sum = sum*10 + n%10;
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}