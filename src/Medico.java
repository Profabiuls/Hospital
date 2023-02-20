import java.util.LinkedList;

public class Medico extends Persona {
    String specializzazione;
    int pazientiInCura;
    LinkedList<Medico> listaMedici = new LinkedList<>();

    Medico(String cognome) {
        super(cognome);
    }

    public LinkedList<Medico> getLista() {
        return this.listaMedici;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public int getPazientiInCura() {
        return pazientiInCura;
    }

    public void setPazientiInCura(int pazientiInCura) {
        this.pazientiInCura = pazientiInCura;
    }
}
