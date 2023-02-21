import java.util.*;
class sample{
    public static void main(String args[]){
        String s="pwwkew";
        String st="";
        int max=0;
        int j=0;
        while(j<s.length()){
            for(int i=0;i<s.length();i++){
                if(!st.contains(s.charAt(i)+"")){
                    st+=s.charAt(i);
                    System.out.println(st);
                    max=Math.max(max,st.length());
                    System.out.println(max);
                }
            }
            st="";
            j++;
        }
        System.out.println();System.out.println();System.out.println(max);
    }
}