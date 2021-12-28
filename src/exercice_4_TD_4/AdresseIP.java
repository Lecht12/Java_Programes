package exercice_4_TD_4;

public class AdresseIP {

	private int[] octets;

	public AdresseIP(int o1,int o2, int o3, int o4) throws AdresseIPException {
		octets = new int[] {o1,o2,o3,o4};
		if (o1 < 0 || o1 > 255) throw new AdresseIPException("valeur incorrecte pour 1ier octet");
		if (o2 < 0 || o2 > 255) throw new AdresseIPException("valeur incorrecte pour 2eme octet");
		if (o3 < 0 || o3 > 255) throw new AdresseIPException("valeur incorrecte pour 3eme octet");
		if (o4 < 0 || o4 > 255) throw new AdresseIPException("valeur incorrecte pour 4eme octet");
		}
		@Override
		public String toString(){
			return octets[0] + "." + octets[1] + "." + octets[2] + "."+ octets[3] ;
		}

}