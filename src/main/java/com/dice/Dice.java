package com.dice;

import javafx.concurrent.Task;
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
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() {
                for (int i = 0; i < 20; i++) {
                    int result = rollDice(sides);
                    printToText(text, result);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        getResult(sides, text);
                    }
                }
                return null;
            }
        };

        new Thread(task).start();
    }
}
