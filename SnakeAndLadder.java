package snakesAndLadder;

public class WinPositionUC4 {
	 public static final int NO_PLAY = 0;
     public static final int LADDER = 1;
     public static final int SNAKE = 2;
     public static final int WINNING_POSITION = 100;
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	  int Position = 0;
	      int Roll = 0;
	      int Start = 0;
	      int Reach = 0;

	      //int Value =(int) Math.floor((Math.random() * 6) + 1 );
	      //System.out.println("Die Number Value: " + Value);

	      //for (int Reach = 0; Reach < WINNING_POSITION; Reach++) {
	        while (Reach <= WINNING_POSITION) {
	         Reach++;

	         int Value =(int) Math.floor((Math.random() * 6) + 1 );
	         System.out.println("Die Number Value: " + Value);

	         int option =(int) Math.floor((Math.random() * 10) % 3 );
	         System.out.println("option number: " + option);

	         switch (option) {
	             case NO_PLAY:
	                   Roll = 0;
	                   break;
	             case LADDER:
	                   Roll = + Value;
	                   break;
	             case SNAKE:
	                   Roll = -Value;
	         }
	        Position = (Position + Roll);
	        if (Position < 0) {
	             System.out.println("Current Position: " + Start );
	             Reach = Start;
	             System.out.println("Reached: " + Reach);
	        }
	        else {
	             System.out.println("Current Position: " + Position);
	             Reach = Position;
	             System.out.println("Reached: " + Reach);
	        }
	     }
	        //Reach = Position;
	        System.out.println("Win: " + Reach);
	}
}

