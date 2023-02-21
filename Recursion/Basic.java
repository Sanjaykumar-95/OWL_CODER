import java.util.*;
class Recursion{
    public static void Print(int n){
        if(n>10) return ;
        System.out.print(n+" ");
        n+=1;
        Print(n);
    }

    public static void PrintReverse(int m){
        if(m<=0) return ;
        System.out.print(m+" ");
        m-=1;
        PrintReverse(m);
    }

    public static boolean PalindromeString(String s,int i,int j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        else if(i>=j) return true;
        i+=1;
        j-=1;
        return PalindromeString(s,i,j);
    }

    public static void PrintBT(int n){
        if(n<1) return ;
        PrintBT(n-1);
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        Print(n);
        System.out.println();
        PrintReverse(m);
        System.out.println();
        if(PalindromeString(s,0,s.length()-1)) System.out.println("Is a Palindrome");
        else System.out.println("Not a Palindrome");
        PrintBT(10);
    }
}