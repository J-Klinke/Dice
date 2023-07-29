package com.dice;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class DiceController {

    @FXML
    public Text textW4 = new Text();
    @FXML
    public Text textW6 = new Text();
    @FXML
    public Text textW8 = new Text();
    @FXML
    public Text textW12 = new Text();
    @FXML
    public Text textW20 = new Text();
    @FXML
    public Text textW100 = new Text();

    @FXML
    void rollW4(MouseEvent event) {
        Dice.getResult(4, textW4);
    }

    @FXML
    void rollW6(MouseEvent event) {
        Dice.getResult(6, textW6);
    }

    @FXML
    void rollW8(MouseEvent event) {
        Dice.getResult(8, textW8);
    }
    @FXML
    void rollW12(MouseEvent event) {
        Dice.getResult(12, textW12);
    }

    @FXML
    void rollW20(MouseEvent event) {
        Dice.getResult(20, textW20);
    }

    @FXML
    void rollW100(MouseEvent event) {
        Dice.getResult(100, textW100);
    }
}
