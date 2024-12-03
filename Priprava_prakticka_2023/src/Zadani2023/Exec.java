package Zadani2023;

import java.util.ArrayList;

public class Exec {
	
	
	public static void main(String[] args) {
		Uzel u1 = new Uzel(5);
		Uzel u2 = new Uzel(8);
		Uzel u3 = new Uzel(13);
		Uzel u4 = new Uzel(15);
		Uzel u5 = new Uzel(-1);

		u1.setLevy(u2);
		u1.setPravy(u3);
		u2.setLevy(u4);
		u2.setPravy(u5);
		
		Prumer p = new Prumer();
		Prumer_listy plisty= new Prumer_listy();
		Prumer_vnitrni_uzly puzly = new Prumer_vnitrni_uzly();
		Cesty_k_listum cesty = new Cesty_k_listum();
		
		System.out.println("Prumer: " + p.VypocetPrumeru(u1));
		System.out.println("Prumer listu: " + plisty.VypocetPrumeru(u1));
		System.out.println("Prumer vnitrnich uzlu: " + puzly.VypocetPrumeru(u1));
		ArrayList<ArrayList<Integer>> seznam = cesty.cesty_k_listum(u1);
		System.out.println("Cestz k listum: " + seznam);
	}

}
