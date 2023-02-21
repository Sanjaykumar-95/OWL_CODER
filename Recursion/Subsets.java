import java.util.*;
class sample{
    static ArrayList<Integer> al=new ArrayList<>();

    public static void PrintSubsets(int ind,int ar[],int n){
        if(ind==n){
            System.out.println(al);
            return ;
        }
        al.add(ar[ind]);

        PrintSubsets(ind+1,ar,n);

        al.remove(al.get(al.size()-1));
        
        PrintSubsets(ind+1,ar,n);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int ind=0;
        PrintSubsets(ind,ar,n);
    }
}