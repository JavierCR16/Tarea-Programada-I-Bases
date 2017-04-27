package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by paula_000 on 26/4/2017.
 */
public class Amigo {

    SimpleStringProperty nombreAmigo;
    SimpleStringProperty correoAmigo;

    public Amigo(String pNombre , String pCorreo){
        nombreAmigo = new SimpleStringProperty(pNombre);
        correoAmigo = new SimpleStringProperty(pCorreo);
    }

    public String getCorreoAmigo() {
        return correoAmigo.get();
    }

    public SimpleStringProperty correoAmigoProperty() {
        return correoAmigo;
    }

    public void setCorreoAmigo(String correoAmigo) {
        this.correoAmigo.set(correoAmigo);
    }



    public String getNombreAmigo() {
        return nombreAmigo.get();
    }

    public SimpleStringProperty nombreAmigoProperty() {
        return nombreAmigo;
    }

    public void setNombreAmigo(String nombreAmigo) {
        this.nombreAmigo.set(nombreAmigo);
    }





}
