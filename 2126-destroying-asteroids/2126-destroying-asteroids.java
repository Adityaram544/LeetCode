class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long curMass=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++){
            if(asteroids[i]<=curMass){
                curMass+=asteroids[i];
            }else{
                return false;
            }
        }
        return true;
    }
}