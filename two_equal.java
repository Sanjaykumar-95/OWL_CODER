import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar1[]=new int[n];
        for(int i=0;i<n;i++) ar1[i]=sc.nextInt();
        int ar2[]=new int[n];
        for(int i=0;i<n;i++) ar2[i]=sc.nextInt();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1,ar2)) System.out.println("1");
        else System.out.println("0");
    }
}