
import java.util.Scanner;

class Guesser {
    int guessNum;

    public int guessingNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Guesser! Kidly guess The Number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int pguessNum;

    public   int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player kindly guess the Number");
        pguessNum = sc.nextInt();
        return pguessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser() 
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer() 
    
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {

        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All  player' give  answer are true And all are Won The Game ");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player1 and player2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player1 and Palyer3 Won The Game");
            } else {
                System.out.println("Player1 Won the game");
            }

        }

        else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player2 and Player3 Won the game");
            } else {

                System.out.println("player2 Won The Game");
            }
        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Palyer3 Won The Game");
        } else {
            System.out.println("Everyone s Answer Are Mismatch You aare lost the Game ");
        }

    }
}

public class LaunchGame {
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }

}
