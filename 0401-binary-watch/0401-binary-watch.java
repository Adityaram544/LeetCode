class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> res=new ArrayList<>();
        for(int h=0;h<12;h++){
            int hBits=Integer.bitCount(h);
            for(int m=0;m<60;m++){
                int totalBits=hBits+Integer.bitCount(m);
                if(totalBits==turnedOn){
                    String x=h + ":" + (m<10 ? "0"+m : m);
                    res.add(x);
                }
            }
        }
        return res;
    }
}