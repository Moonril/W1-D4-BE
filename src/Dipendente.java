public abstract class Dipendente {
    private String matricola;
    private double sipendio;
    private Dipartimento dipartimento;

    // costruttore

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
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

    public void setSipendio(double sipendio) {
        this.sipendio = sipendio;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    // metodo astratto
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", sipendio=" + sipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
