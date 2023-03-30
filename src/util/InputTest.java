package util;

import java.sql.SQLOutput;

public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        String stringCheck = input.getString();
        System.out.println("You typed: " + stringCheck);


        boolean booleanCheck = input.yesNo();
        System.out.println("boolean: " + booleanCheck);

        int[] minMax = input.getInt();
        int min = minMax[0];
        int max = minMax[1];
        int intCheck = input.getInt(min, max);
        System.out.printf("Integer value between %d and %d: %d%n", min, max, intCheck);
    }
}
