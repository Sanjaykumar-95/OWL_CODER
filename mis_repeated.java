import java.util.*;
class sample{ 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();

        int arr[]=new int[2];
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(ar[i])) arr[0]=ar[i];
            else hm.put(ar[i],1);
        }
        for(int i=1;i<=n;i++){
            if(hm.get(i)==null) arr[1]=i;
        }
        for(int i=0;i<2;i++) System.out.print(arr[i]+" ");
    }
}