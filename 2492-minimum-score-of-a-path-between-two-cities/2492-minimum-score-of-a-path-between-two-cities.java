class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int road[]:roads){
            adj.get(road[0]).add(new int[]{road[1],road[2]});
            adj.get(road[1]).add(new int[]{road[0],road[2]});
        }
        boolean vis[]=new boolean[n+1];
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        vis[1]=true;
        int res=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int edge[]:adj.get(cur)){
                int next=edge[0];
                int wt=edge[1];
                res=Math.min(res,wt);
                if(!vis[next]){
                    vis[next]=true;
                    q.offer(next);
                }
            }
        }
        return res;
    }
}