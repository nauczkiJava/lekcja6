public class SamochodDostawczy extends Pojazd {

    int liczbaDrzwi;
    boolean czyMaKlimatyzacje;
    int iloscFoteli;
    double pojemnoscPaki;
    final static String typPojazdu = "Samochód Dostawczy";

    public SamochodDostawczy(String marka, String model, String numerRejestracyjny, String kolor, double cena,
                             double spalanieNa100Km, String silnik, double stanZbiornika, double stanLicznika,
                             int liczbaDrzwi, boolean czyMaKlimatyzacje, int iloscFoteli, double pojemnoscPaki) {
        super(marka, model, numerRejestracyjny, kolor, cena, spalanieNa100Km, silnik, stanZbiornika, stanLicznika);
        this.liczbaDrzwi = liczbaDrzwi;
        this.czyMaKlimatyzacje = czyMaKlimatyzacje;
        this.iloscFoteli = iloscFoteli;
        this.pojemnoscPaki = pojemnoscPaki;
    }

    @Override
    String typPojazdu() {
        return "Typ pojazdu: " + typPojazdu;
    }

    String czyMaKlimatyzacje(boolean czyMaKlimatyzacje) {
        if (czyMaKlimatyzacje == true) {
            return "Tak";
        } else {
            return "Nie.";
        }
    }

    @Override
    String info() {
        return super.info() + "\nLiczba drzwi: " + liczbaDrzwi + "\nKlimatyzacja: " + czyMaKlimatyzacje(this.czyMaKlimatyzacje) +
                "\nIlosc foteli: " + iloscFoteli + "Pojemnosc paki: " + pojemnoscPaki + " m3\n" + typPojazdu();
    }


}
