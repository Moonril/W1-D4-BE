public class Dipendente {
    private String matricola;
    private double sipendio;
    private Dipartimento dipartimento;

    // costruttore

    public Dipendente(String matricola, double sipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.sipendio = sipendio;
        this.dipartimento = dipartimento;
    }


    // set get

    public String getMatricola() {
        return matricola;
    }

    public double getSipendio() {
        return sipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
