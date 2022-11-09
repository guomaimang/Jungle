package group11.comp3211.model;

import group11.comp3211.model.landscape.Landscape;
import group11.comp3211.model.piece.Piece;

public final class PlayBoard {
    private static final int ROW_NUM = 9;
    private static final int COL_NUM = 7;
    private final Loader[][] board;

    public PlayBoard() {
        this.board = new Loader[ROW_NUM][COL_NUM];

    }

    public boolean canMove(Movable movable, int dRow, int dCol) {
        return false;
    }

    public void doMove(Movable movable, int dRow, int dCol) {

    }

    public void put(Piece piece) {

    }

    public void put(Loader loader) {
        Landscape landscape;
        if (loader instanceof Landscape)
            landscape = (Landscape) loader;
        else throw new IllegalArgumentException();
        board[landscape.getRow()][landscape.getCol()] = loader;
    }

    public Loader get(int row, int col) {
        return board[row][col];
    }

    public void register(Game game) {

    }
}
