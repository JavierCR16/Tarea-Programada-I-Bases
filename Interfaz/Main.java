package Interfaz;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        primaryStage.setTitle("Restaurantes");
        primaryStage.setScene(new Scene(root, 1298, 597));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
