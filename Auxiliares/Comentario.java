package Auxiliares;

import javafx.beans.property.SimpleStringProperty;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Comentario {

   public SimpleStringProperty restaurante;
   public SimpleStringProperty comentario;
   public SimpleStringProperty fecha;
   public SimpleStringProperty anno;
   public SimpleStringProperty mes;
   public SimpleStringProperty colaborador;
   public SimpleStringProperty texto;
   public Date fechaUsar;


    public Comentario(String pRestaurante, String pComentario, String pAnno, String pMes, String pColaborador){
        restaurante = new SimpleStringProperty(pRestaurante);
        comentario = new SimpleStringProperty(pComentario);
        anno = new SimpleStringProperty(pAnno);
        mes = new SimpleStringProperty(pMes);
        colaborador = new SimpleStringProperty(pColaborador);
    }

    public Comentario(String pFecha,String pTexto){
        try {
            fechaUsar = new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH)
                    .parse(pFecha);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        texto = new SimpleStringProperty(pTexto);
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

    public String getTexto(){
        return texto.get();
    }

    public SimpleStringProperty textoProperty(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto.set(texto);
    }

    public String getFecha() {
        return fecha.get();
    }

    public SimpleStringProperty fechaProperty() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha.set(fecha);
    }

    public SimpleStringProperty settearFecha(Date fecha){
       String cambiarFecha =  new SimpleDateFormat("MMM-yyyy", Locale.ENGLISH).format(fecha);
       String anno = cambiarFecha.substring(cambiarFecha.indexOf("-"),cambiarFecha.length());
       String mes = cambiarFecha.substring(0,cambiarFecha.indexOf("-"));
       String nuevaFecha = "";

       switch (mes){
           case "Jan":
               nuevaFecha = "Enero "+anno;
               break;
           case "Feb":
               nuevaFecha = "Febrero "+anno;
               break;
           case "Mar":
               nuevaFecha = "Marzo "+anno;
               break;
           case "Apr":
               nuevaFecha = "Abril "+anno;
               break;
           case "May":
               nuevaFecha = "Mayo "+anno;
               break;
           case "Jun":
               nuevaFecha = "Junio "+anno;
               break;
           case "Jul":
               nuevaFecha = "Julio "+anno;
               break;
           case "Aug":
               nuevaFecha = "Agosto "+anno;
               break;
           case "Sep":
               nuevaFecha = "Setiembre "+anno;
               break;
           case "Oct":
               nuevaFecha = "Octubre "+anno;
               break;
           case "Nov":
               nuevaFecha = "Noviembre "+anno;
               break;
           case "Dec":
               nuevaFecha = "Diciembre "+anno;
               break;
       }
       return new SimpleStringProperty(nuevaFecha);
    }

}
