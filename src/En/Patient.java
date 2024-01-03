package En;

import java.util.Scanner;

public class Patient extends Person {
    String illnessType;
    int id;

    Scanner keyboard = new Scanner(System.in);

    public String getIllnessType() {
        return illnessType;
    }

    public void setIllnessType(String illnessType) {
        this.illnessType = illnessType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    String medicalRecord;

    String setPatient;

    public void insertPatient() {
        Patient patient = new Patient();
        System.out.println("Enter first name: ");
        setPatient = keyboard.nextLine();
        this.firstName = setPatient;
        System.out.println("Enter last name: ");
        setPatient = keyboard.nextLine();
        this.lastName = setPatient;
        System.out.println("Enter fiscal code: ");
        setPatient = keyboard.nextLine();
        this.fiscalCode = setPatient;
        System.out.println("Enter date of birth: ");
        setPatient = keyboard.nextLine();
        this.dateOfBirth = setPatient;
        System.out.println("Enter illness type: ");
        setPatient = keyboard.nextLine();
        this.illnessType = setPatient;
        System.out.println("Enter text in medical record: ..");
        setPatient = keyboard.nextLine();
        this.medicalRecord = setPatient;
    }
}
