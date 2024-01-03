package En;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        LinkedList<Hospital> hospitalsList = new LinkedList<>();
        System.out.println("""
                 __   __  _______  _______  _______  ___   _______  _______  ___    \s
                |  | |  ||       ||       ||       ||   | |       ||   _   ||   |   \s
                |  |_|  ||   _   ||  _____||    _  ||   | |_     _||  |_|  ||   |   \s
                |       ||  | |  || |_____ |   |_| ||   |   |   |  |       ||   |   \s
                |       ||  |_|  ||_____  ||    ___||   |   |   |  |       ||   |___\s
                |   _   ||       | _____| ||   |    |   |   |   |  |   _   ||       |
                |__| |__||_______||_______||___|    |___|   |___|  |__| |__||_______|
                """
        );
        int choice;

        while (true) {
            System.out.println(""" 
                    Hello, follow the menu to access different sections... 
                    1 To add a hospital
                    2 To remove a hospital
                    3 To view the list
                    4 To choose a hospital
                    0 To exit
                    """);
            try {
                choice = Integer.parseInt(keyboard.nextLine());

                switch (choice) {
                    case 1:
                        String text;
                        System.out.println("Enter the name of the hospital: ");
                        text = keyboard.nextLine();
                        Hospital hospital = new Hospital(text);
                        hospitalsList.add(hospital);
                        break;
                    case 2:
                        do {
                            System.out.println("""
                                    1 To remove the last
                                    2 To remove the first
                                    0 To return to the previous menu
                                    """);
                            choice = Integer.parseInt(keyboard.nextLine());
                            if (choice == 1) {
                                hospitalsList.removeLast();
                            }
                            if (choice == 2) {
                                hospitalsList.removeFirst();
                            }
                        } while (choice != 0);
                        break;
                    case 3:
                        System.out.println("List of created hospitals: \n");
                        for (Hospital i : hospitalsList) {
                            System.out.println(i.getName() + " Number of employees: " + i.getEmployeeCount());
                        }
                        break;
                    case 4:
                        String hospitalChoice = "";
                        System.out.println("Choose a hospital and enter the name to enter the menu:..");
                        hospitalChoice = keyboard.nextLine();
                        for (Hospital i : hospitalsList) {
                            if (i.name.equals(hospitalChoice)) {
                                i.menu();
                            } else {
                                System.out.println("The entered name does not match any hospital, try again.. ");
                            }
                        }
                        break;
                    case 0:
                        System.exit(0);
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
