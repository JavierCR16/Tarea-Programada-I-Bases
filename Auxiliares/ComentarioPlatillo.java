package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

public class ComentarioPlatillo {

    public SimpleStringProperty amigo;
    public SimpleStringProperty nombrePlatillo;
    public SimpleStringProperty valoracion;

    public ComentarioPlatillo(String pAmigo,String pNombrePlatillo, String pValoracion){
        amigo=new SimpleStringProperty(pAmigo);
        nombrePlatillo = new SimpleStringProperty(pNombrePlatillo);
        valoracion = new SimpleStringProperty(pValoracion);
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

    public String getNombrePlatillo() {
        return nombrePlatillo.get();
    }

    public SimpleStringProperty nombrePlatilloProperty() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo.set(nombrePlatillo);
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
