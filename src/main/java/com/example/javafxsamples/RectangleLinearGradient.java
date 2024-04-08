package com.example.javafxsamples;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import java.io.IOException;

public class RectangleLinearGradient extends Application {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-world.fxml"));
    @Override
    public void start(final Stage primaryStage) throws IOException {
        VBox root = new VBox();
        final Scene scene = new Scene(root, 300, 250);

        Stop[] stops = new Stop[] {
                new Stop(0, Color.GREEN),
                new Stop(1, Color.BLUE)
        };

        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        Rectangle rect = new Rectangle(0, 0, 100, 100);
        rect.setFill(linear);

        root.getChildren().add(rect);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
