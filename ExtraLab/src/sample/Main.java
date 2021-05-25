package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        this.primaryStage.setTitle("First app");
        this.primaryStage.setScene(new Scene(root, 300, 275));
        this.primaryStage.show();
    }

    public static void callNewScene(String sceneName) {
        Parent root = null;
        try {
            root = FXMLLoader.load(Main.class.getResource("register.fxml"));
            RegistrationController registrationController = new RegistrationController();
            registrationController.initWindows();
            registrationController.setStage(primaryStage);
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }

}