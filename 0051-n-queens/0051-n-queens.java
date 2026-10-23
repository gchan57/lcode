class Solution {
    boolean Safea(ArrayList<Integer>board, int crow, int ccol){
         for(int i=0;i<board.size();i++){
            int prow=board.get(i);
            int pcol=i+1;

            if(Math.abs(prow-crow)==Math.abs(pcol-ccol)){
                return false;
            }
         }
         return true;
    }
    void Queen(ArrayList<Integer> board,boolean[] visited , List<List<String>>  res, int col, int limit){
       if(col>limit){
        List<String> finals = new ArrayList<>();
        for(int i=0;i<limit;i++){
            StringBuilder resultant = new StringBuilder();
            for(int j=0;j<limit;j++){
                if(board.get(j)==i+1){
                    resultant.append('Q');
                }
                else{
                    resultant.append('.');
                }
            } 
            finals.add(resultant.toString());
        }
        res.add(finals);
        return;
       }
       for(int row=1;row<=limit;row++){
        if(!visited[row]){
            if(Safea(board,row,col)){
                visited[row]=true;
                board.add(row);
                Queen(board,visited , res,col+1 , limit);
                board.remove(board.size()-1);
                visited[row]=false;
            }
        }
       }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        ArrayList<Integer> board = new ArrayList<>();
        boolean[] visited = new boolean[n+1];
        Queen(board,visited , result, 1 , n);
        return result;
    }
}