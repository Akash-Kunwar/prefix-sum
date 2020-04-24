

https://www.geeksforgeeks.org/longest-sub-array-sum-k/




import java.util.*;
import java.lang.*;
import java.io.*;
public class prob2 {
    public static int lenOfLongSubarr(int[] arr, int n, int k) 
      { 
             // HashMap to store (sum, index) tuples 
             HashMap<Integer, Integer> map = new HashMap<>(); 
             int sum = 0, maxLen = 0; 
  
             // traverse the given array 
             for (int i = 0; i < n; i++) { 
                  
                  // accumulate sum 
                  sum += arr[i]; 
                  
                  // when subarray starts from index '0' 
                  if (sum == k) 
                      maxLen = i + 1; 
  
                  // make an entry for 'sum' if it is 
                  // not present in 'map' 
                  if (!map.containsKey(sum)) { 
                      map.put(sum, i); 
                  } 
  
                  // check if 'sum-k' is present in 'map' 
                  // or not 
                  if (map.containsKey(sum - k)) { 
                        
                      // update maxLength 
                      if (maxLen < (i - map.get(sum - k))) 
                          maxLen = i - map.get(sum - k); 
                  } 
             } 
               
             return maxLen;              
      } 
  
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){   
            int n=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            int dp1[]=new int[n];
            for(int i=0;i<n;i++){
                dp1[i]=arr[i]-brr[i];
            }
            System.out.println(lenOfLongSubarr(dp1,n,0));
        }
    }
}