package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Controller {

   private int counter = 0;
   @FXML
   private TextArea pressedText;
   @FXML
   private Button resetPressed;
    public void buttonpresd(ActionEvent event){
        counter++;
        pressedText.setText("Pressed: " + counter);
        System.out.println();
    }
    public void reset(ActionEvent event){
        counter = 0;
        pressedText.setText("Pressed: " + counter);
    }

    public void callRegisterForm(ActionEvent event){
        Main.callNewScene("register.fxml");
    }

}
