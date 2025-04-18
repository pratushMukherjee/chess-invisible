public class Puzzle {
    
    public static String[][] getMateInOnePuzzle() {
        // in order to solve this you have to do check mate in one move as black
        String[][] puzzleBoard = {
            //(White = uppercase, Black = lowercase)
            {"p", ".", "r", ".", "k", ".", ".", "r"}, // 8
            {".", "p", ".", ".", ".", "p", "B", "p"}, // 7
            {".", ".", ".", "b", ".", ".", "k", "."}, // 6
            {".", ".", ".", "p", ".", ".", "K", "K"}, // 5
            {".", ".", ".", ".", ".", ".", ".", "."}, // 4
            {"P", ".", ".", ".", ".", ".", ".", "P"}, // 3
            {".", "p", ".", ".", ".", "P", "p", "."}, // 2
            {".", ".", ".", ".", ".", ".", "K", "."}  // 1
            // a    b    c    d    e    f    g    h
        };
        return puzzleBoard;


      
    }
//method checks if puzzle is solved 
    public static boolean isPuzzleSolved(String[][] board) {
        
        return board[7][2].equals("r");
    }
    
    
}
