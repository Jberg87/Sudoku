package nl.sogyo.jesper;

/**
 * Created by Jesper on 29-8-2014.
 */
public class Quadrant {
    private Vak[] vakken = new Vak[9];

    public Quadrant() {
        for (int i = 0; i <= 8; i++) {
            vakken[i] = new Vak();
        }
    }

    public Vak getVakken(int vakNummer) {
        return vakken[vakNummer];
    }

    public void printVakken(int eersteVak, int derdeVak) {
        for (int vakNummer = eersteVak; vakNummer <= derdeVak; vakNummer++) {
            vakken[vakNummer].printOplossing();
        }
    }
}
