package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl korpa[]=new Artikl[50];
    int velicina=0;
    private int suma;

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
        for(int i=0;i<velicina;i++){
            suma+=Integer.parseInt(korpa[i].getCijena());
        }
        return suma;
    }
}
