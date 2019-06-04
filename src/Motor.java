public class Motor extends Pojazd {

    boolean czyMaGrzaneManetki;
    int iloscLusterek;
    int iloscMiejsc;
    final static String typPojazdu = "Motor";

    public Motor(String marka, String model, String numerRejestracyjny, String kolor, double cena,
                 double spalanieNa100Km, String silnik, double stanZbiornika, double stanLicznika,
                 boolean czyMaGrzaneManetki, int iloscLusterek, int iloscMiejsc) {
        super(marka, model, numerRejestracyjny, kolor, cena, spalanieNa100Km, silnik, stanZbiornika, stanLicznika);
        this.czyMaGrzaneManetki = czyMaGrzaneManetki;
        this.iloscLusterek = iloscLusterek;
        this.iloscMiejsc = iloscMiejsc;
    }

    @Override
    String info() {
        return super.info() + "\nLiczba ilosc lusterek: " + iloscLusterek + "\nGrzane Manetki: " +
                czyMaGrzaneManetki(this.czyMaGrzaneManetki) + "\nIlosc miejsc: " + iloscMiejsc + "\n" + typPojazdu();
    }

    @Override
    String typPojazdu() {
        return "Typ pojazdu: " + typPojazdu;
    }

    String czyMaGrzaneManetki(boolean czyMaGrzaneManetki) {
        if (czyMaGrzaneManetki == true) {
            return "Tak";
        } else {
            return "Nie.";
        }
    }
}
