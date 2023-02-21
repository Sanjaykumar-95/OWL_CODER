import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();

        //Maximum Element in an array
        int max=Arrays.stream(ar).max().getAsInt();
        System.out.println(max);
    }
}