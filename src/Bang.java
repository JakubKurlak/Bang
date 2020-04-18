import java.util.Arrays;

public class Bang{
    public static void main(String[] args) {
        System.out.println("Hello, you are playing Bang." +
                "\nRoll the dice and kill your enemies.");

        // This is reality Bang, but now is beta version.
//        System.out.println("\nWhat is your character?" +
//                "\nLucky Duke - press 1" +
//                "\nBlack Jack - press 2" +
//                "\nAnother character - press 3");

        //add some tekst

        ShootingClass shootingClass = new ShootingClass();
        NumberToAction numberToAction = new NumberToAction();
        RollingClass rollingClass = new RollingClass();

        System.out.println("\nYou throw:");
        int[] firstThrow = shootingClass.spinning();
        String firstDice = Arrays.toString(numberToAction.actions(firstThrow));
        System.out.println(firstDice);

        System.out.println("If you wonna roll dices write numbers of dice and SPIN");
        int[] secondThrow = (rollingClass.rolling(firstThrow));
        String secondDice = Arrays.toString(numberToAction.actions(secondThrow));
        System.out.println(secondDice);

        System.out.println("If you wonna roll dices write numbers of dice and SPIN");
        int[] thirdThrow = (rollingClass.rolling(secondThrow));
        String thirdDice = Arrays.toString(numberToAction.actions(thirdThrow));
        System.out.println(thirdDice);
    }
}
