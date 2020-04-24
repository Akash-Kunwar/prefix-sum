import java.util.*;
import java.lang.*;
import java.io.*;
public class force {
    public static void subarray(int arr[],int n,int k){
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(!hm.containsKey(sum)){
                hm.put(sum,i+1);
            }
            if(hm.containsKey(sum-k)){
                System.out.println(hm.get(sum-k)+1+" "+(i+1));
                return;
            }
        }
    }
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
            subarray(arr,n,k);
        }
    }
}