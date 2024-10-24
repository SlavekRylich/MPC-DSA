package priklad_01;

public class Exec {

	public static void main(String[] args) {
		MujStrom strom = new MujStrom();
		
		strom.vlozit(7);
		strom.vlozit(5);
		strom.vlozit(14);
		strom.vlozit(1);
		strom.vlozit(6);
		strom.vlozit(16);
		strom.vlozit(10);
		strom.vlozit(8);
		
		int pocet = strom.vypisStrom();
		System.out.println("celk pocet : "+pocet);
		
		System.out.println(" Nejvetsi: "+strom.nejvetsi().getData());
		
	}

}
