package exercice_4_TD_4;

public class MainClass {

	public static void main(String[] args) throws AdresseIPException {
		// TODO Auto-generated method stub
		try {		
			AdresseIP AdIP = new AdresseIP(123, 156, 111, 147);
			System.out.println(AdIP.toString());
		} catch (AdresseIPException e ) {
			System.out.println(e);
		}
	}
}
