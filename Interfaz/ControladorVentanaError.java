package Interfaz;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by paula_000 on 17/4/2017.
 */
public class ControladorVentanaError implements Initializable {

    @FXML
    public Label labelError;

    @FXML
    public ImageView imagenError;


    public void initialize(URL fxmlLocations, ResourceBundle resources){

        Image imagen = new Image(getClass().getResource("Imagenes\\iconoError.png").toExternalForm());
        imagenError.setImage(imagen);

    }

}
