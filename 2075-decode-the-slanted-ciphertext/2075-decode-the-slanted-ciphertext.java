class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==0) return "";
        int n=encodedText.length();
        if(n==0) return "";
        int cols=n/rows;
        char mat[][]=new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=encodedText.charAt(k++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int x=0;x<cols;x++){
            int i=0,j=x;
            while(i<rows && j<cols){
                sb.append(mat[i][j]);
                i++;
                j++;
            }
        }
        int e=sb.length()-1;
        while(e>=0 && sb.charAt(e)==' '){
            e--;
        }
        return sb.substring(0,e+1);
    }
}