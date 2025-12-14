class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char c:jewels.toCharArray()){
            set.add(c);
        }
        for(char s:stones.toCharArray()){
            if(set.contains(s)) count++;
        }
        return count;
    }
}