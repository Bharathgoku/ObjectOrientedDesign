package ObjectOrientedDesign.ChessGame;

import ObjectOrientedDesign.ChessGame.pieces.Piece;

public class Board {

    private Piece[][] cells;

    public Board() {
        // initialize the pieces
    }

    public void displayBoard(){
        // display all the board;
    }

    public Piece getPiece(int[] cell) {
        return cells[cell[0]][cell[1]];
    }

    public void setPiece(Piece piece, int[] cell) {
        cells[cell[0]][cell[1]] = piece;
    }
}
