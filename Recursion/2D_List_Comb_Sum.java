import java.util.*;
class Solution {
    static List<List<Integer>> li=new ArrayList<>();
    static void combsum(int ind,int n,int arr[],List<Integer> al1,int t){
        if(ind==n){
            if(t==0){
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<al1.size();i++){
                res.add(al1.get(i));
            }
            li.add(res);
            }
            return;
        }
        for(int i=ind;i<n;i++){
            if(i>ind && ar[i]==ar[i-1]) continue;
            if(ar[i]>t) break;
            if(t>=arr[ind]){
                al1.add(arr[ind]);
                combsum(ind,n,arr,al1,t-arr[ind]);
                al1.remove(al1.size()-1);
            }
        }
        combsum(ind+1,n,arr,al1,t);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        int t=sc.nextInt();
        li.clear();
        List<Integer> al1=new ArrayList<>();
        combsum(0,n,arr,al1,t);
        System.out.println(li);
    }
}