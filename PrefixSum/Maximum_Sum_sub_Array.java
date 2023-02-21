import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        List<Integer> Arr=new ArrayList<>();
        Arr.add(100);
        Arr.add(200);
        Arr.add(300);
        int sum=0,max=0;
        for(int i=0;i<N-K+1;i++){
            sum=Arr.get(i);
            for(int j=i+1;j<K+i;j++){
                sum+=Arr.get(j);
            }
            System.out.println(sum);
            if(max>sum) max=sum;
        }
        System.out.println(max);
    }
}