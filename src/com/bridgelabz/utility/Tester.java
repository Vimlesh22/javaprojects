package com.bridgelabz.utility;

public class Tester {

	public static void main(String[] args) {
		
		Clinique clinique=new Clinique();
		Patient patient=new Patient("Vimlesh", 1,3248888663L);
		clinique.addDPatient(patient);

	}

}
