package En;

import java.util.LinkedList;
import java.util.Scanner;

public class Hospital {
    String name;
    String address;
    String province;
    int employeeCount;
    Scanner keyboard = new Scanner(System.in);
    LinkedList<Doctor> doctorsList = new LinkedList<>();
    LinkedList<Patient> patientsList = new LinkedList<>();

    Hospital(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public void menu() {

        int choice = 100;

        while (choice != 0) {
            System.out.println("""
                    Hello, follow the menu to access different sections...
                    1 To add a doctor
                    2 To remove a doctor
                    3 To add a patient
                    4 To remove a patient
                    5 To view the list of doctors
                    6 To view the list of patients
                    7 Assign a patient to a doctor
                    0 To exit
                    """);
            try {
                choice = Integer.parseInt(keyboard.nextLine());

                switch (choice) {
                    case 1:
                        Doctor doctor = new Doctor();
                        doctor.insertDoctor();
                        doctorsList.add(doctor);
                        employeeCount += 1;
                        break;
                    case 2:
                        System.out.println("Enter the last name of the doctor to remove: ");
                        String text = keyboard.nextLine();
                        doctorsList.removeIf(i -> i.lastName.equals(text));
                        break;
                    case 3:
                        Patient patient = new Patient();
                        patient.insertPatient();
                        patientsList.add(patient);
                        break;
                    case 4:
                        System.out.println("Enter the last name of the patient to remove: ");
                        text = keyboard.nextLine();
                        patientsList.removeIf(i -> i.lastName.equals(text));
                        break;
                    case 5:
                        for (Doctor i : doctorsList) {
                            System.out.println(i.firstName + " " + i.lastName + " Number of patients " + i.getPatientsInCare());
                        }
                        break;
                    case 6:
                        for (Patient i : patientsList) {
                            System.out.println(i.firstName + " " + i.lastName + " Medical record: " + i.medicalRecord);
                        }
                        break;
                    case 7:
                        // to be defined the logic properly
                        // En.Doctor.listPatientsInCare.add();
                        break;
                    case 0:
                        break;
                    default:
                        // instructions to be executed if the expression does not match any of the previous cases
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\nYou did not enter a valid number, \nor you entered a letter, try again!..");
            }
        }
    }
}
