
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        LinkedList<Ospedale> elencoOspedali = new LinkedList<Ospedale>();
        System.out.println("""
                  _____  _______  _____  _____ _______ _______  
                 |     | |______ |_____]   |      |    |_____| |   
                 |_____| ______| |       __|__    |    |     | |_____
                """
        );
        int scelta;

        while (true) {
            System.out.println(""" 
                    Ciao segui il menu' per entrare nelle diverse sezioni... 
                    1 Per inserire un ospedale
                    2 Per rimuovere un ospedale
                    3 Per visualizzare l' elenco
                    4 Per scegliere un'ospedale
                    0  per  uscire
                    """);
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
                            System.out.println("""
                                    1 Per rimuovere l'ultimo
                                    2 Per rimuovere il primo
                                    0 Per tornare al menu' precedente
                                    """);
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
                            System.out.println(i.getNome() + " Numero dipendenti : " + i.numeroDipendenti);
                        }
                        break;

                    case 4:
                        String sceltaOsp = "";
                        System.out.println("Scegli un ospedale ed inserisci il nome per entrare nel menu':..");
                        sceltaOsp = tastiera.nextLine();
                        for (Ospedale i : elencoOspedali) {
                            if (i.nome.equals(sceltaOsp)) {
                                i.menu();
                            } else {
                                System.out.println("Il nome inserito non corrisponde a nessun ospedale riprova.. ");
                            }
                        }
                        break;

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