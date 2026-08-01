class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList<>();
        helper(res,s,0,"");
        return res;
    }
    private void helper(List<String> res,String s,int i,String cur){
        if(i==s.length()){
            res.add(cur);
            return;
        }
        char ch=s.charAt(i);
        if(Character.isDigit(ch)){
            helper(res,s,i+1,cur+ch);
        }else{
            helper(res,s,i+1,cur+Character.toLowerCase(ch));
            helper(res,s,i+1,cur+Character.toUpperCase(ch));
        }
    }
}