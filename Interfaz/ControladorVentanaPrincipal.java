package Interfaz;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControladorVentanaPrincipal implements Initializable {

    @FXML
    javafx.scene.control.TextField cuadroIngresarUsuario;

    @FXML
    Button botonLoguear;

    @FXML
    Label colaboradorLogueado;

    @FXML
    TextField cuadroNombreNuevoColaborador;

    @FXML
    TextField cuadroApellidosNuevoColaborador;

    @FXML
    TextField cuadroCorreoNuevoColaborador;

    @FXML
    TextField cuadroUsuarioNuevoColaborador;

    @FXML
    TextField cuadroResidenciaNuevoColaborador;

    @FXML
    ComboBox cuadroPaisNuevoColaborador;

    @FXML
    ComboBox cuadroSexoNuevoColaborador;

    @FXML
    Button botonAgregarColaborador;

    @FXML
    ComboBox cuadroEnviarSolicitudColaboradores;

    @FXML
    TextField cuadroCorreoLogueado;

    @FXML
    TextField cuadroCorreoAmigo;

    @FXML
    Button botonEnviarSolicitud;

    @FXML
    Button botonRefrescarColaboradores;

    @FXML
    Button botonAceptarSolicitud;

    @FXML
    Button botonRechazarSolicitud;

    @FXML
    Button botonActualizarSolicitudes;

    @FXML
    TableView tablaSolicitudesAmistad;

    @FXML
    TextField cuadroNombreNuevoRestaurante;

    @FXML
    ComboBox cuadroCiudadNuevoRestaurante;

    @FXML
    ComboBox cuadroPaisNuevoRestaurante;

    @FXML
    TextArea cuadroDescripcionNuevoRestaurante;

    @FXML
    TextArea cuadroInstruccionesNuevoRestaurante;

    @FXML
    TextArea cuadroDireccionNuevoRestaurante;

    @FXML
    Button botonAceptarRestaurante;

    @FXML
    ComboBox cuadroEstablecimiento;

    @FXML
    ComboBox cuadroRangoPrecio;

    @FXML
    ComboBox cuadroTipoCocina;

    @FXML
    ComboBox cuadroTiempoComida;

    @FXML
    ComboBox cuadroRestriccionesDieteticas;

    @FXML
    ComboBox cuadroBuenoPara;

    @FXML
    Button botonRefrescarRestaurantesCaracteristicas;

    @FXML
    ComboBox cuadroRestaurantesDisponiblesCaracteristicas;

    @FXML
    ComboBox tipoCocinaMas;

    @FXML
    ComboBox tiempoComidaMas;

    @FXML
    ComboBox restriccionesDieteticasMas;

    @FXML
    ComboBox buenoParaMas;

    @FXML
    Button agregarMasTipoCocina;

    @FXML
    Button agregarMasTiempoComida;

    @FXML
    Button agregarMasRestriccionesDieteticas;

    @FXML
    Button agregarMasBuenoPara;

    @FXML
    ComboBox cuadroActualizarRestaurantes;

    @FXML
    TextField cuadroActualizarNombreRestaurante;

    @FXML
    ComboBox cuadroActualizarCiudadRestaurante;

    @FXML
    ComboBox cuadroActualizarPaisRestaurante;

    @FXML
    TextArea cuadroActualizarDescripcionRestaurante;

    @FXML
    TextArea cuadroActualizarInstruccionesRestaurante;

    @FXML
    TextArea cuadroActualizarDireccionRestaurante;

    @FXML
    ComboBox cuadroActualizarEstablecimiento;

    @FXML
    ComboBox cuadroActualizarRangoPrecio;

    @FXML
    ComboBox cuadroActualizarTipoCocina;

    @FXML
    ComboBox cuadroActualizarTiempoComida;

    @FXML
    ComboBox cuadroActualizarRestriccionesDieteticas;

    @FXML
    ComboBox cuadroActualizarBuenoPara;

    @FXML
    Button botonActualizarRestaurante;

    @FXML
    Button botonRefrescarRestaurantesPlatillos;

    @FXML
    ComboBox cuadroRestaurantesPlatillos;

    @FXML
    TextField cuadroNombreNuevoPlatillo;

    @FXML
    TextArea cuadroDescripcionNuevoPlatillo;

    @FXML
    Button botonAgregarPlatillo;

    @FXML
    ComboBox cuadroRestauranteEliminarPlatillo;

    @FXML
    ComboBox cuadroPlatilloEliminarPlatillo;

    @FXML
    Button botonEliminarPlatillo;

    @FXML
    ComboBox agregarComentarioRestaurante;

    @FXML
    ComboBox agregarComentarioAnno;

    @FXML
    ComboBox agregarComentarioMes;

    @FXML
    ComboBox agregarComentarioClasificacionCliente;

    @FXML
    ComboBox agregarComentarioValoracion;

    @FXML
    TextArea agregarComentarioOpinion;

    @FXML
    Button botonAgregarComentario;

    @FXML
    Button botonRefrescarRestaurantesComentarios;

    @FXML
    TableView tablaRestaurantesComentarios;

    @FXML
    Button botonAceptarRestauranteComentario;

    @FXML
    ComboBox cuadroPlatillosRestaurante;

    @FXML
    TextArea cuadroComentarioPlatillo;

    @FXML
    Button agregarComentarioPlatillo;

    Connection connection;
    Statement statement;

    public void initialize(URL fxmlLocations, ResourceBundle resources){
        establecerConexion();
        setDatosDefecto();
    }

    public void establecerConexion(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=PrograBases1;integratedSecurity=true;";
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();

        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public void agregarRestaurante(){


    }

    public void setDatosDefecto(){
        String sqlCargarPaises = //FIXME  Revisar tabla CARGARPAISES y ver porque no esta insertando, puede ser un error en el with o el formato del csv

                "BULK INSERT PROGRABASES1.dbo.CARGARPAISES" +
                        " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\paises.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = ',',ROWTERMINATOR = '\r\n')";

        String limpiarTablaCocina= "TRUNCATE TABLE CARGARTIPOSCOCINA";

        String sqlCargarTiposCocina =
                "BULK INSERT PROGRABASES1.dbo.CARGARTIPOSCOCINA" +
                        " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\tiposCocina.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = '',ROWTERMINATOR = '\r\n', CODEPAGE='ACP')";

        ArrayList<String> arregloCocina = new ArrayList<>();

        try {
            statement.executeUpdate(limpiarTablaCocina);
            statement.executeUpdate(sqlCargarPaises);
            statement.executeUpdate(sqlCargarTiposCocina);

            ResultSet busquedaTiposCocina = statement.executeQuery("SELECT TIPOCOCINA FROM CARGARTIPOSCOCINA");


            while(busquedaTiposCocina.next()){
                arregloCocina.add(busquedaTiposCocina.getString("TIPOCOCINA").substring(0,1).toUpperCase() + busquedaTiposCocina.getString("TIPOCOCINA").substring(1));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        ObservableList<String> listaCocina = FXCollections.observableArrayList(arregloCocina);

        cuadroSexoNuevoColaborador.getItems().addAll("Hombre","Mujer");
        cuadroEstablecimiento.getItems().addAll( "Restaurante", "Venta de Postres", "Cafetería", "Pastelería", "Bar");
        cuadroRangoPrecio.getItems().addAll( "Comida Popular", "Intermedio", "Comida Fina" );
        cuadroTipoCocina.setItems(listaCocina);
        cuadroRestriccionesDieteticas.getItems().addAll( "Vegetarianas", "Veganas", "Sin Gluten");
        cuadroBuenoPara.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        cuadroTiempoComida.getItems().addAll("Desayuno","Brunch","Almuerzo","Cena");
        tiempoComidaMas.getItems().addAll("Desayuno","Brunch","Almuerzo","Cena");
        restriccionesDieteticasMas.getItems().addAll( "Vegetarianas", "Veganas", "Sin Gluten");
        buenoParaMas.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        tipoCocinaMas.setItems(listaCocina);
        cuadroActualizarEstablecimiento.getItems().addAll( "Restaurante", "Venta de Postres", "Cafetería", "Pastelería", "Bar");
        cuadroActualizarRangoPrecio.getItems().addAll( "Comida Popular", "Intermedio", "Comida Fina" );
        cuadroActualizarTiempoComida.getItems().addAll("Desayuno","Brunch","Almuerzo","Cena");
        cuadroActualizarRestriccionesDieteticas.getItems().addAll( "Vegetarianas", "Veganas", "Sin Gluten");
        cuadroActualizarTipoCocina.setItems(listaCocina);
        cuadroActualizarBuenoPara.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        agregarComentarioClasificacionCliente.getItems().addAll("Familia", "Pareja", "Con Amigos", "Negocios", "Solo");
        agregarComentarioValoracion.getItems().addAll("1","2","3","4","5");
        agregarComentarioMes.getItems().addAll("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio"
                ,"Agosto","Setiembre","Octubre","Noviembre","Diciembre");

    }

}
