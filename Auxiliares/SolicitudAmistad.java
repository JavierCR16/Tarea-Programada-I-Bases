package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by paula_000 on 18/4/2017.
 */
public class SolicitudAmistad {

    public SimpleStringProperty nombre;
    public SimpleStringProperty correo;


    public SolicitudAmistad(String pNombre, String pCorreo){

        this.nombre = new SimpleStringProperty(pNombre);
        this.correo = new SimpleStringProperty(pCorreo);

    }

    public String getCorreo() {
        return correo.get();
    }

    public SimpleStringProperty correoProperty() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
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






}
