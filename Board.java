public class Board {
   

    
    public static void printBoard(String[][] board){            //method prints invisible board( you can only see the index and pieces)
            
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char column = (char) ('a' + j);
                int row = 8 - i;
                System.out.println(column + "" + row + ": " + board[i][j]);
            }
        }
        }
        public static void move(String[][] board, String sa,int sn, String fl,int fn){         // method allows user to move chess piece
            int startCol = sa.charAt(0) - 'a';
            int startRow = 8 - sn;
        
            int endCol = fl.charAt(0) - 'a';
            int endRow = 8 - fn;
        
            board[endRow][endCol] = board[startRow][startCol];
            board[startRow][startCol] = "."; // empty the starting square
            }
    
    



}


