package exercice_6_TD_2;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//objects
		Ouvrier Em = new Ouvrier("j54a54e","said","EL GHAZAL",LocalDate.of(2000,02,01), LocalDate.of(2019,02,01));
		Cadre Ca = new Cadre(3,"j54a54e","said","EL GHAZAL",LocalDate.of(2000,02,01));
		Associe As = new Associe(2500, 20, "j54a54e","said","EL GHAZAL",LocalDate.of(2000,02,01));
	
		// calling Methods
	
		//Ouvrier
		System.out.println(Em.toString());
		
		//Cadre
		System.out.println(Ca.toString());
		
		//Associe
		System.out.println(As.toString());
		
	}

}
