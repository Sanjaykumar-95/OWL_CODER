import java.util.*;
class binary{

    public static void Binary(int n){
        for(int i=5;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Binary(n);
    }
}