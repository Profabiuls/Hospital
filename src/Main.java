import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Ciao segui il menu' per entrare nelle diverse sezioni...");
        System.out.println("1 Per inserire un ospedale\n" +
                "2 Per rimuovere un ospedale");

        int scelta;
        scelta = Integer.parseInt(tastiera.nextLine());
        while (true) {
            switch (scelta) {
                case 1:
                    LinkedList<Ospedale> elencoOspedali = new LinkedList<Ospedale>();
                    String testo;
                    System.out.println("Inserisci il nome dell ospedale : ");
                    testo = tastiera.nextLine();
                    Ospedale ospedale = new Ospedale(testo);
                    elencoOspedali.add(ospedale);
                    break;
                case 2:
                    // altri casi possibili
                case 3:
                    // istruzioni da eseguire se l'espressione ha valore2
                    break;
                // altri casi possibili
                default:
                    // istruzioni da eseguire se l'espressione non corrisponde a nessuno dei casi precedenti
            }

        }
    }
}
