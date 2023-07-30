package com.dice;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class DiceController{

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
    public GridPane grid = new GridPane();

    @FXML
    void rollW4() {
        Dice.getResult(4, textW4);
    }

    @FXML
    void rollW6() {
        Dice.getResult(6, textW6);
    }

    @FXML
    void rollW8() {
        Dice.getResult(8, textW8);
    }
    @FXML
    void rollW12() {
            Dice.getResult(12, textW12);
    }

    @FXML
    void rollW20() {
        Dice.getResult(20, textW20);
    }

    @FXML
    void rollW100() {
        Dice.getResult(100, textW100);
    }

    @FXML
    void reset() {
        for (Node n: grid.getChildren()) {
            if (n instanceof AnchorPane) {
                Node x = ((AnchorPane) n).getChildren().get(0);
                ((Text) x).setText("");
            }
        }
    }
}
