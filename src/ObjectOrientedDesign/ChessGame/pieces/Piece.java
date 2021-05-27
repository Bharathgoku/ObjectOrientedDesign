package ObjectOrientedDesign.ChessGame.pieces;

import ObjectOrientedDesign.ChessGame.enums.Type;

public abstract class Piece {

    private Type type;

    private boolean killed;

    private boolean isKing;

    public abstract boolean canMove(int[] startPosition, int[] destPosition);

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public Type getType() {
        return type;
    }
}
