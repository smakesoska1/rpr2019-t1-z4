package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {
    @Test
   void getNazivTest(){
        Artikl a=new Artikl("kompjuter",3000,"12");
        assertEquals("kompjuter",a.getNaziv());
    }
    @Test
    void getCijenaTest(){
        Artikl a=new Artikl("kompjuter",3000,"12");
        assertEquals(3000,a.getCijena());
    }

    @Test
    void getKodTest(){
        Artikl a=new Artikl("kompjuter",3000,"12");
        assertEquals("12",a.getKod());
    }

    @Test
    void testCijenaNaziv() {
        Artikl a=new Artikl("kompjuter",3000,"12");
        a.setCijena(2000);
        assertEquals(2000,a.getCijena());
    }
    @Test
    void testSetNaziv() {
        Artikl a=new Artikl("kompjuter",3000,"12");
        a.setNaziv("stolica");
        assertEquals("stolica",a.getNaziv());
    }

    @Test
    void testSetKod() {
        Artikl a=new Artikl("kompjuter",3000,"12");
        a.setKod("30");
        assertEquals("30",a.getKod());
    }
}