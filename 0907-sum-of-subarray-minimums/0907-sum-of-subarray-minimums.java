class Solution {
    public int sumSubarrayMins(int[] arr) { 
        int n=arr.length;
        long sum=0;
        long mod=(long)1e9+7;
        int pse[]=findPse(arr);
        int nse[]=findNse(arr);
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long fre=left*right*1L;
            sum=sum+(fre*arr[i])%mod;
        }
        return (int)sum;
    }
    private static int[] findPse(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && arr[stk.peek()]>arr[i]){
                stk.pop();
            }
            res[i]=stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        return res;
    }

    private static int[] findNse(int[] arr){
        Stack<Integer> stk=new Stack<>();
        int n=arr.length;
        int res[]=new int[arr.length];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty() && arr[stk.peek()]>=arr[i]){
                stk.pop();
            }
            res[i]=stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
        return res;
    }
}