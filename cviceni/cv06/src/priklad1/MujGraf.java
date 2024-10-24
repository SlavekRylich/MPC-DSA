package priklad1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MujGraf {
	private HashMap<String, Uzel> uzly = new HashMap<String, Uzel>();
	private HashSet< Hrana> hrany = new HashSet<Hrana>();
	private int barva = 0;
	
	

	public void pridej(String odkudID, String kamID, int vaha) {
		Uzel odkudUzel = VyberExistujici(odkudID);
		Uzel kamUzel = VyberExistujici(kamID);
		Hrana novaHrana = new Hrana(odkudUzel, kamUzel, vaha);
		hrany.add(novaHrana);
		
	}



	private Uzel VyberExistujici(String string) {
		Uzel u = getUzly().get(string);
		if (u == null) {
			u = new Uzel(string);
			getUzly().put(string, u);
			u.setBarva(barva++);
		}
		return u;
	}



	public void vytiskni(ArrayList<Hrana> hr) {
		for (Hrana hrana : hr) {
			System.out.println(hrana);
		}
		
	}
	
	public ArrayList<Hrana> getSpanningTree() {
		//vytvor les
		HashMap<Uzel, Set<Uzel>> les = new HashMap<Uzel, Set<Uzel>>();
		inicialiyujLes(les);
		ArrayList<Hrana> minSpanningTree = new ArrayList<Hrana>();
		nalezniKostruGrafu(les, minSpanningTree);
		return minSpanningTree;
		
		
	}



	private void nalezniKostruGrafu(HashMap<Uzel, Set<Uzel>> les, ArrayList<Hrana> minSpanningTree) {
		LinkedList<Hrana> hranyList = new LinkedList<Hrana>(getHrany());
		 hranyList.sort(null);
		 
		 for (Hrana hrana: hranyList) {
			 Set<Uzel> mnozinaUzlu1 = les.get(hrana.getOdkudUzel());
			 Set<Uzel> mnozinaUzlu2 = les.get(hrana.getKamUzel());
			 if (!mnozinaUzlu1.equals(mnozinaUzlu2)) {
				 minSpanningTree.add(hrana);
				 
				 mnozinaUzlu1.addAll(mnozinaUzlu2);
				 
				 for (Uzel uzel : mnozinaUzlu1) {
					les.put(uzel, mnozinaUzlu1);
				}
			 }
		 }
		
	}

	

	public HashMap<String, Uzel> getUzly() {
		return uzly;
	}



	public void setUzly(HashMap<String, Uzel> uzly) {
		this.uzly = uzly;
	}



	private void inicialiyujLes(HashMap<Uzel, Set<Uzel>> les) {
		for (Uzel uzel : uzly.values()) {
			les.put(uzel, new HashSet<Uzel>());
			les.get(uzel).add(uzel);
		}
	}



	public HashSet<Hrana> getHrany() {
		return hrany;
	}



	public void setHrany(HashSet<Hrana> hrany) {
		this.hrany = hrany;
	}

	

}
