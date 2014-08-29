package nl.sogyo.jesper;

/**
 * Created by Jesper on 29-8-2014.
 */
public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        SudokuSolver sudokuSolver = new SudokuSolver();
        sudokuSolver.createRandomSolution(sudoku);
        sudoku.print();
    }
}
