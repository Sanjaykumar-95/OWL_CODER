import java.util.*;
class sample{
    public static int firstOccurance(int *a, int n,int key){
        if(n==0) return -1;
        if(a[0]==key) return 0;
        if(firstOccurance(a+1,n-1,key)==-1) return -1;
        else return 1+firstOccurance(a+1,n-1,key);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={1,2,3,4,10};
        int n=ar.length;
        int key=5;
        
    }
}