class Solution {
    public double angleClock(int hour, int minutes) {
        double m=6.0 * minutes;
        double h=30.0 * (hour%12) + 0.5*minutes;
        double d=Math.abs(h-m);
        return Math.min(d,360.0-d);
    }
}