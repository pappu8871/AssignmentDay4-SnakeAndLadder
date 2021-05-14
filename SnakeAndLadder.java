package snakesAndLadder;

public class CheckOptionUC3 {
	public static void main(String[] args) {
		int IS_NO_PLAY = 0 ;
		int IS_MOVES_HEAD = 1 ;
		int IS_MOVES_BEHAND = 2 ;
		
		// TODO Auto-generated method stub
		int dice = (int) Math.floor(Math.random() * 6) % 2;
		if (dice == IS_NO_PLAY ) {
		System.out.println("Stay in Same position ");
		} else if (dice == IS_MOVES_HEAD) {
			System.out.println("Ladder moves head by the number of position");
		} else {
			System.out.println("Snake moves behind by the number of position");
		}
	}
}

