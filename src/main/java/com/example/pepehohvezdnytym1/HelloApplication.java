package com.example.pepehohvezdnytym1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240, Color.BLUE);
        stage.setScene(scene);
        stage.show();

        public void displayImage() {
            FileChooser fc = new FileChooser();
            File file = fc.showOpenDialog(stage);


            myImageView.setImage();
        }
    }


    @FXML
    ImageView myImageView;
    Button myButton;



    public static void main(String[] args) {
        launch();
    }
}