package ObjectOrientedDesign.ChessGame;

import ObjectOrientedDesign.ChessGame.enums.Type;

public class Player {

    private String name;
    private Type type;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
