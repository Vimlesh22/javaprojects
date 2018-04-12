package com.bridgelabz.clinique;

import java.util.Comparator;

public class SortByNoOfPatient implements Comparator<Doctor> {

	@Override
	public int compare(Doctor doctor1, Doctor doctor2) {
		
		return doctor1.getNoOfPatients()-doctor2.getNoOfPatients();
	}

}
