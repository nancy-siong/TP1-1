package fr.umontpellier.iut.exercice1;

import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstJavaFXWindow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX Application");
        primaryStage.show();
    }
}
