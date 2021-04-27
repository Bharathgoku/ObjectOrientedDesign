package ObjectOrientedDesign.ChessGame;

public class Game {

    private Player[] players;
    private Board board;
    private Player currentPlayer;
    private Player winner;

    public Game(Player[] players) {
        this.players = players;
        this.currentPlayer = players[0];
        this.board = new Board();
    }

    public void move(int[] startPosition, int[] destPosition) throws Exception {
        Piece piece = board.getPiece(startPosition);
        if(piece == null){
            throw new Exception();
        }
        if(piece.getType()  != currentPlayer.getType()){
            throw new Exception();
        }
        if(piece.canMove(startPosition, destPosition)){
            Piece destPiece = board.getPiece(destPosition);
            if(destPiece != null){
                destPiece.setKilled(true);
            }
            board.setPiece(piece, destPosition);
            if(destPiece.isKing()){
                winner = currentPlayer;
            }else{
                updateCurrentPlayer();
            }
        }
    }

    private void updateCurrentPlayer(){
        if(currentPlayer.getType().equals(Type.BLACK))
            currentPlayer = players[0];
        else
            currentPlayer = players[1];
    }

    public Player getWinner() {
        return winner;
    }
}
