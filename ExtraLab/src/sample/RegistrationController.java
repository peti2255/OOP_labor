package sample;

import javafx.application.Preloader;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class RegistrationController {

    private Stage stage;

    @FXML
    private AnchorPane registrationGrade;
    public void initWindows() {
        Button button = new Button("Button1");
        registrationGrade = new AnchorPane();
        registrationGrade.setMinHeight(300);
        registrationGrade.setMinWidth(300);

        Scene scene = new Scene(registrationGrade,300,300);


    }

    public void setStage(Stage primaryStage) {
        this.stage = primaryStage;
    }
}
