
package snakesAndLadder;

public class StartLadderUC1 {
	public static void main(String[] args){
		int IS_START = 1;
	    int game = (int) Math.floor(Math.random() * 6) % 2;
		if (game == IS_START) {
			System.out.println("Start the Game");
		} else
			System.out.println("Not Start the Game");
	}
}
