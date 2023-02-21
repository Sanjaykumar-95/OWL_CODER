import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a="1010";
        String b="0000";
        String ans="";
        int i=a.length(),j=b.length();
        char carry='';
        while(i>=0 || j>=0){
            if(a.charAt(i).equals('1') && a.charAt(j).equals('1')){
                carry='1';
            }
            else if(a.charAt(i).equals('0') && a.charAt(j).equals('0') && carry.equals('1')){
                
            }
        }
    }
}