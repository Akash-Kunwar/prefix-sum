https://practice.geeksforgeeks.org/problems/equilibrium-point/0



import java.util.*;
import java.lang.*;
import java.io.*;
public class force {
    public static int Equilibrium(int arr[],int n){
        int rsum=0;
        for(int i=0;i<n;i++){
            rsum+=arr[i];
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            rsum-=arr[i];
            if(lsum==rsum)return i+1;
            lsum+=arr[i];
        }
        
        return -1;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){   
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(Equilibrium(arr,n));
        }
    }
}