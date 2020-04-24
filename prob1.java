https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k/0



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){   
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int dp[]=new int[n];
            dp[0]=arr[0];
            for(int i=1;i<n;i++){
                dp[i]=arr[i]+dp[i-1];
            }
            int max=dp[k-1];
            for(int i=k;i<n;i++){
                if(dp[i]-dp[i-k]>max){
                    max=dp[i]-dp[i-k];
                }
            }   
            // System.out.println(Arrays.toString(dp));
            System.out.println(max);


        }
	}
}