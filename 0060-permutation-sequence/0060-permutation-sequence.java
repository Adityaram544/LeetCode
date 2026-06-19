class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        int fact=1;
        k-=1;
        List<Integer> lst=new ArrayList<>();
        for(int i=1;i<=n;i++){
            fact*=i;
            lst.add(i);
        }
        fact=fact/n;
        while(true){
            sb.append(lst.get(k/fact));
            lst.remove(k/fact);
            if(lst.size()==0) break;
            k%=fact;
            fact/=lst.size();
        }
        return sb.toString();
    }
}