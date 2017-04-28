package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

public class ComentarioPlatillo {

    public SimpleStringProperty nombrePlatillo;
    public SimpleStringProperty valoracion;

    public ComentarioPlatillo(String pNombrePlatillo, String pValoracion){
        nombrePlatillo = new SimpleStringProperty(pNombrePlatillo);
        valoracion = new SimpleStringProperty(pValoracion);
    }



}
