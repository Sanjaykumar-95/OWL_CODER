//Unique element in an array while remaining elements are repeating even number of times

import java.util.*;
class Xor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ar[]={2,2,4,3,3};
        int ans=0;
        for(int i=0;i<ar.length;i++){
            ans=ans^ar[i];
        }
        System.out.println(ans);
    }
}

//2 Single numbers in an array while remaining repeates two times
class TwoUniq{
    public static void main(String args[]){

        int A[]={2,2,3,1,4,1};

        int ans=0;
        for(int i=0;i<A.length;i++){
            ans^=A[i];
        }

        int First_Bit=ans & -ans;

        int left=0;
        int right=0;
        for(int i=0;i<A.length;i++){
            if((A[i]&First_Bit)==1) left^=A[i];
            else right^=A[i];
        }
        System.out.println((-ans));
        System.out.println(left+" "+right);
        System.out.println((left^right));
    }
}

//A single unique number while remaining are repeating three times
class unique{
    public static void main(String argts[]){

        int A[]={2,3,2,1,2,3,5,1,1,3};

        int B[]=new int [32];

        for(int i=0;i<A.length;i++){
            int p=0;
            int num=A[i];
            while(num!=0){
                if((num&1)==0){
                    B[p]++;
                }
                num=num>>1;
                p++;
            }
        }
        int res=0;
        for(int i=0;i<32;i++){
            if(B[i]%3!=0){
                res+=(1<<i);
            }
        }
        System.out.println(res);
    }
}