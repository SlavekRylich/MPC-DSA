package priklad1;

public class Exec {

	public static void main(String[] args) {
		MujGraf g = new MujGraf();
		
		g.pridej("1", "2", 4);
		g.pridej("1", "6", 6);
		g.pridej("1", "7", 16);
		g.pridej("2", "3", 24);
		g.pridej("3", "4", 9);
		g.pridej("3", "5", 18);
		g.pridej("3", "6", 23);
		g.pridej("4", "5", 11);
		g.pridej("4", "8", 7);
		g.pridej("5", "6", 5);
		g.pridej("5", "7", 10);
		g.pridej("5", "8", 14);
		g.pridej("6", "7", 8);
		g.pridej("7", "8", 21);
		
		g.vytiskni(g.getSpanningTree());
		
		

	}

}
