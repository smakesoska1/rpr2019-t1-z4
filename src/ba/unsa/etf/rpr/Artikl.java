package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int kod;
    private String cijena;


    public Artikl(String naziv, int kod, String cijena) {
        this.naziv = naziv;
        this.kod = kod;
        this.cijena = cijena;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getKod() {
        return kod;
    }

    public String getCijena() {
        return cijena;
    }

    public void setCijena(String cijena) {
        this.cijena = cijena;
    }
}
