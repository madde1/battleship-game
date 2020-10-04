
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	    BattleShip.build().setPlayers(
                    new HumanPlayer(input),
                    new ComputerPlayer()
            ).playGame();
	    input.next();
	    input.close();
    }
}