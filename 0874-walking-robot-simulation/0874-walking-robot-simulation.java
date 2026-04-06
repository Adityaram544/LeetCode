class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x=0,y=0;
        Set<String> set=new HashSet<>();
        for(int obs[]:obstacles){
            int a=obs[0],b=obs[1];
            set.add(a+","+b);
        }
        int dir[][]={ {0,1},{1,0},{0,-1},{-1,0} };
        int d=0;
        int maxDist=0;
        for(int c:commands){
            if(c==-1){
                d=(d+1)%4;
            }else if(c==-2){
                d=(d+3)%4;
            }else{
                while(c-->0){
                    int dx=x+dir[d][0];
                    int dy=y+dir[d][1];
                    if(set.contains(dx+","+dy)) break;
                    x=dx;
                    y=dy;
                    maxDist=Math.max(maxDist,(x*x)+(y*y));
                }
            }
        }
        return maxDist;
    }
}