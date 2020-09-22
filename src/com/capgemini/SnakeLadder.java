package com.capgemini;
import java.util.Random;

public class SnakeLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int PLAYER_INITIAL_POSITION = 0;
	 int playerCount = 1;
     System.out.println("Starting Snake and Ladder Problem.");
     System.out.println("No of players " + playerCount);
     System.out.println("Initial position of player is " + PLAYER_INITIAL_POSITION);
     
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
 
     System.out.println("Number got from rolling the die is "+ number_on_Die);
	}

}
