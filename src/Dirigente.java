public class Dirigente extends Dipendente{

    private boolean dirigente = true;


    public Dirigente(Dipartimento dipartimento, boolean dirigente) {
        super(dipartimento);
        this.dirigente = dirigente;

    }

    @Override
    public double calculateSalary() {
        if (dirigente) {
            return 500000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Dirigente{" +
                "dirigente=" + dirigente +
                '}';
    }


}
