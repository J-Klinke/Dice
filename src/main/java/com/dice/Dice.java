package com.dice;

import javafx.scene.text.Text;

import java.util.Random;

public class Dice {
    static Random random = new Random();

    private static int rollDice(int sides) {
        return random.nextInt(1,sides+1);
    }

    private static void printToText(Text text, int result) {
        text.setText(String.valueOf(result));
    }

    public static void getResult(int sides, Text text) {
        int result = rollDice(sides);
        printToText(text, result);
    }
}
