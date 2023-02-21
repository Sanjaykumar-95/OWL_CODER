import java.util.*;
class sample{
    public static int BinerySearch(int low,int high,int ar[],int k,int mid){
        mid=(low+high)/2;
        if(mid==k) return mid;
        else if(k<mid) high=mid-1;
        else if(k>mid) low=mid+1;
        BinerySearch(low,high,ar,k,mid);
        return mid;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        System.out.println(BinerySearch(0,n-1,ar,k,0));
    }
}