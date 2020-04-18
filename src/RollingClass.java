import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RollingClass {
    static int[] rolling(int[] dice) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int diceAction = 6;
        List<Integer> throwing = new ArrayList<>();

        for (int i = 0; i < 1; ) {
            String diceString = scanner.next();
            if (diceString.equals("SPIN"))
                break;
            else {
                try {
                    int diceNumber = Integer.parseInt(diceString);
                    if (1 <= diceNumber && diceNumber <= 5) {
                        throwing.add(diceNumber);
                    } else
                        System.out.println("Write correct number of dice.");
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("Please write number my friend :)");
                }
            }
        }
        for (int j = 1; j <= 6; j++) {
            if (throwing.contains(j)) {
                int randomNumber = random.nextInt(diceAction) + 1;
                dice[j - 1] = randomNumber;
            } else
                ;
        }
        return dice;
    }
}
