package zad2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class HraciPole implements Comparable<HraciPole>{
	
	private int[][] board = { { 7, 2, 4 }, { 5, 0, 6 }, { 8, 3, 1 } };
	static final int UP = 0;
	static final int DOWN = 1;
	static final int RIGHT = 2;
	static final int LEFT = 3;
	
	// actual position 
	private int x = 1;
	private int y = 1;
	
	public void move(int direction) {
		
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
	
	private int BoardToInt() {
		int res = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				res = res * 10 + board[i][j];
			}
		}
		return res;
	}

	@Override
	public int hashCode() {
		int result = this.BoardToInt();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		int here = this.BoardToInt();
		int other = ((HraciPole) obj).BoardToInt();
		
		if (here == other) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public int compareTo(HraciPole other) {
		
		if (this.BoardToInt() > other.BoardToInt()) {
			return 1;
		} else if (this.BoardToInt() < other.BoardToInt()) {
			return -1;
			
		} else {
			return 0;
		}
		
	}
	
	public void MoveMnozina(HashSet<HraciPole> h,HraciPole p,int direct) {
		HraciPole novy;
		novy = p;
		h.add(p); // ulozi stare rozlozeni
		novy.move(direct); // posune nove
		
	}
	
	public void MoveTree(TreeSet<HraciPole> h,HraciPole p,int direct) {
		HraciPole novy = new HraciPole();
		novy.board = new int[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				novy.board[i][j] = p.board[i][j]; 
			}
		}
		
		//novy = p;
		h.add(novy); // ulozi stare rozlozeni
		p.move(direct); // posune nove
	}
	
	
	
	
}
