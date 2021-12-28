package exercice_2_TD_4;

import java.util.ArrayList;
import java.util.List;

public class Enfant {
	public int Age ;
	List<Integer> age=new ArrayList<Integer>(); 
	
	public Enfant( ) {

	}
	
	public List<Integer> getAge() {
		for(int i = 1; i<=10 ; i++) {
			age.add(i);
		}
		return age;
	}
}
