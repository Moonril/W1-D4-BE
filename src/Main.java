//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        es 1
//        Dipendente giovanni = new Dipendente("123", 1900, Dipartimento.AMMINISTRAZIONE);
//        Dipendente giulia = new Dipendente("124", 1500, Dipartimento.PRODUZIONE);
//        Dipendente genoveffa = new Dipendente("125", 2000, Dipartimento.VENDITE);
//
//        Dipendente[] dipendenti = new Dipendente[3];
//
//        dipendenti[0] = giovanni;
//        dipendenti[1] = giulia;
//        dipendenti[2] = genoveffa;

//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println(dipendenti[i].getMatricola());
//        }
//        es 2

        Dipendente giovanni = new DipendenteFullTime(Dipartimento.PRODUZIONE, true);
        Dipendente giulia = new DipendentePartTime(Dipartimento.VENDITE, true);
        Dipendente genoveffa = new DipendenteFullTime(Dipartimento.AMMINISTRAZIONE, true);

        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = giovanni;
        dipendenti[1] = giulia;
        dipendenti[2] = genoveffa;

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i]);
        }

        System.out.println(giovanni.calculateSalary());

        giovanni.setSipendio(giovanni.calculateSalary());
        System.out.println(giovanni);

        System.out.println("Giulia " + giulia.calculateSalary());
        giulia.setSipendio(giulia.calculateSalary());

        // es 3

        Lavoratore[] lavoratori = new Lavoratore[3];

        lavoratori[0] = new Volontario("Giorgio", 97, true);
        lavoratori[1] = new Dirigente(Dipartimento.AMMINISTRAZIONE, true);
        lavoratori[2] = new DipendentePartTime(Dipartimento.PRODUZIONE, true);

        for (int i = 0; i < lavoratori.length; i++) {
            lavoratori[i].checkIn();
        }

    }
}