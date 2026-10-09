class Solution {
    public int minInsertions(String s) {
        Stack<Character> stk = new Stack<>();
        int res = 0, idx = 0;
        while (idx < s.length()) {
            char ch = s.charAt(idx);
            if (ch == '(') {
                stk.push(ch);
            } else {
                if (idx + 1 < s.length() && s.charAt(idx + 1) == ')') {
                    idx++;
                } else {
                    res++;
                }
                if (!stk.isEmpty()) {
                    stk.pop();
                } else {
                    res++;
                }
            }
            idx++;
        }
        return res + stk.size() * 2;
    }
}