public class Volontario implements Lavoratore {
    private String nome;
    private int eta;
    private boolean CV;

    @Override
    public boolean checkIn() {
        return true;
    }

    public Volontario(String nome, int eta, boolean CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public boolean isCV() {
        return CV;
    }
}


