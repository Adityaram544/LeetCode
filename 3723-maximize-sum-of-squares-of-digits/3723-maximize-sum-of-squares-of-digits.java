class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        int nines = sum / 9;
        int rem = sum % 9;
        for (int i = 0; i < nines; i++) {
            res.append('9');
        }
        if (rem > 0) {
            res.append((char)('0'+rem));
        }
        int z = num - res.length();
        for (int i = 0; i < z; i++) {
            res.append('0');
        }
        return res.toString();
    }
}