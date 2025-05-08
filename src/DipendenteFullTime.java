public class DipendenteFullTime extends Dipendente{

    private boolean fullTime = true;

    //costruttore

    public DipendenteFullTime(Dipartimento dipartimento, boolean fullTime) {
        super(dipartimento);
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }


    @Override
    public double calculateSalary() {
        if (fullTime) {
            return 2000;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "DipendenteFullTime{" +
                "fullTime=" + fullTime +
                '}';
    }
}
