//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dipendente giovanni = new Dipendente("123", 1900, Dipartimento.AMMINISTRAZIONE);
        Dipendente giulia = new Dipendente("124", 1500, Dipartimento.PRODUZIONE);
        Dipendente genoveffa = new Dipendente("125", 2000, Dipartimento.VENDITE);

        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = giovanni;
        dipendenti[1] = giulia;
        dipendenti[2] = genoveffa;

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i].getMatricola());
        }


    }
}