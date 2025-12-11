class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int rMax[]=new int[n+1];
        int cMax[]=new int[n+1];
        int rMin[]=new int[n+1];
        int cMin[]=new int[n+1];
        int res=0;
        Arrays.fill(rMin,n+1);
        Arrays.fill(cMin,n+1);
        for(int arr[]:buildings){
            int x=arr[0],y=arr[1];
            rMax[y]=Math.max(rMax[y],x);
            rMin[y]=Math.min(rMin[y],x);
            cMax[x]=Math.max(cMax[x],y);
            cMin[x]=Math.min(cMin[x],y);
        }
        for(int p[]:buildings){
            int x=p[0],y=p[1];
            if(x>rMin[y] && x<rMax[y] && y>cMin[x] && y<cMax[x]){
                res++;
            }
        }
        return res;
    }
}