package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by paula_000 on 26/4/2017.
 */
public class Amigo {
    public String getNombreAmigo() {
        return nombreAmigo.get();
    }

    public SimpleStringProperty nombreAmigoProperty() {
        return nombreAmigo;
    }

    public void setNombreAmigo(String nombreAmigo) {
        this.nombreAmigo.set(nombreAmigo);
    }

    SimpleStringProperty nombreAmigo;

    public Amigo(String pNombre){
        nombreAmigo = new SimpleStringProperty(pNombre);
    }

}
