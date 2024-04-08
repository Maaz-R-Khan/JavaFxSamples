package com.example.javafxsamples;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Polygon extends Application {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-world.fxml"));
    @Override
    public void start(Stage primaryStage) throws IOException {
        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(
                new Double[]{
                        300.0, 50.0,
                        450.0, 150.0,
                        300.0, 250.0,
                        150.0, 150.0
                }
        );

        Group root = new Group(polygon);
        Scene scene = new Scene(root, 600, 300);
        stage.setTitle("Drawing a Polygon");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
