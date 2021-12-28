package exercice_6_TD_2;

import java.time.LocalDate;

public class Associe extends Employe {

    public static double BN;
    public double x;

    //constructor
    
	public Associe(double BN,double x,String matricule , String nom, String prenom, LocalDate date_de_naissance) {
		super(matricule,nom, prenom,date_de_naissance);
		Associe.BN = BN;
		this.x = x;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Associe : ------- " + super.toString() + "\n Salaire :"+getSalaire();
	}
	
    @Override
	public double getSalaire() {
    	return BN * (x/100);
	}
}
