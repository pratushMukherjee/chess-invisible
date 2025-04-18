import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        //instructions

        System.out.println("You are black(lowercase) and you need to checkmate white(upercase) in one move");
        Scanner scanner = new Scanner(System.in);
        System.out.println("type 1 for invisible or 0 for visible");
        int mode = scanner.nextInt();

        String[][] board = Puzzle.getMateInOnePuzzle();

        if (mode == 0) {
            printBoard(board);  // Print the board if mode is 0 (visible)
        } else if (mode == 1) {
            System.out.println("Invisible mode selected. Good luck!"); 
            Board.printBoard(board); //print invisible board where you will know where the index and pieces are located
        } else {
            System.out.println("Invalid input. Please enter 0 for visible or 1 for invisible.");
        }

        boolean solved = false;
        //while loop to give user unlimited tries until user passes the puzzle
        while (!solved) {
            System.out.println("Enter your move (starting ending) example: c1 h8");
            String from = scanner.next(); // "c1"    stores starting square in from
            String to = scanner.next();   // "h8"    stores ending square in to

            // Split input into letter and number
            String startletter = from.substring(0, 1);   //store letter of index
            int startnumber = Integer.parseInt(from.substring(1));  //store number of index

            String endletter = to.substring(0, 1);      //store letter of index
            int endnumber = Integer.parseInt(to.substring(1));   //store number of index

            // call move method
            Board.move(board, startletter, startnumber, endletter, endnumber);

            if (Puzzle.isPuzzleSolved(board)) {
                System.out.println(" You passed!");
                if (mode == 0) {
                    printBoard(board);
                }
                solved = true;
            } else {
                System.out.println(" Wrong move. Hint: Do you see a strong check with your rook? ");
                board = Puzzle.getMateInOnePuzzle();
                if (mode == 0) {
                    printBoard(board);
                }
            }
        }

        scanner.close();
    }


    // Helper method to print the board
    public static void printBoard(String[][] board) {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < board.length; i++) {
            System.out.print(8 - i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
