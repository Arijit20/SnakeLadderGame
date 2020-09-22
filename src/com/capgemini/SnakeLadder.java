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
	 int playerCount = 1;
     System.out.println("Starting Snake and Ladder Problem.");
     System.out.println("No of players " + playerCount);
     System.out.println("Initial position of player is " + PLAYER_INITIAL_POSITION);
     
     while(playerPosition < 100) {
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
  
     System.out.println("Number got from rolling the die is "+ number_on_Die);
     
     int option = (int)Math.floor(Math.random()*10) % 3;
     switch(option) {
     case NO_PLAY :
    	 System.out.println("Position of player is :" + playerPosition);
    	 break;
     case LADDER:
    	 playerPosition =+ number_on_Die;
    	 System.out.println("Position of player is :"+ playerPosition);
    	 break;
    	 default:
    		 playerPosition = playerPosition - number_on_Die;
    		 if(playerPosition < 0)
    			 playerPosition = 0;
    	 System.out.println("Position of player is :"+ playerPosition);	 
    	 
       }
     }

	}

}
