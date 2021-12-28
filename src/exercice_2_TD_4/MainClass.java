package exercice_2_TD_4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enfant En = new Enfant();
			
		int Age = En.Age = 20;
			
		try {
			System.out.println(En.getAge().get(Age-1));
		}
		catch(Exception enfant) {
			System.out.println(Age +" ans n'est pas un âge valide !");
		}
	}
}
