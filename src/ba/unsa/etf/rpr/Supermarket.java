package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl korpa[]=new Artikl[1000];
    private int velicina=0;


    public void dodajArtikl(Artikl a) {
        if(velicina<1000){
            korpa[velicina++]=a;
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a=null;
        for(int i=0;i<velicina;i++){
            if(kod==""+korpa[i].getKod()){
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
