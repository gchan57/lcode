class Solution {
    static boolean isgood(char[][] board,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num) return false;
        }
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        int initrow=row - (row%3);
        int initcol=col-(col%3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+initrow][j+initcol]==num){
                    return false;
                }

            }

        }
        return true;
    }
    static boolean sudsolver(char[][] board,int row,int col){
       if(row==8 && col==9){
        return true;
       }
       if(col==9){
        row++;
        col=0;
       }
       if(board[row][col]!='.'){
       return sudsolver(board,row,col+1);
       }
       for(char num='1';num<='9';num++){
        if(isgood(board,row,col,num)){
            
            board[row][col]=num;
            if(sudsolver(board,row,col+1)){
                return true;
            }
            board[row][col]='.';
        }
       }
       return false;
    }
    public void solveSudoku(char[][] board) {
        sudsolver(board,0,0);
    }
}