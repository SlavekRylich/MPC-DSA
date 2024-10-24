package Seznam;

public class Uzel {
	private Integer data;
	private Uzel dalsi;
	private Uzel predchozi;

	public Uzel getPredchozi() {
		return predchozi;
	}

	public void setPredchozi(Uzel predchozi) {
		this.predchozi = predchozi;
	}


	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Uzel getDalsi() {
		return dalsi;
	}

	public void setDalsi(Uzel dalsi) {
		this.dalsi = dalsi;
	}

	
	
}
