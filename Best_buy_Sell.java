import java.util.*;
import com.google.common.primitives.Ints;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int min=Arrays.stream(ar).min().getAsInt();
        System.out.println(min);
        int ind=Arrays.binarySearch(ar,min);
        System.out.println(ind);
        System.out.println(inde);
    }
}