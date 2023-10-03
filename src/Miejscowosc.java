public class Miejscowosc {
    String nazwa;
    int liczbaludnosci;
    double powierzchnia;
    String gmina;
    double powierzchniaNieuzytkowa;

    public Miejscowosc(String nazwa, int liczbaludnosci, double powierzchnia, String gmina, double powierzchniaNieuzytkowa) {
        this.nazwa = nazwa;
        this.liczbaludnosci = liczbaludnosci;
        this.powierzchnia = powierzchnia;
        this.gmina = gmina;
        this.powierzchniaNieuzytkowa = powierzchniaNieuzytkowa;
    }

    public double obliczZageszczenieLudnosci(){
        double gestosc = liczbaludnosci / powierzchnia;
        return gestosc;
    }

    public double powierzchniaUzytkowa(){
        double uzytkowa = powierzchnia - powierzchniaNieuzytkowa;
        return uzytkowa;
    }

}
