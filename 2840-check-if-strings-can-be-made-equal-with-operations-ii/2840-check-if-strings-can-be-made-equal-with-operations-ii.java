class Solution {
    public boolean checkStrings(String s1, String s2) {
        int n=s1.length();
        int c1[]=new int[256];
        int c2[]=new int[256];
        for(int i=0;i<n;i++){
            int x=(i&1)<<7;
            c1[x+s1.charAt(i)]++;
            c2[x+s2.charAt(i)]++;
        }
        return Arrays.equals(c1,c2);
    }
}

// abcdba
// cbadba-0
// cabdba-1
// 