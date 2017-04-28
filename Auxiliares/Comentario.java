package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by paula_000 on 27/4/2017.
 */
public class Comentario {

    SimpleStringProperty restaurante;
    SimpleStringProperty comentario;

    SimpleStringProperty anno;
    SimpleStringProperty mes;
    SimpleStringProperty colaborador;

    public Comentario(String pRestaurante, String pComentario,String pAnno, String pMes,String pColaborador){
        restaurante = new SimpleStringProperty(pRestaurante);
        comentario = new SimpleStringProperty(pComentario);
        anno = new SimpleStringProperty(pAnno);
        mes = new SimpleStringProperty(pMes);
        colaborador= new SimpleStringProperty(pColaborador);
    }

    public String getRestaurante() {
        return restaurante.get();
    }

    public SimpleStringProperty restauranteProperty() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante.set(restaurante);
    }

    public String getComentario() {
        return comentario.get();
    }

    public SimpleStringProperty comentarioProperty() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario.set(comentario);
    }

    public String getAnno() {
        return anno.get();
    }

    public SimpleStringProperty annoProperty() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno.set(anno);
    }

    public String getMes() {
        return mes.get();
    }

    public SimpleStringProperty mesProperty() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes.set(mes);
    }

    public String getColaborador() {
        return colaborador.get();
    }

    public SimpleStringProperty colaboradorProperty() {
        return colaborador;
    }

    public void setColaborador(String colaborador) {
        this.colaborador.set(colaborador);
    }




}
