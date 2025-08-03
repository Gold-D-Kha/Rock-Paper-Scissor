import java.util.Random;

// backend
public class RockPaperScissor {
    // all of the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper","Scissors"};

    //store the computer choice so that we van retieve the value and display it to the frontend
    private String computerChoice;

    public int getComputerScore() {
        return computerScore;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    //store the score so that we can retrieve the value and display it to the frontend
    private int computerScore, playerScore;

    //use to generat a random number to randomly choose an opptions for the computer
    private Random random;

    // constructor - to initialize random obj
    public RockPaperScissor(){
        random = new Random();
    }

    // call this method to begin playing ROck paper scissor
    //player choice is the choice made by the player
    // this method will return the result of game
    public String playRockPaperScissor(String playerChoice) {
        // generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        // wil contain the returning message indicating th result of the game
        String result;

        // evalute the winer
        if (computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "player Wins";
                playerScore++;
            } else if (playerChoice.equals("Scissors")) {
                result = "computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        } else if (computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissor")) {
                result = "player Wins";
                playerScore++;
            } else if (playerChoice.equals("Rock")) {
                result = "computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        }else {
            if (playerChoice.equals("Rock")) {
                result = "player Wins";
                playerScore++;
            } else if (playerChoice.equals("Paper")) {
                result = "computer Wins";
                computerScore++;
            } else {
                result = "Draw";
            }
        }
        return result;
    }
}
