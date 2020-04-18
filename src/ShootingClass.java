import java.util.Random;

public class ShootingClass {

    static int[] spinning() {
        Random random = new Random();
        int[] dice = new int[5];
        int diceAction = 6;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(diceAction) + 1;
            dice[i] = randomNumber;
        }
        return dice;
    }
}
