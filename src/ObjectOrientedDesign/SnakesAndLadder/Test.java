package ObjectOrientedDesign.SnakesAndLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        startGame();
    }

    private static void startGame(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter player 1 name : ");
        Player player1 = new Player(sc.nextLine());
        Random rand = new Random();
        System.out.println("Enter Player 2 name : ");
        Player player2 = new Player(sc.nextLine());
        Game game = new Game();
        game.addPlayer(player1);
        game.addPlayer(player2);

        while(game.getWinner() == null){

            int turn = rand.nextInt(6-1) + 1;
            game.updateBoard(turn);

        }

        System.out.println("Winner is : " + game.getWinner().getName());

    }

}
