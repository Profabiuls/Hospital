public class Paziente extends Persona{
    String tipoMalattia;
    int id;

    Paziente(String cognome) {
        super(cognome);
    }

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
}
