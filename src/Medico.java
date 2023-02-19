public class Medico extends Persona {
    String specializzazione;
    int pazientiInCura;

    Medico(String cognome) {
        super(cognome);
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
