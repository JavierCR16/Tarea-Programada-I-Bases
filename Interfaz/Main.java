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
        //probarArchivo();
        Parent root = FXMLLoader.load(getClass().getResource("VentanaPrincipal.fxml"));
        primaryStage.setTitle("Restaurantes");
        primaryStage.setScene(new Scene(root, 1298, 597));
        primaryStage.show();
    }

    public static void probarArchivo()throws Exception{

        CSVReader reader = new CSVReader(new FileReader("caca.csv"));
        CSVWriter writer = new CSVWriter(new FileWriter("ArchivosCargar/output.csv"), ',',CSVWriter.NO_QUOTE_CHARACTER);
        String[] entries = null;
        int contador = 0;
        while ((entries = reader.readNext()) != null) {
            List<String> list = new ArrayList<String>(Arrays.asList(entries));
            list.add(contador+""); // Add the new element here
            String[] caca = new String[list.size()];
            caca =list.toArray(caca);
            writer.writeNext(caca);
            contador++;
        }
        writer.close();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
