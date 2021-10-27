package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklTest(){
Artikl a=new Artikl("mobitel",2000,"23");
Korpa korpa=new Korpa();
assertTrue(korpa.dodajArtikl(a));
    }
    @Test
    void testDodavanja1() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("biciklo", 100, "ar1");

        boolean moseSeDodati = korpa.dodajArtikl(artikl);
    }
    @Test
    void testIzbacivanja() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Sok", 500, "125"));


        korpa.izbaciArtiklSaKodom("125");
        assertEquals(50, korpa.getArtikli().length);
    }

    @Test
    void testIzbacivanjaSaKodom() {
        Korpa korpa=new Korpa();
        korpa.dodajArtikl(new Artikl("Sok", 500, "125"));
        korpa.dodajArtikl(new Artikl("Cokolada", 10, "63"));
        assertNull(korpa.izbaciArtiklSaKodom("78"));
    }
    @Test
    void dodajArtiklTestBool(){
        Korpa korpa=new Korpa();
        for(int i=0;i<50;i++)
            korpa.dodajArtikl(new Artikl("kompjuter",2000,"56"));

        assertFalse(korpa.dodajArtikl(new Artikl("jabuka",15,"33")));
    }


    @Test
    void dajUkupnuCijenuArtikalaTest() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 2000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "6"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "7"));
        korpa.dodajArtikl(new Artikl("Biciklo", 2000, "8"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "9"));

        assertEquals(8000, korpa.dajUkupnuCijenuArtikala());
    }

}