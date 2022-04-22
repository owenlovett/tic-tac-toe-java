import java.util.Scanner;

public class TicTacToe{

    public static void main(String[] args){

        char[][] boardex = {
            {'1', '|', '2', '|', '3'},
            {'-', '+', '-', '+', '-'},
            {'4', '|', '5', '|', '6'},
            {'-', '+', '-', '+', '-'},
            {'7', '|', '8', '|', '9'}
        };

        char[][] board = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}
        };

        Scanner k = new Scanner(System.in);

        player1turn(board, k);

    }

    private static void player1turn(char[][] board, Scanner k) {
        System.out.println("Where would you like to place your marker? (Please enter 1-9): ");

        int player1input = k.nextInt();

        switch (player1input){
            case 1:
                board[0][0] = 'X';
                break;
            case 2:
                board[0][2] = 'X';
                break;
            case 3:
                board[0][4] = 'X';
                break;
            case 4:
                board[2][0] = 'X';
                break;
            case 5:
                board[2][2] = 'X';
                break;
            case 6:
                board[2][4] = 'X';
                break;
            case 7:
                board[4][0] = 'X';
                break;
            case 8:
                board[4][2] = 'X';
                break;
            case 9:
                board[4][4] = 'X';
                break;
            default:
                System.out.println("Error: Please only input 1-9.");
        }

        printBoard(board);
    }

    private static void player2turn(char[][] board, Scanner k) {
        System.out.println("Where would you like to place your marker? (Please enter 1-9): ");

        int player2input = k.nextInt();

        switch (player2input){
            case 1:
                board[0][0] = 'O';
                break;
            case 2:
                board[0][2] = 'O';
                break;
            case 3:
                board[0][4] = 'O';
                break;
            case 4:
                board[2][0] = 'O';
                break;
            case 5:
                board[2][2] = 'O';
                break;
            case 6:
                board[2][4] = 'O';
                break;
            case 7:
                board[4][0] = 'O';
                break;
            case 8:
                board[4][2] = 'O';
                break;
            case 9:
                board[4][4] = 'O';
                break;
            default:
                System.out.println("Error: Please only input 1-9.");
        }

        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 5; i++){
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2] + " " + board[i][3] + " " + board[i][4]);
        }
    }
}