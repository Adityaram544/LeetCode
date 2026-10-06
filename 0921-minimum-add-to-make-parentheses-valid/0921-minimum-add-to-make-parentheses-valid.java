class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        int cnt=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                stk.push(c);
            }else{
                if(stk.isEmpty()) cnt++;
                else stk.pop();
            }
        }
        return cnt+stk.size();
    }
}