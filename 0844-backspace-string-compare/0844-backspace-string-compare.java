class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1=new Stack<>();
        Stack<Character> stk2=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!stk1.isEmpty()) stk1.pop();
            }
            else stk1.push(c);
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(!stk2.isEmpty()) stk2.pop();
            }
            else stk2.push(c);
        }
        return stk1.equals(stk2);
    }
}