import java.util.*;
class PerfectSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if((n & (n-1))==0) System.out.println("Perfect Square");
        else System.out.println("Not a Perfect Square");
    }
}