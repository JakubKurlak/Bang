public class NumberToAction {
    static String[] actions (int [] dice) {
        String[] throwing = new String[5];
        for (int i = 0; i < 5; i++) {
            if (dice[i] == 1)
                throwing[i] = "( 1 )";
            else if (dice[i] == 2)
                throwing[i] = "( 2 )";
            else if (dice[i] == 3)
                throwing[i] = "Beer";
            else if (dice[i] == 4)
                throwing[i] = "Gatling";
            else if (dice[i] == 5)
                throwing[i] = "Arrow";
            else if (dice[i] == 6)
                throwing[i] = "Dynamite";}
        return throwing;
    }
}