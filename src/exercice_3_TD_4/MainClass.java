package exercice_3_TD_4;

public class MainClass {
	
	public static void main(String[] args) throws PopulationException {
		
		// TODO Auto-generated method stub
		Ville.population = -55;
		try {
			System.out.println(Ville.posPopulation());
		}	
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
