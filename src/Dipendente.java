import java.util.Random;

public abstract class Dipendente implements Lavoratore {
    private int matricola;
    private double sipendio;
    private Dipartimento dipartimento;

    // costruttore

    public Dipendente(Dipartimento dipartimento) {
        Random generatore = new Random(); // crea random un numero, non siamo certi che sia univoco.
        matricola = generatore.nextInt(1, 20000);
        this.dipartimento = dipartimento;
    }


    // set get

    public int getMatricola() {
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

    @Override
    public boolean checkIn() {
        return false;
    }
}
