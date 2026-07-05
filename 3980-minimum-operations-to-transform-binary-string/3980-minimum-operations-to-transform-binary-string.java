class Solution {
    public int minOperations(String s1, String s2) {
        if(s1.length() != s2.length()) return -1;
        int count = 0;
        int n = s1.length();
        char[] arr = s1.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i] == s2.charAt(i)) continue;
            if(arr[i] == '0'){
                count += 1;
                arr[i] = '1';
            }
            else{
                if(i<n-1){
                    if(arr[i+1] == '0') count += 2;
                    else count += 1;
                    arr[i+1] = '0';
                }
                else{
                    if(i>0) count += 2;
                    else return -1;
                }
            }
        }
        return count;
        
    }
}