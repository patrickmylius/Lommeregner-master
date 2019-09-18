import junit.framework.TestCase;

public class LommeregnerTest extends TestCase {

    public void testSum() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 5;
        int y = 12;
        int resultat = lommeregner.sum(x , y);

        assertEquals(17 , resultat);
    }

    public void testMinus() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 20;
        int y = 5;
        int resultat = lommeregner.minus(x , y);

        assertEquals(15 , resultat);
    }

    public void testMultiplicere() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 5;
        int y = 12;
        int resultat = lommeregner.multiplicere(x , y);

        assertEquals(60 , resultat);
    }

    public void testDividere() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 100;
        int y = 10;
        int resultat = lommeregner.dividere(x , y);

        assertEquals(10 , resultat);
    }

    public void testSecret() {

        Lommeregner lommeregner = new Lommeregner();
        int x = 5;
        int y = 12;
        int resultat = lommeregner.secret(x , y);

        assertEquals(13 , resultat);
    }
}