//Total Xor of all sub arrays

import java.util.*;
class sample{

    //BruteForce O(n^3);
    public static void SubArrays(int ar[],int n){
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    ans^=ar[k];
                }
            }
        }
        System.out.println(ans);
    }

    //Optimised
    int ans=0;
    if((N&1)==0) return 0;
    else{
        for(int i=0;i<N;i++){
            if(((i+1)&1)!=0) ans^=A[i];
        }
    }
    return ans;
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();

        //Printing SubArrays
        SubArrays(ar,n);
    }
}