// A Dynamic Programming solution for subset 
// sum problem 
class SubSetsumDP { 

	// Returns true if there is a subset of 
	// set[] with sun equal to given sum 
	static boolean isSubsetSum(int arr[], 
							int n, int sum) 
	{ 
		// The value of subset[i][j] will be 
		// true if there is a subset of 
		// set[0..j-1] with sum equal to i 
		boolean t[][] = new boolean[n+1][sum+1]; 

		// If sum is 0, then answer is true 
		for (int i = 0; i <= sum; i++) 
			t[0][i] = false; 

		// If sum is not 0 and set is empty, 
		// then answer is false 
		for (int i = 0; i <= n; i++) 
			  t[i][0] = true; 

    for(int i=1;i<=n;i++){
      for(int j=1;j<=sum;j++){
          if(arr[i-1]<=j)
             t[i][j]= ((t[i][j-arr[i-1]])||( t[i-1][j]));
          else 
              t[i][j]=t[i-1][j];
      }
    }

       for (int i = 0; i <= n; i++) 
        { 
        for (int j = 0; j <= sum; j++) 
              System.out.print(t[i][j]+" "); 
          System.out.println();
        }
		return t[n][sum]; 
	} 

	/* Driver program to test above function */
	public static void main(String args[]) 
	{ 
		int set[] = { 3, 34, 4, 12, 5, 2 }; 
		int sum = 9; 
		int n = set.length; 
		if (isSubsetSum(set, n, sum) == true) 
			System.out.println("Found a subset"
							+ " with given sum"); 
		else
			System.out.println("No subset with"
							+ " given sum"); 
	} 
} 

/* This code is contributed by Rajat Mishra */
