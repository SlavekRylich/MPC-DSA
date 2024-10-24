package Seznam;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MujSeznam s = new MujSeznam();
		
		boolean jePrazdny;
		
		s.pridej(10);
		s.pridej(100);
		s.pridej(1000);
		s.pridej(10000);
		s.pridej(100000);
		
		jePrazdny = s.jePrazdny();
		
		System.out.println(jePrazdny);
		
		s.vypisHodnoty();
		
		int hodnota = s.smazatPrvni();
		System.out.println("Smazana " + hodnota);
		
		boolean obsahuje = s.obsahuje(10);
		System.out.println(obsahuje);
		
		obsahuje = s.obsahuje(99);
		System.out.println(obsahuje);
		
		System.out.println(s.getVelikost());
		
		s.vypisHodnoty();
		s.reverse();
		s.vypisHodnoty();
	}

}
