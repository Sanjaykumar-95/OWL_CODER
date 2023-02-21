import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            space-=2;
            for(int j=i;j>=0;j--) System.out.print("*");
            System.out.println();
        }
        space=2;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            space+=2;
            for(int j=0;j<n-i-1;j++) System.out.print("*");
            System.out.println();
        }
    }
}