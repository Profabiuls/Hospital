import java.util.LinkedList;
import java.util.Scanner;

public class Ospedale {
    String nome;
    String indirizzo;
    String provincia;
    int numeroDipendenti;
    Scanner tastiera = new Scanner(System.in);
    LinkedList<Medico> elencoMedici = new LinkedList<>();

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

        int scelta;

        while (true) {
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
                        String testo;
                        System.out.println("Inserisci il cognome del medico ");
                        testo = tastiera.nextLine();
                        Medico medico = new Medico(testo);
                        System.out.println("Inserisci il nome del medico ");
                        testo = tastiera.nextLine();
                        medico.setNome(testo);
                        elencoMedici.add(medico);
                 //da fare inserimento dati medico ma dalla classe medico
                        break;
                    case 2:

                        break;
                    case 3:

                        break;

                    case 4:

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