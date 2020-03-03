package Test;

import map.rovnica.Linearna;

import static org.junit.jupiter.api.Assertions.*;

class Test
{
    private Linearna Prva;
    private Linearna Druha;
    private Linearna Tretia;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        Prva = new Linearna(1,1);
        Druha = new Linearna(-3,6);
        Tretia = new Linearna(0,3);
    }

    @org.junit.jupiter.api.Test()
    void vypocitajKorene()
    {
        assertEquals(Prva.vypocitajKorene()[0], -1);
        assertEquals(Druha.vypocitajKorene()[0], 2);
        assertNull(Tretia.vypocitajKorene());
        // assertArrayEquals(Tretia.vypocitajKorene(new float[0])) porovnanie 2 poli
    }


    //TODO:doma si to preluskaj...

}
