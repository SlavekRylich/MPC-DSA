package Hra;

public class HraciPole {
	
	private int[][] board = { { 7, 2, 4 }, { 5, 0, 6 }, { 8, 3, 1 } };
	static final int UP = 0;
	static final int DOWN = 1;
	static final int RIGHT = 2;
	static final int LEFT = 3;
	
	private int x = 1;
	private int y = 1;
	
	public void move(int direction) {
		try {
			
		
		switch (direction) {
		case UP: {
			if ((x-1) >= 0) {
				board[x][y] = board[x-1][y];
				x--;
				board[x][y] = 0;
			} else {
				this.hlaska();
			}
			break;
		}
		case DOWN: {
			if ((x+1) < board.length) {
				board[x][y] = board[x+1][y];
				x++;
				board[x][y] = 0;
			} else {
				this.hlaska();
			}
			break;
		}
		case RIGHT: {
			if ((y+1) < board.length) {
				board[x][y] = board[x][y+1];
				y++;
				board[x][y] = 0;
			} else {
				this.hlaska();
			}
			break;
		}
		case LEFT: {
			if ((y-1) >= 0) {
				board[x][y] = board[x][y-1];
				y--;
				board[x][y] = 0;
			} else {
				this.hlaska();
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + direction);
		}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Chybny posun, mimo pole...");
		}
	}
	
	private void hlaska() {
		System.out.println("Pres okraj nelze!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String g = new String();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				g = g + this.board[i][j];
				g = g + " ";
			}
			g = g + "\n";
		}
		return g;
	}
}
