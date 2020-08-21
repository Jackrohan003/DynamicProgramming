//https://practice.geeksforgeeks.org/problems/subset-sum-problem/0
import java.lang.*;
import java.io.*;
class GFG {
    static boolean equalsum(int a[],int n,int sum,int i)
    {
        if(0==sum)
            return true;
        if(i>=n || sum<0)
            return false;
        return equalsum(a,n,sum-a[i],i+1) || equalsum(a,n,sum,i+1) ;
    }
	public static void main (String[] args)throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test= Integer.parseInt(bf.readLine());
		for(int t=0;t<test;t++)
		{
		    int n = Integer.parseInt(bf.readLine());
		    int []a = new int[n];
		    int sum = 0;
		    String s[] = bf.readLine().split(" ");
		    for(int i=0;i<n;i++)
		    {
		        a[i] = Integer.parseInt(s[i]);
		        sum += a[i];
		    }
		    if(equalsum(a,n,sum/2,0) && sum%2==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");

		}
	}
}
