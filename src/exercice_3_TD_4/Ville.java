package exercice_3_TD_4;

public class Ville {

	public String nom ;
	public static int population;
	public String Pays ;
	
	public Ville(String nom, int population, String pays) {
		this.nom = nom;
		Ville.population = population;
		this.Pays = pays;
	}
	
    static public int posPopulation() throws PopulationException 
    {
        if (Integer.valueOf(population) >= 0)
            {
                return population;
            }
        else 
            {
                throw new PopulationException ("Error, number can't be negative.");
            }
    }
	
}