/* A = 00001000001
   a = 00001100001
   
   B = 00001000010
   b = 00001100010  */



import java.util.*;
class PerfectSquare{

    public static void Binary(int n){
        for(int i=10;i>=0;i--){
            System.out.print((n>>i)&1);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        for(char i='A';i<'E';i++){
            System.out.println(i);
            Binary(i);
        }

        char ch='C';

        System.out.println("Upper Case :"+ch);

        char ans=(char)(ch | (1<<5));
        System.out.println("lower Case :"+ans);
        


    }
}