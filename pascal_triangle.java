import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=(n*2);
        int ar[][]=new int[n][m];

        ar[0][m/2]=1;

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                ar[i][j]=ar[i-1][j-1]+ar[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}