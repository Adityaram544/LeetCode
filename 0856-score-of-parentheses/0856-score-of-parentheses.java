class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stk=new Stack<>();
        stk.push(0);
        for(char c:s.toCharArray()){
            if(c=='('){
                stk.push(0);
            }else{
                int x=stk.pop();
                int score;
                if(x==0){
                    score=1;
                }else{
                    score=2*x;
                }
                stk.push(stk.pop()+score);
            }
        }
        return stk.peek();
    }
}