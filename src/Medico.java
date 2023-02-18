public class Medico extends  Persona{
    String specializzazione;
    int pazientiInCura;

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
