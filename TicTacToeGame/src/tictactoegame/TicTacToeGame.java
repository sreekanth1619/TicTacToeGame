package tictactoegame;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner = new Scanner(System.in);
    static char [] board = new char[10];
    static Random ran=new Random();
    static char playerChoice;
    static char computerChoice;

    /* Initializing an array of size 10
       In array we have to create an empty space for array[index] from 1 to 9.
     */
    public static void createBoard(){
        for (int index=1; index<board.length; index++){
            board[index] = ' ';
        }
    }

    /* In this player have to choose the character value between 'X' or 'O'.
       We have to allow the player to choose between X or O.
     */
    static void choose(){
        System.out.print("Enter your Choice : ");
        char choice = scanner.next().charAt(0);
        if (choice == 'X' || choice == 'x'){
            playerChoice = 'X';
            computerChoice = 'O';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }else if (choice == 'O' || choice == 'o'){
            playerChoice = 'O';
            computerChoice = 'X';
            System.out.println("Player Choice : " + playerChoice);
            System.out.println("Computer Choice : " + computerChoice);
        }
        else {
            System.out.println("Invalid Choice! Enter a valid choice between X or O");
        }
    }
    /* In this method we have to show case the Board.
     */
    static void showBoard() {
    	System.out.println();     //used for empty line
    	System.out.println("Tic Tac Toe Board");
    	System.out.println(board[1] + "   | " + board[2] + "     | " + board[3] );
    	 System.out.println("-----------------");
         System.out.println(board[4] + "   |   " + board[5] + "   |   " + board[6]);
         System.out.println("-----------------");
         System.out.println(board[7] + "   |   " + board[8] + "   |   " + board[9]);
    }
    
    /* Ability for user to make a move to a desired location in the board
     */
    
    static void PlayerMove() {
    	System.out.println("game started its time to player move");
    	int indexNumber = scanner.nextInt();
    	if(indexNumber<1 && indexNumber>9) {
    		System.out.println("invalid choice");
    		
    		/* In this we are checking for empty space.
             */
    		
    	} else if 
    		(board[indexNumber] != ' ') {
                System.out.println("The Index is already occupied kindly choose other index ");
                PlayerMove();
    	}else{
    		board [indexNumber] = playerChoice;
    		showBoard();
    	
    	}
    }
    /* In this we have taken a random menthod to do a toss between Player and Computer
    Winning candidate will play first.
  */
    static void TossToPlay(){
    	int coin = ran.nextInt(2);
    	if(coin==0) {
    		System.out.println("Its Head player won the toss");
    	}else {
    		System.out.println("its Tail computer won the toss");
    	}
    }
/**
 * 
 * main method to call the all static methods
 */
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        choose();
        showBoard();
        PlayerMove();
        TossToPlay();
    }
	}
