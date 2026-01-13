class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();
        for(char x:num.toCharArray()){
            while(!stk.isEmpty() && k>0 && x<stk.peek()){
                stk.pop();
                k--;
            }
            stk.push(x);
        }
        while(k>0 && !stk.isEmpty()){
            stk.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0 ? "0" : sb.toString();
    }
}