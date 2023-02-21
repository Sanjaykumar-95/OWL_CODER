class Solution {
    static List<List<Integer>> ans=new ArrayList<>();
    public static void Permutation(int n,int ar[],List<Integer> al,int a[]){
        if(al.size()==n){
            List<Integer> li=new ArrayList<>();
            for(int i=0;i<al.size();i++) li.add(al.get(i));
            if(!ans.contains(li)) ans.add(li);
            return ;
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                al.add(ar[i]);
                a[i]=1;
                Permutation(n,ar,al,a);
                a[i]=0;
                al.remove(al.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans.clear();
        List<Integer> al=new ArrayList<>();
        int n=nums.length;
        int a[]=new int[n];
        Permutation(n,nums,al,a);
        return ans;
    }
}