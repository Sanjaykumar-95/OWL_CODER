import java.util.*;
class binary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //Set the bit in given position
        int a =12;
        int p=4;
        System.out.println((12|(1<<p)));

        //Unset the bit in given position
        int i=3;
        System.out.println(12&(~(1<<i)));

        //toogle the bit in the given position
        int j=5;
        int x=15; //00001111
        System.out.println(x ^ (j<<1));
    }
}