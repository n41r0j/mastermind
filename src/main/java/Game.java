import java.util.Random;

public class Game {
    private Code secretCode;
    private int round;

    Game() {
        setSecretCode();
        round = 0;
    }

    public Code getSecretCode() {
        return secretCode;
    }

    public void setSecretCode() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int j = 1 + rnd.nextInt(8);
            sb.append(j);
        }

        Code code = new Code();
        code.set(sb.toString());

        this.secretCode = code;
    }

    public void evaluateGuess() {
        if (round <= 12)
            round++;
        else
            throw new IllegalStateException("game cannot have more than 12 rounds");
    }
}
