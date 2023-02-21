import java.util.Scanner;

public class Paziente extends Persona {
    String tipoMalattia;
    int id;

    Scanner tastiera = new Scanner(System.in);

    public String getTipoMalattia() {
        return tipoMalattia;
    }

    public void setTipoMalattia(String tipoMalattia) {
        this.tipoMalattia = tipoMalattia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartellaClinica() {
        return cartellaClinica;
    }

    public void setCartellaClinica(String cartellaClinica) {
        this.cartellaClinica = cartellaClinica;
    }

    String cartellaClinica;

    String setPaziente;

    public void inserisciPaziente() {
        Paziente paziente = new Paziente();
        System.out.println("Inserisci nome : ");
        setPaziente = tastiera.nextLine();
        this.nome = setPaziente;
        System.out.println("Inserisci cognome : ");
        setPaziente = tastiera.nextLine();
        this.cognome = setPaziente;
        System.out.println("Inserisci codice fiscale : ");
        setPaziente = tastiera.nextLine();
        this.codiceFiscale = setPaziente;
        System.out.println("Inserisci data di nascita : ");
        setPaziente = tastiera.nextLine();
        this.dataDiNascita = setPaziente;
        System.out.println("Inserisci tipo malattia  : ");
        setPaziente = tastiera.nextLine();
        this.tipoMalattia = setPaziente;
        System.out.println("Inserisci testo nella cartella clinica : ..");
        setPaziente = tastiera.nextLine();
        this.cartellaClinica = setPaziente;
    }
}
