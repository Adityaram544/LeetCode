class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int s[]:reservedSeats){
            int r=s[0];
            int c=s[1];
            map.computeIfAbsent(r,k->new HashSet()).add(c);
        }
        int res=(n-map.size())*2;
        for(Set<Integer> seats:map.values()){
            boolean l=true;
            boolean m=true;
            boolean r=true;
            for(int x:seats){
                if(x>=2 && x<=5){
                    l=false;
                }
                if(x>=4 && x<=7){
                    m=false;
                }
                if(x>=6 && x<=9){
                    r=false;
                }
            }
            if(l && r){
                res+=2;
            }else if(l || m || r){
                res+=1;
            }
        }
        return res;
    }
}