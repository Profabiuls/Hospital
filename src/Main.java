
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        LinkedList<Ospedale> elencoOspedali = new LinkedList<Ospedale>();
        System.out.println(
                        " _____  _______  _____  _____ _______ _______      \n" +
                        "|     | |______ |_____]   |      |    |_____| |    \n" +
                        "|_____| ______| |       __|__    |    |     | |_____"
        );
        int scelta;

        while (true) {
            System.out.println(" Ciao segui il menu' per entrare nelle diverse sezioni...\n" +
                    "1 Per inserire un ospedale\n" +
                    "2 Per rimuovere un ospedale\n" +
                    "3 per visualizzare l' elenco\n" +
                    "0  per  uscire");
            try {
                scelta = Integer.parseInt(tastiera.nextLine());


                switch (scelta) {
                    case 1:
                        String testo;
                        System.out.println("Inserisci il nome dell ospedale : ");
                        testo = tastiera.nextLine();
                        Ospedale ospedale = new Ospedale(testo);
                        elencoOspedali.add(ospedale);
                        break;
                    case 2:
                        do {
                            System.out.println("1 Per rimuovere l'ultimo\n" +
                                    "2 Per rimuovere il primo\n" +
                                    "0 Per tornare al menu' precedente");
                            scelta = Integer.parseInt(tastiera.nextLine());
                            if (scelta == 1) {
                                elencoOspedali.removeLast();
                            }
                            if (scelta == 2) {
                                elencoOspedali.removeFirst();
                            }
                        } while (scelta != 0);

                    case 3:
                        System.out.println("Elenco ospedali creati: \n");
                        for (Ospedale i : elencoOspedali) {
                            System.out.println(i.getNome());
                        }
                        break;
                    // altri casi possibili
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        // istruzioni da eseguire se l'espressione non corrisponde a nessuno dei casi precedenti
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage() + "\nNon hai inserito un numero valido, \n" +
                        "oppure hai inserito una lettera, ritenta!..");
            }
        }
    }
}