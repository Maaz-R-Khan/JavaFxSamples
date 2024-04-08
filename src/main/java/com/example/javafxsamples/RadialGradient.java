package com.example.javafxsamples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class RadialGradient extends Application {

    public void start( Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-world.fxml"));
        primaryStage.setTitle("Radial Gradient Example");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        primaryStage.setScene(scene);
        addCircle(scene);
        primaryStage.show();
    }

    private void addCircle(final Scene scene) {
        Circle circle = new Circle(200, 150, 100);
        RadialGradient gradient = new RadialGradient(0, 0.1, 100, 100, 200, false, CycleMethod.NO_CYCLE,
                new Stop(0, Color.YELLOW), new Stop(1, Color.RED));
        circle.setFill(gradient);
        Group root = (Group) scene.getRoot();
        root.getChildren().add(circle);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

