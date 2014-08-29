package nl.sogyo.jesper;


/**
 * Created by Jesper on 29-8-2014.
 */
public class Sudoku {

    Quadrant[] quadranten;

    public Sudoku() {
        quadranten = new Quadrant[9];
        for (int i = 0; i <= 8; i++) {
            quadranten[i] = new Quadrant();
        }
    }

    public Quadrant getQuadrant(int quadrantNr) {
        return quadranten[quadrantNr];
    }

    public void print() {
        printQuadranten(0, 2);
        System.out.println("-----------");
        printQuadranten(3, 5);
        System.out.println("-----------");
        printQuadranten(6, 8);
    }

    private void printQuadranten(int eersteQuadrant, int derdeQuadrant) {
        //Print regel 1
        for (int quadrantNummer = eersteQuadrant; quadrantNummer <= derdeQuadrant; quadrantNummer++) {
            quadranten[quadrantNummer].printVakken(0, 2);
            if ((quadrantNummer + 1) % 3 != 0) System.out.print("|");
        }
        System.out.println();

        //Print regel 2
        for (int quadrantNummer = eersteQuadrant; quadrantNummer <= derdeQuadrant; quadrantNummer++) {
            quadranten[quadrantNummer].printVakken(3,5);
            if ((quadrantNummer + 1) % 3 != 0) System.out.print("|");
        }
        System.out.println();

        //Print regel 3
        for (int quadrantNummer = eersteQuadrant; quadrantNummer <= derdeQuadrant; quadrantNummer++) {
            quadranten[quadrantNummer].printVakken(6,8);
            if ((quadrantNummer + 1) % 3 != 0) System.out.print("|");
        }
        System.out.println();
    }

    private void printRegel(int regel) {
        for (int quadrantNr = 0; quadrantNr <= 8; quadrantNr++) {

        }

}
}
