package tictactoegame;

public class TicTacToeGame {

	 static char [] board = new char[10];

	    /* Initializing an array of size 10
	       In array we have to create an empty space for array[index] from 1 to 9.
	     */
	    public static void createBoard(){
	        for (int index=1; index<board.length; index++){
	            board[index] = ' ';
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to Tic Tac Toe Game");
	        createBoard();
	    }
	}
