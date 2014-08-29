package nl.sogyo.jesper;

/**
 * Created by Jesper on 29-8-2014.
 */
public class SudokuSolver {

    public void createRandomSolution(Sudoku sudoku) {
        for (int i = 0; i <= 25; i++) {
            int randomNumber1 = (int) (Math.random() * 9);
            int randomNumber2 = (int) (Math.random() * 9);
            int randomNumber3 = (int) (Math.random() * 10);
            sudoku.getQuadrant(randomNumber1).getVakken(randomNumber2).setOplossing(randomNumber3);
        }
    }
}
