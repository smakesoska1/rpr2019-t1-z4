package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl korpa[]=new Artikl[1000];
    private int velicina=0;


    public boolean dodajArtikl(Artikl a) {
        if(velicina<1000){
            korpa[velicina]=new Artikl(a.getNaziv(),a.getCijena(),a.getKod());
            velicina++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=null;
        for(int i=0;i<velicina;i++){
            if(kod.equals(korpa[i].getKod())){
                a=korpa[i];
                for(int j=i+1;j<velicina;j++){
                    korpa[j-1]=korpa[j];
                }
                //obnavljanje velciine
                korpa[velicina-1]=null;
                --velicina;
                i--;
            }
        }
return a;
    }

    public Artikl[] getArtikli() {
                return korpa;
    }
}
