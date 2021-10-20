package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl korpa[]=new Artikl[50];
    int velicina=0;

    public Artikl[] getArtikli() {
        return korpa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
    }

    public boolean dodajArtikl(Artikl a) {
        if(velicina<50){
            korpa[velicina++]=a;
            return true;
        }
        return false;
    }

    public int dajUkupnuCijenuArtikala() {

    }
}
