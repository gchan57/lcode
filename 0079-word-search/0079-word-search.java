class Solution {
    public boolean truthfinder(char[][] board,String word,int i,int j,int windex){
        int wlen = word.length();
        int m=board.length;
        int n=board[0].length;
        if(wlen==windex) return true;
        if(i<0 || j<0 || i>=m || j>=n) return false;
        if(board[i][j]==word.charAt(windex)){
            char t= board[i][j];
            board[i][j]='@';
            boolean chkr=truthfinder(board,word,i-1,j,windex+1) ||
                         truthfinder(board,word,i+1,j,windex+1) ||
                         truthfinder(board,word,i,j-1,windex+1) ||
                         truthfinder(board,word,i,j+1,windex+1) ;
            board[i][j]=t;
            return chkr;
        }
        return false;
    }


    public boolean exist(char[][] board, String word) {
        int wlen = word.length();
        int m=board.length;
        int n=board[0].length;
        if(wlen > (m*n)) return false;    
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0)==board[i][j]){
                    if(truthfinder(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}