import java.util.*;
class sample{
    static ArrayList<Integer> al=new ArrayList<>();

    public static void PrintCombSum(int ind,int n,int ar[],int t){
        if(ind==n){
            if(t==0) System.out.println(al);
            return ;
        }

        if(t>=ar[ind]){
            al.add(ar[ind]);
            PrintCombSum(ind,n,ar,t-ar[ind]);
            al.remove(al.size()-1);
        }

        PrintCombSum(ind+1,n,ar,t);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int t=sc.nextInt();
        int ind=0;
        PrintCombSum(ind,n,ar,t);
    }
}