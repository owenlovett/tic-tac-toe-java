public class TicTacToe{

    public static void main(String[] args){

        char[][] board = {
            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}
        };

        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 5; i++){
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " " + board[i][4]);
        }
    }
}