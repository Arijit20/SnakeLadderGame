package com.capgemini;
import java.util.Random;

public class SnakeLadder {
	
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int PLAYER_INITIAL_POSITION = 0;
	 int playerPosition = 0;
	 int playerCount = 2;
	 int dieCount = 0;
	 int ladderCount = 0;
	 int flag = 0;
	 
    System.out.println("Starting Snake and Ladder Problem.");
     System.out.println("No of players :" + playerCount);
     System.out.println("Player 1 is starting the game.");
     System.out.println("Initial position of both the players are " + PLAYER_INITIAL_POSITION);
     
     while(playerPosition < 100) {
     dieCount += 1;
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
     
    // System.out.println("Number got from rolling the die is "+ number_on_Die);
     
     int option = (int)Math.floor(Math.random()*10) % 3;
     switch(option) {
     case NO_PLAY :
    	 System.out.println("Position of player is :" + playerPosition);
    	 break;
    	 
     case LADDER:
    	 while( option == LADDER && playerPosition != 100) {
    		 ladderCount++;
    	 playerPosition =+ number_on_Die;
    	 System.out.println("Position of player is :"+ playerPosition);
    	 if(playerPosition > 100)
    		 playerPosition = playerPosition - number_on_Die;
    	 
    	 if (playerPosition == 100)
    		 flag = 1;
    	 
    	 option = (int)Math.floor(Math.random()*10) % 3;
    	 dieCount++;
    	 }
    	 break;
    	 
    	 default:
    		 playerPosition = playerPosition - number_on_Die;
    		 if(playerPosition < 0)
    			 playerPosition = 0;
    	 System.out.println("Position of player is :"+ playerPosition);	 
    	 
       }
     }
  System.out.println("The die was played "+ dieCount+" times.");
  int a = dieCount - ladderCount;
  if(flag == 0) {
	  if(a % 2 == 0)
		  System.out.println("Player 2 won the match");
	  else 
		  System.out.println("Player 1 won the match");
  }
  else {
	  if(a % 2 == 0)
		  System.out.println("Player 1 won the match");
	  else 
		  System.out.println("Player 2 won the match");
	  
  }
	}

}
