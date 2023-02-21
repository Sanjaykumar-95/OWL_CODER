import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int top=0;
        int left=0;
        int right=2*n-2;
        int down=2*n-2;
        for(int i=0;i<2*n-1;i++){
            
        }
    }
}

int n=arr.size();
int ar[]=new int[n];
int prefix[]=new int[n];
int sufix[]=new int [n];

int k=0;
for(int ele:arr){
    ar[k]=ele;
    k++;
}

prefix[0]=ar[0];
for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+ar[i];

sufix[n-1]=ar[n-1];
for(int i=n-2;i>=0;i--) sufix[i]=sufix[i+1]+ar[i];

int count=0;

for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(prefix[i]==sufix[j]) count++;
    }
}

return count;