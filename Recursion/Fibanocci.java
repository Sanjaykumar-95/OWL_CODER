import java.util.*;
class Recursion{
    public static void Print(int n){
        
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