// import java.util.*;
// public class NQueens {
//     public Boolean isSafe(int row,int col,char[][] board){
//         //horizontal
//         for(int j=0;j<board.length;j++){
//             if(board[row][j]=='Q'){
//                 return false;
//             }
//         }
//         //vertical
//         for(int j=0;j<board.length;j++){
//             if(board[j][col]=='Q'){
//                 return false;
//             }
//         }
//         //diagonals
//         //upper left
//         int r=row;
//         for(int c=col ;c<board.length&&r>=0;c--,r--){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //upper right
//         r=row;
//         for(int c=col ;c<board.length&&r>=0;c++,r--){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //lower left
//         r=row;
//         for(int c=col ;c>=0&&r<board.length;c--,r++){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //lower right
//         r=row;
//         for(int c=col ;c<board.length&&r<board.length;c++,r++){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void saveBoard(char[][] board,List<List<String>> allBoard){
//         String row="";
//         List<String> newBoard = new ArrayList<>();
//         for(int i=0;i<board.length;i++){
//             row="";
//             for(int j=0;j<board.length;j++){
//                 if(board[i][j]=='Q'){
//                     row += 'Q';
//                 }else{
//                     row+='.';
//                 }
//             }
//             newBoard.add(row);
//         }
//         allBoard.add(newBoard);
//     }
//     public void helper(char[][] board,List<List<String>> allBoard,int col){
//         if(col==board.length){
//             saveBoard(board,allBoard);
//             return;
//         }
//         for(int row=0;row<board.length;row++){
//             if(isSafe(row,col,board)){
//                 board[row][col]='Q';
//                 helper(board, allBoard, col+1);
//                 board[row][col]='.';
//             }
//         }
//     }
    // public List<List<String>> solveNQueens(int n){
    //     List<List<String>> allBoard = new ArrayList<>();
    //     char[][] board = new char[n][n];

    //     helper(board, allBoard, 0);
    //     return allBoard;
    // }
    // // public static void main(String args[]){
    // //     Scanner sc = new Scanner(System.in);
    // //     System.out.println("Enter your size of Board n (n x n): ");
    // //     int n = sc.nextInt();
    // //     System.out.println("Running Solver...");
    // //     sc.close();
    // //     }
    // }

//ChatGpt
import java.util.*;
public class NQueens {
    public Boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper left diagonal
        int r = row, c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--; c--;
        }
        
        //upper right diagonal
        r = row; c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--; c++;
        }
        
        //lower left diagonal
        r = row; c = col;
        while (r < board.length && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r++; c--;
        }

        //lower right diagonal
        r = row; c = col;
        while (r < board.length && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r++; c++;
        }

        return true;
    }

    public void saveBoard(char[][] board,List<List<String>> allBoard){
        List<String> newBoard = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder row = new StringBuilder();
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row.append('Q');
                }else{
                    row.append('.');
                }
            }
            newBoard.add(row.toString());
        }
        allBoard.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allBoard,int col){
        if(col==board.length){
            saveBoard(board,allBoard);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board, allBoard, col+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoard, 0);
        return allBoard;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of Board n (n x n): ");
        int n = sc.nextInt();
        NQueens nq = new NQueens();
        System.out.println(nq.solveNQueens(n));
        sc.close();
    }
}
