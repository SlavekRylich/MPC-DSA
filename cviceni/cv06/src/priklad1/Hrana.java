package priklad1;


public class Hrana implements Comparable<Hrana> {
	private Uzel odkudUzel;
	private Uzel kamUzel;
	private int vaha;
	

	public Hrana(Uzel odkudUzel, Uzel kamUzel, int vaha) {
		super();
		this.odkudUzel = odkudUzel;
		this.kamUzel = kamUzel;
		this.vaha = vaha;
	}


	public Uzel getOdkudUzel() {
		return odkudUzel;
	}


	public void setOdkudUzel(Uzel odkudUzel) {
		this.odkudUzel = odkudUzel;
	}


	public Uzel getKamUzel() {
		return kamUzel;
	}


	public void setKamUzel(Uzel kamUzel) {
		this.kamUzel = kamUzel;
	}


	public int getVaha() {
		return vaha;
	}


	public void setVaha(int vaha) {
		this.vaha = vaha;
	}


	@Override
	public String toString() {
		return "Hrana [odkudUzel=" + odkudUzel + ", kamUzel=" + kamUzel + ", vaha=" + vaha + "]";
	}


	@Override
	public int compareTo(Hrana o) {
		Integer vaha1 = this.getVaha();
		Integer vaha2 = o.getVaha();
		return vaha1.compareTo(vaha2);
	}


	

	
	

	
	
	
}
