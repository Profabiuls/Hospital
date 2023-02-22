import java.util.LinkedList;
import java.util.Scanner;

public class Medico extends Persona {
    Scanner tastiera = new Scanner(System.in);
    private String specializzazione;
    static int pazientiInCura = 0;
    static LinkedList<Paziente> listaPazientiInCura = new LinkedList<>();
    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public int getPazientiInCura() {
        return pazientiInCura;
    }

/*    public void setPazientiInCura(int pazientiInCura) {
        this.pazientiInCura = pazientiInCura;
    }*/

    String setMedico;

    public void inserisciMedico() {
        Medico medico = new Medico();
        System.out.println("Inserisci nome : ");
        setMedico = tastiera.nextLine();
        this.nome = setMedico;
        System.out.println("Inserisci cognome : ");
        setMedico = tastiera.nextLine();
        this.cognome = setMedico;
        System.out.println("Inserisci codice fiscale : ");
        setMedico = tastiera.nextLine();
        this.codiceFiscale = setMedico;
        System.out.println("Inserisci data di nascita : ");
        setMedico = tastiera.nextLine();
        this.dataDiNascita = setMedico;
        System.out.println("Inserisci specializzazione  : ");
        setMedico = tastiera.nextLine();
        this.specializzazione = setMedico;
    }


}
