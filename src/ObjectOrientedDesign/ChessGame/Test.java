package ObjectOrientedDesign.ChessGame;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        System.out.println("Chess game");
        Player[] players = new Player[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st player name");
        Player player1 = new Player(scanner.nextLine());
        System.out.println("Choose your side, white or black");
        String type = scanner.nextLine();

        if(type.equals("while")){
            player1.setType(Type.WHITE);
            players[0] = player1;
        }else if(type.equals("black")){
            player1.setType(Type.BLACK);
            players[1] = player1;
        }

        System.out.println("Input 2nd player name");
        Player player2 = new Player(scanner.nextLine());
        if(player1.getType().equals(Type.BLACK)){
            player2.setType(Type.WHITE);
            players[0] = player2;
        }else{
            player2.setType(Type.BLACK);
            players[1] = player1;
        }

        players[0] = player1;
        players[1] = player2;

        startGame(players);

    }

    private static void startGame(Player[] players){

        Game game = new Game(players);

        while(true){
            int[] startPosition = new int[2];
            int[] destPosition = new int[2];
            Scanner sc = new Scanner(System.in);
            startPosition[0] = sc.nextInt();
            startPosition[1] = sc.nextInt();
            destPosition[0] = sc.nextInt();
            destPosition[1] = sc.nextInt();
            try{
                game.move(startPosition, destPosition);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            if(game.getWinner() != null)
                break;
        }

        System.out.println(game.getWinner().getName());

    }

}
