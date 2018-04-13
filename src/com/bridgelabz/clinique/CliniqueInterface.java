/**
 * Purpose:Provides interface for implementing class
 * @author Vimlesh Kumar
 * @since 13-04-2017
 *
 */
package com.bridgelabz.clinique;
import java.util.List;
public interface CliniqueInterface 
{
	void menu();
	void readFile();
	void addDoctor();
	void saveDoctor();
	void displayDoctor();
	void addPatient();
	void savePatient();
	void displayPatient();
	Doctor searchDoctorById(int id);
	Doctor searchDoctorByName(String name);
	List<Doctor> searchDoctorBySpecialization(String specialization);
	List<Doctor> searchDoctorByAvailability(String availability);
	Patient searchPatientByName(String patientName2);
	Patient searchPatientById(int patientId);
	Patient searchPatientByPhoneNo(long phoneNo);
	void takeAppointment(String doctorName2, String patientName1) ;
	void popularDoctor();
}
