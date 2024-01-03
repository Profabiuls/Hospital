package En;

import java.util.LinkedList;
import java.util.Scanner;

public class Doctor extends Person {
    Scanner keyboard = new Scanner(System.in);
    private String specialization;
    static int patientsInCare = 0;
    static LinkedList<Patient> listPatientsInCare = new LinkedList<>();

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPatientsInCare() {
        return patientsInCare;
    }

/*    public void setPatientsInCare(int patientsInCare) {
        this.patientsInCare = patientsInCare;
    }*/

    String setDoctor;

    public void insertDoctor() {
        Doctor doctor = new Doctor();
        System.out.println("Enter first name: ");
        setDoctor = keyboard.nextLine();
        this.firstName = setDoctor;
        System.out.println("Enter last name: ");
        setDoctor = keyboard.nextLine();
        this.lastName = setDoctor;
        System.out.println("Enter fiscal code: ");
        setDoctor = keyboard.nextLine();
        this.fiscalCode = setDoctor;
        System.out.println("Enter date of birth: ");
        setDoctor = keyboard.nextLine();
        this.dateOfBirth = setDoctor;
        System.out.println("Enter specialization: ");
        setDoctor = keyboard.nextLine();
        this.specialization = setDoctor;
    }
}
