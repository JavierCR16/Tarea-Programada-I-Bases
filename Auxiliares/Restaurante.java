package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

public class Restaurante {

    public SimpleStringProperty nombre;
    public SimpleStringProperty amigo;
    public SimpleStringProperty valoracion;

    public Restaurante(String pNombre){
        nombre = new SimpleStringProperty(pNombre);
    }

    public Restaurante(String pNombre, String pAmigo, String pValoracion){
        nombre = new SimpleStringProperty(pNombre);
        amigo = new SimpleStringProperty(pAmigo);
        valoracion = new SimpleStringProperty(pValoracion);
    }

    public String getNombre() {
        return nombre.get();
    }

    public SimpleStringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getAmigo() {
        return amigo.get();
    }

    public SimpleStringProperty amigoProperty() {
        return amigo;
    }

    public void setAmigo(String amigo) {
        this.amigo.set(amigo);
    }

    public String getValoracion() {
        return valoracion.get();
    }

    public SimpleStringProperty valoracionProperty() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion.set(valoracion);
    }


}
