public class DipendentePartTime extends Dipendente {

    private boolean partTime = true;

    public DipendentePartTime(String matricola, Dipartimento dipartimento, boolean partTime) {
        super(matricola, dipartimento);
        this.partTime = partTime;
    }

    @Override
    public double calculateSalary() {
        if (partTime) {
            return 1000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "DipendentePartTime{" +
                "partTime=" + partTime +
                '}';
    }
}
