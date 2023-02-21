import java.util.LinkedList;
import java.util.Scanner;

public class Ospedale {
    String nome;
    String indirizzo;
    String provincia;
    int numeroDipendenti;
    Scanner tastiera = new Scanner(System.in);
    LinkedList<Medico> elencoMedici = new LinkedList<>();
    LinkedList<Paziente> elencoPazienti = new LinkedList<>();

    Ospedale(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumeroDipendenti() {
        return numeroDipendenti;
    }

    public void setNumeroDipendenti(int numeroDipendenti) {
        this.numeroDipendenti = numeroDipendenti;
    }

    public void menu() {

        int scelta = 100;

        while (scelta != 0) {
            System.out.println(""" 
                    Ciao segui il menu' per entrare nelle diverse sezioni... 
                    1 Per inserire un medico
                    2 Per rimuovere un medico
                    3 Per inserire un  paziente 
                    4 Per rimuovere un paziente 
                    5 Per visualizzare l'elenco dei medici
                    6 Per visualizzare l'elenco dei pazienti
                    0  per  uscire
                    """);
            try {
                scelta = Integer.parseInt(tastiera.nextLine());


                switch (scelta) {
                    case 1:
                        Medico medico = new Medico();
                        medico.inserisciMedico();
                        elencoMedici.add(medico);
                        numeroDipendenti += 1;
                        break;
                    case 2:
                        System.out.println("Inserisci il cognome del medico da eliminare..: ");
                        String testo = tastiera.nextLine();
                        elencoMedici.removeIf(i -> i.cognome.equals(testo));
                        break;
                    case 3:

                        break;

                    case 4:

                        break;
                    case 5:
                        for (Medico i : elencoMedici) {
                            System.out.println(i.nome + " " + i.cognome + " Numero pazienti "+ i.pazientiInCura);
                        }
                        break;
                    case 0:

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