import java.util.*;
import java.util.ArrayList;

class Patient {
    private String name;
    private String contactNumber;
    private List<String> medicalHistory;

    public Patient(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.medicalHistory = new ArrayList<>();
    }

    public void addMedicalHistory(String history) {
        medicalHistory.add(history);
    }

    // Getters and setters for patient attributes
}

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Getters and setters for doctor attributes
}

class Hospital {
    private List<Doctor> doctors;

    public Hospital() {
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayPatientDetails(String doctorName) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equals(doctorName)) {
                List<Patient> patients = doctor.getPatients();
                System.out.println("Patients of " + doctorName + ":");
                for (Patient patient : patients) {
                    System.out.println("Patient Name: " + patient.getName());
                    System.out.println("Contact Number: " + patient.getContactNumber());
                    System.out.println("Medical History: " + patient.getMedicalHistory());
                    System.out.println("------------------------");
                }
                return;
            }
        }
        System.out.println("Doctor not found!");
    }
}

public class HospitalManagementApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Dr. John Doe", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Jane Smith", "Pediatrics");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Patient patient1 = new Patient("Alice", "1234567890");
        Patient patient2 = new Patient("Bob", "9876543210");

        doctor1.addPatient(patient1);
        doctor2.addPatient(patient2);

        patient1.addMedicalHistory("High blood pressure");
        patient2.addMedicalHistory("Asthma");

        hospital.displayPatientDetails("Dr. John Doe");
    }
}
