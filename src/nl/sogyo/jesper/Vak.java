package nl.sogyo.jesper;

import java.util.ArrayList;

/**
 * Created by Jesper on 29-8-2014.
 */
public class Vak {
    ArrayList<Integer> mogelijkeGetallen = new ArrayList<Integer>();
    ArrayList<Integer> onjuisteGetallen = new ArrayList<Integer>();
    private int oplossing;

    public Vak() {
        for (int i = 0; i <= 9; i++) {
            mogelijkeGetallen.add(i);
        }
    }

    public void setMogelijkeGetallen(ArrayList<Integer> mogelijkeGetallen) {
        this.mogelijkeGetallen = mogelijkeGetallen;
    }

    public void setOnjuisteGetallen(ArrayList<Integer> onjuisteGetallen) {
        this.onjuisteGetallen = onjuisteGetallen;
    }

    public void setOplossing(int oplossing) {
        this.oplossing = oplossing;
    }

    public void printOplossing() {
        System.out.print(oplossing);
    }

}
