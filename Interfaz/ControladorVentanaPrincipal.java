package Interfaz;

import Auxiliares.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.table.*;
import javax.xml.transform.Result;
import java.net.URL;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

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
    ComboBox cuadroEnviarSolicitudColaboradoresCorreo;

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
    TableColumn columnaNombreSolicitud;

    @FXML
    TableColumn columnaCorreoSolicitud;

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

    @FXML
    Button botonActualizarEstablecimiento;

    @FXML
    Button botonActualizarRangoPrecio;

    @FXML
    Button botonEliminarTiempoComida;

    @FXML
    Button botonEliminarRestriccionesDieteticas;

    @FXML
    Button botonEliminarBuenoPara;

    @FXML
    Button botonEliminarTipoCocina;

    @FXML
    ComboBox cuadroCiudadComentariosRestaurante;

    @FXML
    ComboBox cuadroNombreComentariosRestaurante;

    @FXML
    Button botonComentariosRestaurante;

    @FXML
    TableView tablaComentariosRestaurante;

    @FXML
    TableColumn columnaFechasComentariosRestaurante;

    @FXML
    TableColumn columnaTextoComentariosRestaurante;

    @FXML
    ComboBox cuadroBuscarAmigosColaborador;

    @FXML
    Button botonBuscarAmigosColaborador;

    @FXML
    TableView tablaAmigosColaborador;

    @FXML
    TableColumn columnaNombreAmigoColaborador;

    @FXML
    ComboBox cuadroCiudadRestaurantesVegetarianos;

    @FXML
    Button botonBuscarRestaurantesVegetarianos;

    @FXML
    TableView tablaRestaurantesVegetarianos;

    @FXML
    TableColumn columnaNombreRestaurantesVegetarianos;

    @FXML
    ComboBox cuadroCiudadBaresRecomendados;

    @FXML
    ComboBox cuadroColaboradorBaresRecomendados;

    @FXML
    Button botonBaresRecomendados;

    @FXML
    TableView tablaBaresRecomendados;

    @FXML
    TableColumn columnaAmigoBaresRecomendados;

    @FXML
    TableColumn columnaNombreBaresRecomendados;

    @FXML
    TableColumn columnaValoracionBaresRecomendados;

    @FXML
    ComboBox cuadroRestaurantePlatillosValorados;

    @FXML
    ComboBox cuadroColaboradorPlatillosValorados;

    @FXML
    Button botonPlatillosValorados;

    @FXML
    TableView tablaPlatillosValorados;

    @FXML
    TableColumn columnaAmigoPlatillosValorados;

    @FXML
    TableColumn columnaNombrePlatillosValorados;

    @FXML
    TableColumn columnaValoracionPlatillosValorados;

    @FXML
    Button botonActualizarTabConsultas;

    @FXML
    Button botonActualizarTabMasConsultas;

    @FXML
    TableColumn columnaCorreoAmigoColaborador;

    @FXML
    ComboBox cuadroBuscarAmigosColaboradorCorreo;

    @FXML
    ComboBox cuadroColaboradoresBaresRecomendadosCorreo;

    @FXML
    ComboBox cuadroColaboradorPlatillosValoradosCorreo;

    @FXML
    TableColumn columnaRestauranteComentario;

    @FXML
    TableColumn columnaComentarioComentario;

    @FXML
    TableColumn columnaAnnoComentario;

    @FXML
    TableColumn columnaMesComentario;

    @FXML
    ComboBox cuadroValoracionPlatillo;

    @FXML
    TableColumn columnaCorreoColaboradorComentario;

    Comentario comentarioSeleccionado;

    Connection connection;

    Statement statement;

    String correoColaboradorLogueado = "";

    public void initialize(URL fxmlLocations, ResourceBundle resources) {

        cuadroCorreoLogueado.setDisable(true);
        cuadroCorreoAmigo.setDisable(true);
        establecerConexion();
        setDatosDefecto();
        configurarColumnasTablas();

        botonAgregarColaborador.setOnAction(event -> {

            agregarColaborador();
            limpiarInformacionColaboradores();


        });

        botonLoguear.setOnAction(event -> {
            loguearUsuario();
            cuadroIngresarUsuario.clear();
            limpiarTabComentarios();
        });

        botonRefrescarColaboradores.setOnAction(event -> {
            setListaColaboradoresDisponibles();
        });

        cuadroEnviarSolicitudColaboradores.setOnAction(event -> {
            cuadroEnviarSolicitudColaboradoresCorreo.getItems().removeAll(cuadroEnviarSolicitudColaboradoresCorreo.getItems());
            if (cuadroEnviarSolicitudColaboradores.getSelectionModel().getSelectedItem() != null) {
                String nombre = cuadroEnviarSolicitudColaboradores.getSelectionModel().getSelectedItem().toString();
                List<String> separarNombre = Arrays.asList(nombre.split(" "));
                String nombreBuscar = "";
                String apellidoPaterno = separarNombre.get(separarNombre.size() - 2);
                String apellidoMaterno = separarNombre.get(separarNombre.size() - 1);
                for (int i = 0; i < separarNombre.size() - 2; i++) {
                    nombreBuscar += separarNombre.get(i) + " ";

                }
                ResultSet busquedaCorreo = null;
                String buscarCorreoDelSeleccionado = "SELECT CORREO FROM COLABORADORES WHERE NOMBRE= ? AND APELLIDOPATERNO=? AND APELLIDOMATERNO=?";
                try {
                    PreparedStatement preparedStament = connection.prepareStatement(buscarCorreoDelSeleccionado);
                    preparedStament.setString(1, nombreBuscar);
                    preparedStament.setString(2, apellidoPaterno);
                    preparedStament.setString(3, apellidoMaterno);
                    busquedaCorreo = preparedStament.executeQuery();

                    while (busquedaCorreo.next()) {
                        if (!correoColaboradorLogueado.equals(busquedaCorreo.getString("CORREO")))
                            cuadroEnviarSolicitudColaboradoresCorreo.getItems().add(busquedaCorreo.getString("CORREO"));
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        });

        cuadroEnviarSolicitudColaboradoresCorreo.setOnAction(event -> {
            if (cuadroEnviarSolicitudColaboradoresCorreo.getSelectionModel().getSelectedItem() != null) {
                cuadroCorreoAmigo.setText(cuadroEnviarSolicitudColaboradoresCorreo.getSelectionModel().getSelectedItem().toString());
            }
        });

        botonEnviarSolicitud.setOnAction(event -> {
            enviarSolicitud();
            cuadroCorreoAmigo.clear();
            cuadroEnviarSolicitudColaboradores.getSelectionModel().clearSelection();
            cuadroEnviarSolicitudColaboradores.getSelectionModel().clearSelection();
        });

        botonActualizarSolicitudes.setOnAction(event -> {
            refrescarSolicitudesAmistad();
        });

        botonAceptarSolicitud.setOnAction(event -> {
            aceptarRechazarSolicitud(true);
            refrescarSolicitudesAmistad();
        });

        botonRechazarSolicitud.setOnAction(event -> {
            aceptarRechazarSolicitud(false);
            refrescarSolicitudesAmistad();
        });

        botonAceptarRestaurante.setOnAction(event -> {
            agregarRestaurante();
            limpiarInformacionRestaurante();

        });

        botonRefrescarRestaurantesCaracteristicas.setOnAction(event -> {
            setListaRestaurantesAgregarMas();
        });

        agregarMasTipoCocina.setOnAction(event -> {
            agregarMasTipoCocina();
            tipoCocinaMas.getSelectionModel().clearSelection();
        });

        agregarMasBuenoPara.setOnAction(event -> {
            agregarMasBuenoPara();
            buenoParaMas.getSelectionModel().clearSelection();
        });

        agregarMasRestriccionesDieteticas.setOnAction(event -> {
            agregarMasRestriccionesDieteticas();
            restriccionesDieteticasMas.getSelectionModel().clearSelection();
        });

        agregarMasTiempoComida.setOnAction(event -> {
            agregarMasTiemposComida();
            tiempoComidaMas.getSelectionModel().clearSelection();
        });

        botonActualizarRestaurante.setOnAction(event -> {
            actualizarRestaurante();
            limpiarActualizarRestaurante();
            setListaRestaurantesAgregarMas();
            actualizarTabPlatillos();
        });

        botonActualizarEstablecimiento.setOnAction(event -> {
            actualizarEstablecimiento();
            cuadroActualizarEstablecimiento.getSelectionModel().clearSelection();
        });

        botonActualizarRangoPrecio.setOnAction(event -> {
            actualizarRangoPrecio();
            cuadroActualizarRangoPrecio.getSelectionModel().clearSelection();
        });

        botonEliminarTipoCocina.setOnAction(event -> {
            eliminarTipoCocina();
            cuadroActualizarTipoCocina.getSelectionModel().clearSelection();
        });

        botonEliminarBuenoPara.setOnAction(event -> {
            eliminarBuenoPara();
            cuadroActualizarBuenoPara.getSelectionModel().clearSelection();
        });

        botonEliminarRestriccionesDieteticas.setOnAction(event -> {
            eliminarRestriccionDietetica();
            cuadroActualizarRestriccionesDieteticas.getSelectionModel().clearSelection();
        });

        botonEliminarTiempoComida.setOnAction(event -> {
            eliminarTiempoComida();
            cuadroActualizarTiempoComida.getSelectionModel().clearSelection();
        });

        botonRefrescarRestaurantesPlatillos.setOnAction(event -> {
            actualizarTabPlatillos();
        });

        botonAgregarPlatillo.setOnAction(event -> {
            agregarPlatillo();
            limpiarInformacionAgregarPlatillo();
        });

        botonEliminarPlatillo.setOnAction(event -> {
            eliminarPlatillo();
            cuadroRestauranteEliminarPlatillo.getSelectionModel().clearSelection();
            cuadroPlatilloEliminarPlatillo.getSelectionModel().clearSelection();
        });

        cuadroRestauranteEliminarPlatillo.setOnAction(event -> {
            cuadroPlatilloEliminarPlatillo.getItems().removeAll(cuadroPlatilloEliminarPlatillo.getItems());
            if(cuadroRestauranteEliminarPlatillo.getSelectionModel().getSelectedItem() !=null) {
                String restauranteEscogido = cuadroRestauranteEliminarPlatillo.getSelectionModel().getSelectedItem().toString();
                ObservableList<String> listaPlatillos = platillosRestaurantes(restauranteEscogido);
                cuadroPlatilloEliminarPlatillo.setItems(listaPlatillos);
            }

        });

        botonBuscarAmigosColaborador.setOnAction(event -> {
            consultarAmigosColaborador();
            cuadroBuscarAmigosColaborador.getSelectionModel().clearSelection();
            cuadroBuscarAmigosColaboradorCorreo.getSelectionModel().clearSelection();
        });

        botonActualizarTabConsultas.setOnAction(event -> {
            actualizarTabConsultas();
        });

        botonActualizarTabMasConsultas.setOnAction(event -> {
            actualizarTabMasConsultas();
        });

        botonBuscarRestaurantesVegetarianos.setOnAction(event ->{
            consultarRestaurantesVegetarianos();
            cuadroCiudadRestaurantesVegetarianos.getSelectionModel().clearSelection();
        });

        botonBaresRecomendados.setOnAction(event ->{
            consultarBaresRecomendados();
            cuadroCiudadBaresRecomendados.getSelectionModel().clearSelection();
            cuadroColaboradorBaresRecomendados.getSelectionModel().clearSelection();
            cuadroColaboradoresBaresRecomendadosCorreo.getSelectionModel().clearSelection();
        });

        botonPlatillosValorados.setOnAction(event ->{
            consultarComentariosPlatillos();
            cuadroRestaurantePlatillosValorados.getSelectionModel().clearSelection();
            cuadroColaboradorPlatillosValorados.getSelectionModel().clearSelection();
            cuadroColaboradorPlatillosValoradosCorreo.getSelectionModel().clearSelection();
        });

        cuadroBuscarAmigosColaborador.setOnAction(event->{

            cuadroBuscarAmigosColaboradorCorreo.getItems().removeAll(cuadroBuscarAmigosColaboradorCorreo.getItems());
            if (cuadroBuscarAmigosColaborador.getSelectionModel().getSelectedItem() != null) {
                String nombre = cuadroBuscarAmigosColaborador.getSelectionModel().getSelectedItem().toString();
                List<String> separarNombre = Arrays.asList(nombre.split(" "));
                String nombreBuscar = "";
                String apellidoPaterno = separarNombre.get(separarNombre.size() - 2);
                String apellidoMaterno = separarNombre.get(separarNombre.size() - 1);
                for (int i = 0; i < separarNombre.size() - 2; i++) {
                    nombreBuscar += separarNombre.get(i) + " ";

                }
                ResultSet busquedaCorreo = null;
                String buscarCorreoDelSeleccionado = "SELECT CORREO FROM COLABORADORES WHERE NOMBRE= ? AND APELLIDOPATERNO=? AND APELLIDOMATERNO=?";
                try {
                    PreparedStatement preparedStament = connection.prepareStatement(buscarCorreoDelSeleccionado);
                    preparedStament.setString(1, nombreBuscar);
                    preparedStament.setString(2, apellidoPaterno);
                    preparedStament.setString(3, apellidoMaterno);
                    busquedaCorreo = preparedStament.executeQuery();

                    while (busquedaCorreo.next()) {
                        cuadroBuscarAmigosColaboradorCorreo.getItems().add(busquedaCorreo.getString("CORREO"));
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        });

        cuadroColaboradorBaresRecomendados.setOnAction(event -> {
            cuadroColaboradoresBaresRecomendadosCorreo.getItems().removeAll(cuadroColaboradoresBaresRecomendadosCorreo.getItems());
            if (cuadroColaboradorBaresRecomendados.getSelectionModel().getSelectedItem() != null) {
                String nombre = cuadroColaboradorBaresRecomendados.getSelectionModel().getSelectedItem().toString();
                List<String> separarNombre = Arrays.asList(nombre.split(" "));
                String nombreBuscar = "";
                String apellidoPaterno = separarNombre.get(separarNombre.size() - 2);
                String apellidoMaterno = separarNombre.get(separarNombre.size() - 1);
                for (int i = 0; i < separarNombre.size() - 2; i++) {
                    nombreBuscar += separarNombre.get(i) + " ";

                }
                ResultSet busquedaCorreo = null;
                String buscarCorreoDelSeleccionado = "SELECT CORREO FROM COLABORADORES WHERE NOMBRE= ? AND APELLIDOPATERNO=? AND APELLIDOMATERNO=?";
                try {
                    PreparedStatement preparedStament = connection.prepareStatement(buscarCorreoDelSeleccionado);
                    preparedStament.setString(1, nombreBuscar);
                    preparedStament.setString(2, apellidoPaterno);
                    preparedStament.setString(3, apellidoMaterno);
                    busquedaCorreo = preparedStament.executeQuery();

                    while (busquedaCorreo.next()) {
                        cuadroColaboradoresBaresRecomendadosCorreo.getItems().add(busquedaCorreo.getString("CORREO"));
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        });

        cuadroColaboradorPlatillosValorados.setOnAction(event ->{
            cuadroColaboradorPlatillosValoradosCorreo.getItems().removeAll(cuadroColaboradorPlatillosValoradosCorreo.getItems());
            if (cuadroColaboradorPlatillosValorados.getSelectionModel().getSelectedItem() != null) {
                String nombre = cuadroColaboradorPlatillosValorados.getSelectionModel().getSelectedItem().toString();
                List<String> separarNombre = Arrays.asList(nombre.split(" "));
                String nombreBuscar = "";
                String apellidoPaterno = separarNombre.get(separarNombre.size() - 2);
                String apellidoMaterno = separarNombre.get(separarNombre.size() - 1);
                for (int i = 0; i < separarNombre.size() - 2; i++) {
                    nombreBuscar += separarNombre.get(i) + " ";

                }
                ResultSet busquedaCorreo = null;
                String buscarCorreoDelSeleccionado = "SELECT CORREO FROM COLABORADORES WHERE NOMBRE= ? AND APELLIDOPATERNO=? AND APELLIDOMATERNO=?";
                try {
                    PreparedStatement preparedStament = connection.prepareStatement(buscarCorreoDelSeleccionado);
                    preparedStament.setString(1, nombreBuscar);
                    preparedStament.setString(2, apellidoPaterno);
                    preparedStament.setString(3, apellidoMaterno);
                    busquedaCorreo = preparedStament.executeQuery();

                    while (busquedaCorreo.next()) {
                        cuadroColaboradorPlatillosValoradosCorreo.getItems().add(busquedaCorreo.getString("CORREO"));
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

        botonRefrescarRestaurantesComentarios.setOnAction(event -> {
            actualizarTabComentarios();
        });

        botonAgregarComentario.setOnAction(event -> {
            agregarComentario();
            limpiarInformacionComentario();
        });

        botonAceptarRestauranteComentario.setOnAction(event ->{
            settearPlatillosRestauranteComentario();
        });

        agregarComentarioPlatillo.setOnAction(event -> {
            agregarComentarioPlatillo();
            cuadroComentarioPlatillo.clear();
            cuadroPlatillosRestaurante.getSelectionModel().clearSelection();
            cuadroValoracionPlatillo.getSelectionModel().clearSelection();

        });

        botonBaresRecomendados.setOnAction(event -> {
            consultarBaresRecomendados();
            cuadroCiudadBaresRecomendados.getSelectionModel().clearSelection();
            cuadroColaboradorBaresRecomendados.getSelectionModel().clearSelection();
            cuadroColaboradoresBaresRecomendadosCorreo.getSelectionModel().clearSelection();
        });

        botonComentariosRestaurante.setOnAction(event -> {
            consultarComentariosRestaurante();
            cuadroCiudadComentariosRestaurante.getSelectionModel().clearSelection();
            cuadroNombreComentariosRestaurante.getSelectionModel().clearSelection();

        });
    }

    public void establecerConexion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=PrograBases1;integratedSecurity=true;";
            connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void agregarColaborador() {

        String nombreColaborador = cuadroNombreNuevoColaborador.getText();
        String apellidosColaborador = cuadroApellidosNuevoColaborador.getText();
        String correoColaborador = cuadroCorreoNuevoColaborador.getText();
        String usuarioColaborador = cuadroUsuarioNuevoColaborador.getText();
        String residenciaColaborador = cuadroResidenciaNuevoColaborador.getText();
        Object sexoColaborador = cuadroSexoNuevoColaborador.getSelectionModel().getSelectedItem();
        Object paisColaborador = cuadroPaisNuevoColaborador.getSelectionModel().getSelectedItem();
        String sexo = "";
        String pais = "";

        if (sexoColaborador != null)
            sexo = sexoColaborador.toString();
        if (paisColaborador != null)
            pais = paisColaborador.toString();

        if (nombreColaborador.equals("") | apellidosColaborador.equals("") | correoColaborador.equals("") | usuarioColaborador.equals(""))
            ventanaError("El nombre, apellidos, correo y usuario son obligatorios.");


        else {
            String apellidoPaterno = "";
            String apellidoMaterno = "";
            boolean huboError = false;

            try {

                apellidoPaterno = apellidosColaborador.substring(0, apellidosColaborador.indexOf(" "));
                apellidoMaterno = apellidosColaborador.substring(apellidosColaborador.indexOf(" ") + 1, apellidosColaborador.length());

            } catch (Exception e) {
                huboError = true;
                ventanaError("Debe de Ingresar Ambos Apellidos");
            }
            if (!huboError) {
                escribirColaboradorBase(nombreColaborador, apellidoPaterno, apellidoMaterno, correoColaborador, usuarioColaborador,
                        residenciaColaborador, sexo, pais);
            }
        }

    }

    public void escribirColaboradorBase(String nombre, String paterno, String materno, String correo, String usuario, String residencia, String sexo, String pais) {
        String insercionColaborador = "INSERT INTO COLABORADORES" +
                "(CORREO,NOMBREUSUARIO,NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,PAIS,PROVINCIA,SEXO)" + " VALUES(?,?,?,?,?,?,?,?)";
        //ORDEN : CORREO, USUARIO, NOMBRE, PATERNO, MATERNO, PAIS, PROVINCIA, SEXO

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insercionColaborador);
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, usuario);
            preparedStatement.setString(3, nombre);
            preparedStatement.setString(4, paterno);
            preparedStatement.setString(5, materno);


            if (residencia.equals("") && sexo.equals("") && pais.equals("")) {

                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setNull(7, Types.VARCHAR);
                preparedStatement.setNull(8, Types.VARCHAR);

            } else if (residencia.equals("") && sexo.equals("")) {
                preparedStatement.setString(6, pais);
                preparedStatement.setNull(7, Types.VARCHAR);
                preparedStatement.setNull(8, Types.VARCHAR);
            } else if (sexo.equals("") && pais.equals("")) {

                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setString(7, residencia);
                preparedStatement.setNull(8, Types.VARCHAR);
            } else if (residencia.equals("") && pais.equals("")) {
                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setNull(7, Types.VARCHAR);
                preparedStatement.setString(8, sexo);

            } else if (residencia.equals("")) {
                preparedStatement.setString(6, pais);
                preparedStatement.setNull(7, Types.VARCHAR);
                preparedStatement.setString(8, sexo);
            } else if (pais.equals("")) {
                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setString(7, residencia);
                preparedStatement.setString(8, sexo);
            } else if (sexo.equals("")) {
                preparedStatement.setString(6, pais);
                preparedStatement.setString(7, residencia);
                preparedStatement.setNull(8, Types.VARCHAR);
            } else {
                preparedStatement.setString(6, pais);
                preparedStatement.setString(7, residencia);
                preparedStatement.setString(8, sexo);
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            ventanaError("El Usuario o Correo ingresados ya existen. Intente de nuevo.");
        }

    }

    public void setDatosDefecto() {


        String quitarReferenciaARestaurantes = "ALTER TABLE RESTAURANTES DROP CONSTRAINT FK_RESTAURANTES_CARGARPAISES";
        String agregarReferenciaARestaurantes = "ALTER TABLE RESTAURANTES ADD CONSTRAINT FK_RESTAURANTES_CARGARPAISES FOREIGN KEY(IDPAIS) REFERENCES CARGARPAISES(ISO3)";

        String limpiarTablaPaises = "TRUNCATE TABLE CARGARPAISES";

        String sqlCargarPaises =

                "BULK INSERT PROGRABASES1.dbo.CARGARPAISES" +
                        " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\paises.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = ',',ROWTERMINATOR = '\r\n', CODEPAGE = 'ACP')";

        //***********************************************************************************************************************************************************
        String quitarReferenciaATiposCocinaRestaurante = "ALTER TABLE TIPOSCOCINARESTAURANTE DROP CONSTRAINT FK_TIPOSCOCINARESTAURANTE_CARGARTIPOSCOCINA";
        String agregarReferenciaATiposCocinaRestaurante = "ALTER TABLE TIPOSCOCINARESTAURANTE ADD CONSTRAINT FK_TIPOSCOCINARESTAURANTE_CARGARTIPOSCOCINA FOREIGN KEY(NOMBRECOCINA) REFERENCES CARGARTIPOSCOCINA(TIPOCOCINA)";

        String limpiarTablaCocina = "TRUNCATE TABLE CARGARTIPOSCOCINA";

        String sqlCargarTiposCocina =
                "BULK INSERT PROGRABASES1.dbo.CARGARTIPOSCOCINA" +
                        " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\tiposCocina.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = '',ROWTERMINATOR = '\r\n', CODEPAGE='ACP')";
        //************************************************************************************************************************************************************
        String quitarReferenciaCiudades = "ALTER TABLE RESTAURANTES DROP CONSTRAINT FK_RESTAURANTES_CARGARCIUDADES";
        String quitarLlavePrimaria = "ALTER TABLE CARGARCIUDADES DROP CONSTRAINT PK_CARGARCIUDADES";
        String quitarID = "ALTER TABLE CARGARCIUDADES DROP COLUMN ID";
        String limpiarTablaCiudades = "TRUNCATE TABLE CARGARCIUDADES";
        String agregarIdIdentity = "ALTER TABLE CARGARCIUDADES ADD  ID INT IDENTITY(1,1)";
        String hacerLlavePrimaria = "ALTER TABLE CARGARCIUDADES ADD CONSTRAINT PK_CARGARCIUDADES PRIMARY KEY(ID)";
        String agregarReferenciaCiudades = "ALTER TABLE RESTAURANTES ADD CONSTRAINT FK_RESTAURANTES_CARGARCIUDADES FOREIGN KEY(IDCIUDAD) REFERENCES CARGARCIUDADES(ID)";

        String sqlCargaCiudades =
                "BULK INSERT PROGRABASES1.dbo.CARGARCIUDADES" +
                        " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\output.csv'" +
                        " WITH( FIRSTROW =2, FIELDTERMINATOR = ',',ROWTERMINATOR = '\r\n', CODEPAGE='ACP')";
        //************************************************************************************************************************************************************
        ArrayList<String> arregloCocina = new ArrayList<>();
        ArrayList<String> arregloPaises = new ArrayList<>();
        ArrayList<String> arregloCiudades = new ArrayList<>();
        ArrayList<String> arregloEstablecimiento = new ArrayList<>();
        ArrayList<String> arregloRangoPrecio = new ArrayList<>();
        ArrayList<String> arregloBuenoPara = new ArrayList<>();
        ArrayList<String> arregloRestriccionesDieteticas = new ArrayList<>();
        ArrayList<String> arregloTiemposComida = new ArrayList<>();


        try {
            statement.execute(quitarReferenciaCiudades);
            statement.executeUpdate(limpiarTablaCiudades);
            statement.executeUpdate(sqlCargaCiudades);
            statement.execute(agregarReferenciaCiudades);


            statement.execute(quitarReferenciaATiposCocinaRestaurante);
            statement.executeUpdate(limpiarTablaCocina);
            statement.execute(quitarReferenciaARestaurantes);
            statement.executeUpdate(limpiarTablaPaises);

            statement.executeUpdate(sqlCargarPaises);
            statement.executeUpdate(sqlCargarTiposCocina);
            statement.execute(agregarReferenciaATiposCocinaRestaurante);
            statement.execute(agregarReferenciaARestaurantes);


            ResultSet busquedaTiposCocina = statement.executeQuery("SELECT TIPOCOCINA FROM CARGARTIPOSCOCINA");

            while (busquedaTiposCocina.next()) {
                arregloCocina.add(busquedaTiposCocina.getString("TIPOCOCINA").substring(0, 1).toUpperCase() + busquedaTiposCocina.getString("TIPOCOCINA").substring(1));
            }

            ResultSet busquedaCiudades = statement.executeQuery("SELECT NOMBRE FROM CARGARCIUDADES");

            while (busquedaCiudades.next()) {
                arregloCiudades.add(busquedaCiudades.getString("NOMBRE"));
            }

            ResultSet repetidosCiudades = statement.executeQuery("SELECT NOMBRE,COUNT(*)\n" +
                    "  FROM CARGARCIUDADES\n" +
                    "  GROUP BY NOMBRE\n" +
                    "  HAVING COUNT(*) >1");
            String buscarCiudadesRepetidas = "SELECT NOMBRE,PROVINCIA FROM CARGARCIUDADES WHERE NOMBRE =?";

            while (repetidosCiudades.next()) {
                arregloCiudades.removeAll(Collections.singleton(repetidosCiudades.getString("NOMBRE")));
                PreparedStatement extraerCiudadesRepetidas = connection.prepareStatement(buscarCiudadesRepetidas);
                extraerCiudadesRepetidas.setString(1, repetidosCiudades.getString("NOMBRE"));
                ResultSet ciudadRepetida = extraerCiudadesRepetidas.executeQuery();
                while (ciudadRepetida.next()) {
                    arregloCiudades.add(ciudadRepetida.getString("NOMBRE") + ", " + ciudadRepetida.getString("PROVINCIA"));
                }
            }

            ResultSet busquedaNombresPaises = statement.executeQuery("SELECT NOMBRE FROM CARGARPAISES");

            while (busquedaNombresPaises.next()) {
                arregloPaises.add(busquedaNombresPaises.getString("NOMBRE").substring(0, 1).toUpperCase() + busquedaNombresPaises.getString("NOMBRE").substring(1));
            }

            ResultSet repetidosPaises = statement.executeQuery("SELECT NOMBRE,COUNT(*)\n" +
                    "  FROM CARGARPAISES\n" +
                    "  GROUP BY NOMBRE\n" +
                    "  HAVING COUNT(*) >1");

            String buscarLosRepetidos = "SELECT NOMBRE,ISO3 FROM CARGARPAISES WHERE NOMBRE =?";
            while (repetidosPaises.next()) {
                arregloPaises.removeAll(Collections.singleton(repetidosPaises.getString("NOMBRE")));
                PreparedStatement extraerRepetidos = connection.prepareStatement(buscarLosRepetidos);
                extraerRepetidos.setString(1, repetidosPaises.getString("NOMBRE"));
                ResultSet lineasRepetidas = extraerRepetidos.executeQuery();
                while (lineasRepetidas.next()) {
                    arregloPaises.add(lineasRepetidas.getString("NOMBRE") + "/" + lineasRepetidas.getString("ISO3"));
                }

            }


            ResultSet busquedaEstablecimientos = statement.executeQuery("SELECT TIPOESTABLECIMIENTO FROM ESTABLECIMIENTO");

            while (busquedaEstablecimientos.next()) {
                arregloEstablecimiento.add(busquedaEstablecimientos.getString("TIPOESTABLECIMIENTO"));
            }

            ResultSet busquedaRangos = statement.executeQuery("SELECT TIPORANGO FROM RANGOPRECIO");

            while (busquedaRangos.next()) {
                arregloRangoPrecio.add(busquedaRangos.getString("TIPORANGO"));
            }

            ResultSet busquedaBuenoPara = statement.executeQuery("SELECT TIPOBUENO FROM BUENOPARA");

            while (busquedaBuenoPara.next()) {
                arregloBuenoPara.add(busquedaBuenoPara.getString("TIPOBUENO"));
            }

            ResultSet busquedaRestriccionesDieteticas = statement.executeQuery("SELECT RESTRICCION FROM RESTRICCIONESDIETETICAS");

            while (busquedaRestriccionesDieteticas.next()) {
                arregloRestriccionesDieteticas.add(busquedaRestriccionesDieteticas.getString("RESTRICCION"));
            }

            ResultSet busquedaTiemposComida = statement.executeQuery("SELECT TIPOTIEMPO FROM TIEMPOSCOMIDA");

            while (busquedaTiemposComida.next()) {
                arregloTiemposComida.add(busquedaTiemposComida.getString("TIPOTIEMPO"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        ObservableList<String> listaCocina = FXCollections.observableArrayList(arregloCocina);
        ObservableList<String> listaPaises = FXCollections.observableArrayList(arregloPaises);
        ObservableList<String> listaCiudades = FXCollections.observableArrayList(arregloCiudades);
        ObservableList<String> listaEstablecimiento = FXCollections.observableArrayList(arregloEstablecimiento);
        ObservableList<String> listaRangos = FXCollections.observableArrayList(arregloRangoPrecio);
        ObservableList<String> listaBuenoPara = FXCollections.observableArrayList(arregloBuenoPara);
        ObservableList<String> listaRestricciones = FXCollections.observableArrayList(arregloRestriccionesDieteticas);
        ObservableList<String> listaTiemposComida = FXCollections.observableArrayList(arregloTiemposComida);

        Collections.sort(listaCiudades);
        Collections.sort(listaPaises);
        Collections.sort(listaCocina);
        Collections.sort(listaTiemposComida);
        Collections.sort(listaRestricciones);
        Collections.sort(listaBuenoPara);
        Collections.sort(listaRangos);
        Collections.sort(listaEstablecimiento);


        cuadroSexoNuevoColaborador.getItems().addAll("Hombre", "Mujer");
        //****************************************************************** Caracteristicas seteadas desde la base

        cuadroCiudadComentariosRestaurante.setItems(listaCiudades);
        cuadroCiudadRestaurantesVegetarianos.setItems(listaCiudades);
        cuadroCiudadBaresRecomendados.setItems(listaCiudades);
        cuadroEstablecimiento.setItems(listaEstablecimiento);
        cuadroRangoPrecio.setItems(listaRangos);
        cuadroTipoCocina.setItems(listaCocina);
        cuadroCiudadNuevoRestaurante.setItems(listaCiudades);
        cuadroPaisNuevoRestaurante.setItems(listaPaises);
        cuadroRestriccionesDieteticas.setItems(listaRestricciones);
        cuadroBuenoPara.setItems(listaBuenoPara);
        cuadroTiempoComida.setItems(listaTiemposComida);
        tiempoComidaMas.setItems(listaTiemposComida);
        restriccionesDieteticasMas.setItems(listaRestricciones);
        buenoParaMas.setItems(listaBuenoPara);
        tipoCocinaMas.setItems(listaCocina);
        cuadroPaisNuevoColaborador.setItems(listaPaises);
        cuadroActualizarEstablecimiento.setItems(listaEstablecimiento);
        cuadroActualizarRangoPrecio.setItems(listaRangos);
        cuadroActualizarTiempoComida.setItems(listaTiemposComida);
        cuadroActualizarRestriccionesDieteticas.setItems(listaRestricciones);
        cuadroActualizarTipoCocina.setItems(listaCocina);
        cuadroActualizarPaisRestaurante.setItems(listaPaises);
        cuadroActualizarBuenoPara.setItems(listaBuenoPara);
        cuadroActualizarCiudadRestaurante.setItems(listaCiudades);
        //*****************************************************************
        agregarComentarioClasificacionCliente.getItems().addAll("Familia", "Pareja", "Con Amigos", "Negocios", "Solo");
        agregarComentarioValoracion.getItems().addAll("1", "2", "3", "4", "5");
        agregarComentarioMes.getItems().addAll("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio"
                , "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre");
        agregarComentarioAnno.getItems().addAll("2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007"
        ,"2006","2005","2004","2003","2002","2001","2000");
        cuadroValoracionPlatillo.getItems().addAll("1", "2", "3", "4", "5");

    }

    public void ventanaError(String errorDado) {

        try {
            Stage escenario = new Stage();

            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResource("VentanaError.fxml").openStream());
            ControladorVentanaError controladorVentara = loader.getController();
            controladorVentara.labelError.setText(errorDado);
            escenario.setTitle("Error");
            escenario.setScene(new Scene(root, 456, 184));
            escenario.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loguearUsuario() {

        String usuarioIngresado = cuadroIngresarUsuario.getText();
        String buscarUsuario = "SELECT NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO FROM COLABORADORES WHERE NOMBREUSUARIO=?";
        ResultSet busquedaUsuarioResultado = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(buscarUsuario);
            preparedStatement.setString(1, usuarioIngresado);
            busquedaUsuarioResultado = preparedStatement.executeQuery();
            if (!busquedaUsuarioResultado.next()) {
                colaboradorLogueado.setText("Colaborador no existe");
                correoColaboradorLogueado = "";
            } else {
                colaboradorLogueado.setText(busquedaUsuarioResultado.getString("NOMBRE") + " " +
                        busquedaUsuarioResultado.getString("APELLIDOPATERNO") + " " + busquedaUsuarioResultado.getString("APELLIDOMATERNO"));
                correoColaboradorLogueado = busquedaUsuarioResultado.getString("CORREO");
                cuadroCorreoLogueado.setText(correoColaboradorLogueado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void limpiarInformacionColaboradores() {
        cuadroNombreNuevoColaborador.clear();
        cuadroApellidosNuevoColaborador.clear();
        cuadroCorreoNuevoColaborador.clear();
        cuadroUsuarioNuevoColaborador.clear();
        cuadroResidenciaNuevoColaborador.clear();
        cuadroSexoNuevoColaborador.getSelectionModel().clearSelection();
    }

    public void setListaColaboradoresDisponibles() {
        String buscarColaboradores = "SELECT  NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES WHERE CORREO!=?";
        ResultSet busquedaColaboradores = null;
        ArrayList<String> arregloColaboradores = new ArrayList<>();
        ArrayList<String> amigosColaborador = new ArrayList<>();
        ArrayList<String> deQuienAmigosColaborador = new ArrayList<>();

        try {
            if (!correoColaboradorLogueado.equals("")) {
                PreparedStatement preparedStatement = connection.prepareStatement(buscarColaboradores);
                preparedStatement.setString(1, correoColaboradorLogueado);
                busquedaColaboradores = preparedStatement.executeQuery();
                while (busquedaColaboradores.next()) {
                    arregloColaboradores.add(busquedaColaboradores.getString("NOMBRE") + " " +
                            busquedaColaboradores.getString("APELLIDOPATERNO") + " "
                            + busquedaColaboradores.getString("APELLIDOMATERNO"));
                }
                ObservableList<String> listaColaboradores = FXCollections.observableArrayList(arregloColaboradores);//EL TOTAL


                String buscarAmigos = "SELECT NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES,AMIGOS WHERE" +
                        " CORREO=CORREOAMIGO AND CORREOCOLABORADOR=?";
                PreparedStatement buscarQuienesSonAmigos = connection.prepareStatement(buscarAmigos);
                buscarQuienesSonAmigos.setString(1, correoColaboradorLogueado);
                ResultSet amigosDelColaborador = buscarQuienesSonAmigos.executeQuery();

                while (amigosDelColaborador.next()) {
                    amigosColaborador.add(amigosDelColaborador.getString("NOMBRE") + " " +
                            amigosDelColaborador.getString("APELLIDOPATERNO") + " " +
                            amigosDelColaborador.getString("APELLIDOMATERNO"));
                }

                String buscarquienEsAmigoColaborador = "SELECT NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES,AMIGOS WHERE" +
                        " CORREO=CORREOCOLABORADOR AND CORREOAMIGO=?";
                PreparedStatement buscarQuienAmigoColaborador = connection.prepareStatement(buscarquienEsAmigoColaborador);
                buscarQuienAmigoColaborador.setString(1, correoColaboradorLogueado);
                ResultSet quienAmigoColaborador = buscarQuienAmigoColaborador.executeQuery();

                while (quienAmigoColaborador.next()) {
                    deQuienAmigosColaborador.add(quienAmigoColaborador.getString("NOMBRE") + " " +
                            quienAmigoColaborador.getString("APELLIDOPATERNO") + " " +
                            quienAmigoColaborador.getString("APELLIDOMATERNO"));
                }

                //cuadroEnviarSolicitudColaboradores.setItems(listaColaboradores);

                for (String s : amigosColaborador) {
                    if (listaColaboradores.contains(s))
                        listaColaboradores.remove(s);
                }
                for (String s : deQuienAmigosColaborador) {
                    if (listaColaboradores.contains(s))
                        listaColaboradores.remove(s);
                }
                cuadroEnviarSolicitudColaboradores.setItems(listaColaboradores);

            } else {
                cuadroCorreoLogueado.clear();
                cuadroCorreoAmigo.clear();
                cuadroEnviarSolicitudColaboradores.getItems().removeAll(cuadroEnviarSolicitudColaboradores.getItems());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void enviarSolicitud() {
        String correoEmisor = cuadroCorreoLogueado.getText();
        String correoReceptor = cuadroCorreoAmigo.getText();
        String insercionSolicitud = "INSERT INTO SOLICITUDESAMISTAD" +
                "(CORREOEMISOR,CORREORECEPTOR)" + " VALUES(?,?)";

        if (correoEmisor.equals("") || correoReceptor.equals("")) {
            ventanaError("Se deben proveer los dos correos");
        } else {
            try {
                String buscarSolicitudYaEnviada = "SELECT CORREOEMISOR,CORREORECEPTOR FROM SOLICITUDESAMISTAD WHERE CORREOEMISOR=? AND CORREORECEPTOR=?";
                PreparedStatement statementPreparado = connection.prepareStatement(buscarSolicitudYaEnviada);
                statementPreparado.setString(1, correoReceptor);
                statementPreparado.setString(2, correoEmisor);
                ResultSet existeSolicitud = statementPreparado.executeQuery();

                String buscarPorSerRepetido = "SELECT CORREOCOLABORADOR,CORREOAMIGO FROM AMIGOS WHERE CORREOCOLABORADOR =? AND CORREOAMIGO=?";
                PreparedStatement statementLadoAmigo = connection.prepareStatement(buscarPorSerRepetido);//ESTO POR SI EXISTIERA UN NOMBRE REPETIDO
                statementLadoAmigo.setString(1, correoEmisor);
                statementLadoAmigo.setString(2, correoReceptor);
                ResultSet unLadoAmigo = statementLadoAmigo.executeQuery();

                PreparedStatement statementOtroLadoAmigo = connection.prepareStatement(buscarPorSerRepetido);
                statementOtroLadoAmigo.setString(1, correoReceptor);
                statementOtroLadoAmigo.setString(2, correoEmisor);
                ResultSet otroLadoAmigo = statementOtroLadoAmigo.executeQuery();

                if (!existeSolicitud.next() & !unLadoAmigo.next() & !otroLadoAmigo.next()) {
                    PreparedStatement preparedStatement = connection.prepareStatement(insercionSolicitud);
                    preparedStatement.setString(1, correoEmisor);
                    preparedStatement.setString(2, correoReceptor);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                } else
                    ventanaError("Ya tiene una solicitud de amistad pendiente");
            } catch (SQLException e) {
                ventanaError("Ya se ha enviado la solicitud de amistad");
            }
        }
    }

    public void configurarColumnasTablas() {
        columnaNombreSolicitud.setCellValueFactory(new PropertyValueFactory<SolicitudAmistad, String>("nombre"));
        columnaCorreoSolicitud.setCellValueFactory(new PropertyValueFactory<SolicitudAmistad, String>("correo"));
        columnaNombreAmigoColaborador.setCellValueFactory(new PropertyValueFactory<Amigo,String>("nombreAmigo"));
        columnaCorreoAmigoColaborador.setCellValueFactory(new PropertyValueFactory<Amigo,String>("correoAmigo"));
        columnaRestauranteComentario.setCellValueFactory(new PropertyValueFactory<Comentario,String>("restaurante"));
        columnaComentarioComentario.setCellValueFactory(new PropertyValueFactory<Comentario,String>("comentario"));
        columnaAnnoComentario.setCellValueFactory(new PropertyValueFactory<Comentario,String>("anno"));
        columnaMesComentario.setCellValueFactory(new PropertyValueFactory<Comentario,String>("mes"));
        columnaCorreoColaboradorComentario.setCellValueFactory(new PropertyValueFactory<Comentario,String>("colaborador"));
        columnaNombreRestaurantesVegetarianos.setCellValueFactory(new PropertyValueFactory<Restaurante, String>("nombre"));
        columnaAmigoBaresRecomendados.setCellValueFactory(new PropertyValueFactory<Restaurante,String>("amigo"));
        columnaNombreBaresRecomendados.setCellValueFactory(new PropertyValueFactory<Restaurante,String>("nombre"));
        columnaValoracionBaresRecomendados.setCellValueFactory(new PropertyValueFactory<Restaurante,String>("valoracion"));
        columnaFechasComentariosRestaurante.setCellValueFactory(new PropertyValueFactory<Comentario,String>("fecha"));
        columnaTextoComentariosRestaurante.setCellValueFactory(new PropertyValueFactory<Comentario,String>("texto"));
        columnaAmigoPlatillosValorados.setCellValueFactory(new PropertyValueFactory<ComentarioPlatillo,String>("amigo"));
        columnaNombrePlatillosValorados.setCellValueFactory(new PropertyValueFactory<ComentarioPlatillo,String>("nombrePlatillo"));
        columnaValoracionPlatillosValorados.setCellValueFactory(new PropertyValueFactory<ComentarioPlatillo,String>("valoracion"));
    }

    public void refrescarSolicitudesAmistad() {
        String buscarSolicitudes = "SELECT NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO  FROM COLABORADORES,SOLICITUDESAMISTAD WHERE CORREO=CORREOEMISOR " +
                "AND CORREORECEPTOR=?";
        ResultSet busquedaSolicitidudes = null;
        ArrayList<SolicitudAmistad> arregloSolicitudes = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(buscarSolicitudes);
            preparedStatement.setString(1, correoColaboradorLogueado);
            busquedaSolicitidudes = preparedStatement.executeQuery();

            while (busquedaSolicitidudes.next()) {
                String nombre = busquedaSolicitidudes.getString("NOMBRE") + " " +
                        busquedaSolicitidudes.getString("APELLIDOPATERNO") + " " +
                        busquedaSolicitidudes.getString("APELLIDOMATERNO");
                String correo = busquedaSolicitidudes.getString("CORREO");
                arregloSolicitudes.add(new SolicitudAmistad(nombre, correo));
            }
            ObservableList<SolicitudAmistad> informacionSolicitudes = FXCollections.observableArrayList(arregloSolicitudes);
            tablaSolicitudesAmistad.setItems(informacionSolicitudes);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void aceptarRechazarSolicitud(boolean aceptado) {
        SolicitudAmistad solicitudSeleccionada = (SolicitudAmistad) tablaSolicitudesAmistad.getSelectionModel().getSelectedItem();
        String agregarAmigo = "INSERT INTO AMIGOS" + "(CORREOCOLABORADOR,CORREOAMIGO,ACEPTADO)" + "VALUES(?,?,?)";
        if (aceptado) {
            try {
                PreparedStatement insertarAmigo = connection.prepareStatement(agregarAmigo);
                insertarAmigo.setString(1, correoColaboradorLogueado);
                insertarAmigo.setString(2, solicitudSeleccionada.getCorreo());
                insertarAmigo.setString(3, "SI");

                insertarAmigo.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            try {
                PreparedStatement rechazarAmigo = connection.prepareStatement(agregarAmigo);
                rechazarAmigo.setString(1, correoColaboradorLogueado);
                rechazarAmigo.setString(2, solicitudSeleccionada.getCorreo());
                rechazarAmigo.setString(3, "NO");

                rechazarAmigo.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            String eliminarSolicitudesAmistad = "DELETE FROM SOLICITUDESAMISTAD WHERE CORREOEMISOR = ? AND CORREORECEPTOR =?";
            PreparedStatement preparedStatement = connection.prepareStatement(eliminarSolicitudesAmistad);
            preparedStatement.setString(1, solicitudSeleccionada.getCorreo());
            preparedStatement.setString(2, correoColaboradorLogueado);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void agregarRestaurante() {
        String nombreRestaurante = cuadroNombreNuevoRestaurante.getText();
        Object paisRestaurante = cuadroPaisNuevoRestaurante.getSelectionModel().getSelectedItem();
        Object ciudadRestaurante = cuadroCiudadNuevoRestaurante.getSelectionModel().getSelectedItem();
        String descripcionRestaurante = cuadroDescripcionNuevoRestaurante.getText();
        String instruccionesRestaurante = cuadroInstruccionesNuevoRestaurante.getText();
        String direccionRestaurante = cuadroDireccionNuevoRestaurante.getText();
        Object tipoEstablecimiento = cuadroEstablecimiento.getSelectionModel().getSelectedItem();
        Object rangoPrecio = cuadroRangoPrecio.getSelectionModel().getSelectedItem();
        Object tipoCocina = cuadroTipoCocina.getSelectionModel().getSelectedItem();
        Object tiempoComida = cuadroTiempoComida.getSelectionModel().getSelectedItem();
        Object restriccionesDieteticas = cuadroRestriccionesDieteticas.getSelectionModel().getSelectedItem();
        Object buenoPara = cuadroBuenoPara.getSelectionModel().getSelectedItem();

        if (nombreRestaurante.equals("") || paisRestaurante == null || descripcionRestaurante.equals("") || instruccionesRestaurante.equals("")
                || direccionRestaurante.equals("") || tipoEstablecimiento == null || rangoPrecio == null || tipoCocina == null || tiempoComida == null
                || restriccionesDieteticas == null || buenoPara == null || ciudadRestaurante == null) {
            ventanaError("Se deben ingresar todos los datos del restaurante");
        } else {
            try {
                String iso3Encontrado = "";
                String idRangoEncontrado = "";
                String idEstablecimientoEncontrado = "";
                String idCiudadEncontrado = "";
                String idTiempoComidaEncontrado = "";
                String idBuenoParaEncontrado = "";
                String idRestriccionesDieteticasEncontrado = "";
                String nombreTipoCocinaEncontrado = "";
                int ultimoIdRestaurante = 0;

                //*****************************************************************************************
                if (paisRestaurante.toString().contains("/")) {
                    iso3Encontrado = paisRestaurante.toString().substring(paisRestaurante.toString().indexOf("/") + 1, paisRestaurante.toString().length());

                } else {
                    String buscarCodigoDelPais = "SELECT ISO3 FROM CARGARPAISES  WHERE NOMBRE = ?";
                    PreparedStatement codigoPais = connection.prepareStatement(buscarCodigoDelPais);
                    codigoPais.setString(1, paisRestaurante.toString());
                    ResultSet codigoPaisBuscado = codigoPais.executeQuery();

                    while (codigoPaisBuscado.next()) {
                        iso3Encontrado = codigoPaisBuscado.getString("ISO3");
                    }
                }
                //*****************************************************************************************

                String buscarIDRango = "SELECT ID FROM RANGOPRECIO WHERE TIPORANGO =?";
                PreparedStatement buscarID = connection.prepareStatement(buscarIDRango);

                buscarID.setString(1, rangoPrecio.toString());
                ResultSet busquedaId = buscarID.executeQuery();

                while (busquedaId.next()) {
                    idRangoEncontrado = String.valueOf(busquedaId.getInt("ID"));
                }
                //*****************************************************************************************
                String buscarEstablecimiento = "SELECT ID FROM ESTABLECIMIENTO WHERE TIPOESTABLECIMIENTO =?";
                PreparedStatement idEstablecimiento = connection.prepareStatement(buscarEstablecimiento);

                idEstablecimiento.setString(1, tipoEstablecimiento.toString());
                ResultSet busquedaEstablecimiento = idEstablecimiento.executeQuery();

                while (busquedaEstablecimiento.next()) {
                    idEstablecimientoEncontrado = String.valueOf(busquedaEstablecimiento.getInt("ID"));

                }

                //*****************************************************************************************

                //**************************************************************************************************************

                if (ciudadRestaurante.toString().contains(",")) {
                    String ciudadTotal = ciudadRestaurante.toString();
                    ciudadTotal = ciudadTotal.replace(", ", ",");
                    String nombre = ciudadTotal.substring(0, ciudadTotal.indexOf(","));
                    String provincia = ciudadTotal.substring(ciudadTotal.indexOf(",") + 1, ciudadTotal.length());

                    System.out.println("NOMBRE: " + nombre + " PROVINCIA: " + provincia);


                    String buscarIDCiudadPorNombreProvincia = "SELECT ID FROM CARGARCIUDADES WHERE NOMBRE = ? AND PROVINCIA = ?";
                    PreparedStatement buscarIdCiudad = connection.prepareStatement(buscarIDCiudadPorNombreProvincia);
                    buscarIdCiudad.setString(1, nombre);
                    buscarIdCiudad.setString(2, provincia);
                    ResultSet busquedaIdCiudad = buscarIdCiudad.executeQuery();

                    while (busquedaIdCiudad.next()) {
                        idCiudadEncontrado = String.valueOf(busquedaIdCiudad.getInt("ID"));
                    }

                } else {
                    String buscarIDCiudadPorNombre = "SELECT ID FROM CARGARCIUDADES WHERE NOMBRE = ?";
                    PreparedStatement buscarCiudadId = connection.prepareStatement(buscarIDCiudadPorNombre);
                    buscarCiudadId.setString(1, ciudadRestaurante.toString());
                    ResultSet busquedaIDporNombre = buscarCiudadId.executeQuery();

                    while (busquedaIDporNombre.next()) {
                        idCiudadEncontrado = String.valueOf(busquedaIDporNombre.getInt("ID"));
                    }
                }

                System.out.println("ISO DEL PAIS: " + iso3Encontrado + " ID de la ciudad: " + idCiudadEncontrado + " ID RANGO: " + idRangoEncontrado + " ID ESTABLECIMIENTO: " + idEstablecimientoEncontrado);
                //***************************************************************************************************************************************************************

                String insertarEnRestaurante = "INSERT INTO RESTAURANTES (NOMBRE,DIRECCION,DESCRIPCION,INSTRUCCIONES,IDCIUDAD,IDPAIS,IDRANGOPRECIO,IDESTABLECIMIENTO)" +
                        "VALUES(?,?,?,?,?,?,?,?)";
                PreparedStatement insercionRestaurante = connection.prepareStatement(insertarEnRestaurante, Statement.RETURN_GENERATED_KEYS);
                insercionRestaurante.setString(1, nombreRestaurante);
                insercionRestaurante.setString(2, direccionRestaurante);
                insercionRestaurante.setString(3, descripcionRestaurante);
                insercionRestaurante.setString(4, instruccionesRestaurante);
                insercionRestaurante.setInt(5, Integer.parseInt(idCiudadEncontrado));
                insercionRestaurante.setString(6, iso3Encontrado);
                insercionRestaurante.setInt(7, Integer.parseInt(idRangoEncontrado));
                insercionRestaurante.setInt(8, Integer.parseInt(idEstablecimientoEncontrado));
                insercionRestaurante.executeUpdate();

                ResultSet ultimoId = insercionRestaurante.getGeneratedKeys();

                while (ultimoId.next()) {
                    ultimoIdRestaurante = ultimoId.getInt(1);
                    System.out.println("Ultimo id: " + ultimoIdRestaurante);
                }

                String buscarIdBuenoPara = "SELECT ID FROM BUENOPARA WHERE TIPOBUENO = ?";
                PreparedStatement buscarBuenoPara = connection.prepareStatement(buscarIdBuenoPara);
                buscarBuenoPara.setString(1, buenoPara.toString());
                ResultSet busquedaIdBuenoPara = buscarBuenoPara.executeQuery();

                while (busquedaIdBuenoPara.next()) {
                    idBuenoParaEncontrado = String.valueOf(busquedaIdBuenoPara.getInt("ID"));
                }

                String buscarIdRestricciones = "SELECT ID FROM RESTRICCIONESDIETETICAS WHERE RESTRICCION = ?";
                PreparedStatement buscarRestriccion = connection.prepareStatement(buscarIdRestricciones);
                buscarRestriccion.setString(1, restriccionesDieteticas.toString());

                ResultSet busquedaIdRestricciones = buscarRestriccion.executeQuery();

                while (busquedaIdRestricciones.next()) {
                    idRestriccionesDieteticasEncontrado = String.valueOf(busquedaIdRestricciones.getInt("ID"));
                }

                String buscarIdTiempoComida = "SELECT ID FROM TIEMPOSCOMIDA WHERE TIPOTIEMPO = ?";
                PreparedStatement buscarTiempoComida = connection.prepareStatement(buscarIdTiempoComida);
                buscarTiempoComida.setString(1, tiempoComida.toString());

                ResultSet busquedaTiempoComida = buscarTiempoComida.executeQuery();

                while (busquedaTiempoComida.next()) {
                    idTiempoComidaEncontrado = String.valueOf(busquedaTiempoComida.getInt("ID"));
                }

                String insertarEnTiemposComidaRestaurante = "INSERT INTO TIEMPOSCOMIDARESTAURANTE (IDRESTAURANTE,IDTIEMPOCOMIDA)" +
                        "VALUES(?,?)";
                String insertarEnRestriccionesRestaurante = "INSERT INTO RESTRICCIONESRESTAURANTE (IDRESTAURANTE,IDRESTRICCIONES)" +
                        "VALUES(?,?)";
                String insertarEnTiposCocinaRestaurante = "INSERT INTO TIPOSCOCINARESTAURANTE (IDRESTAURANTE, NOMBRECOCINA)" +
                        "VALUES (?,?)";
                String insertarEnBuenoParaRestaurante = "INSERT INTO BUENOPARARESTAURANTE (IDRESTAURANTE, IDBUENOPARA)" +
                        "VALUES (?,?)";

                PreparedStatement insertarTiemposComidaRestaurante = connection.prepareStatement(insertarEnTiemposComidaRestaurante);
                insertarTiemposComidaRestaurante.setInt(1, ultimoIdRestaurante);
                insertarTiemposComidaRestaurante.setInt(2, Integer.parseInt(idTiempoComidaEncontrado));
                insertarTiemposComidaRestaurante.executeUpdate();

                PreparedStatement insertarRestriccionesRestaurante = connection.prepareStatement(insertarEnRestriccionesRestaurante);
                insertarRestriccionesRestaurante.setInt(1, ultimoIdRestaurante);
                insertarRestriccionesRestaurante.setInt(2, Integer.parseInt(idRestriccionesDieteticasEncontrado));
                insertarRestriccionesRestaurante.executeUpdate();

                PreparedStatement insertarTiposCocinaRestaurante = connection.prepareStatement(insertarEnTiposCocinaRestaurante);
                insertarTiposCocinaRestaurante.setInt(1, ultimoIdRestaurante);
                insertarTiposCocinaRestaurante.setString(2, tipoCocina.toString());
                insertarTiposCocinaRestaurante.executeUpdate();

                PreparedStatement insertarBuenoParaRestaurante = connection.prepareStatement(insertarEnBuenoParaRestaurante);
                insertarBuenoParaRestaurante.setInt(1, ultimoIdRestaurante);
                insertarBuenoParaRestaurante.setInt(2, Integer.parseInt(idBuenoParaEncontrado));
                insertarBuenoParaRestaurante.executeUpdate();
                //***************************************************************************************************************

            } catch (SQLException e) {
                e.printStackTrace();
                ventanaError("El restaurante o la direccion ingresados ya existen. Intente de nuevo");
            }


        }
    }

    public void setListaRestaurantesAgregarMas() {

        ObservableList<String> listaRestaurantes = restaurantesTotales();

        cuadroRestaurantesDisponiblesCaracteristicas.setItems(listaRestaurantes);

    }

    public void limpiarInformacionRestaurante() {

        cuadroNombreNuevoRestaurante.clear();
        cuadroDescripcionNuevoRestaurante.clear();
        cuadroInstruccionesNuevoRestaurante.clear();
        cuadroDireccionNuevoRestaurante.clear();
        cuadroPaisNuevoRestaurante.getSelectionModel().clearSelection();
        cuadroCiudadNuevoRestaurante.getSelectionModel().clearSelection();
        cuadroRangoPrecio.getSelectionModel().clearSelection();
        cuadroEstablecimiento.getSelectionModel().clearSelection();
        cuadroTipoCocina.getSelectionModel().clearSelection();
        cuadroTiempoComida.getSelectionModel().clearSelection();
        cuadroRestriccionesDieteticas.getSelectionModel().clearSelection();
        cuadroBuenoPara.getSelectionModel().clearSelection();


    }

    public void agregarMasTipoCocina() {
        Object restauranteAgregarMas = cuadroRestaurantesDisponiblesCaracteristicas.getSelectionModel().getSelectedItem();
        Object masTipoCocina = tipoCocinaMas.getSelectionModel().getSelectedItem();
        int restauranteIDEncontrado = 0;

        if (restauranteAgregarMas == null)
            ventanaError("Se debe escoger un restaurante");
        else if (masTipoCocina == null)
            ventanaError("Se debe escoger un tipo de cocina");
        else {
            try {
                restauranteIDEncontrado = buscarIdRestaurante(restauranteAgregarMas.toString());

                String insertarEnTiposCocinaRestaurante = "INSERT INTO TIPOSCOCINARESTAURANTE (IDRESTAURANTE,NOMBRECOCINA)" +
                        "VALUES (?,?)";

                PreparedStatement insercionTiposCocina = connection.prepareStatement(insertarEnTiposCocinaRestaurante);
                insercionTiposCocina.setInt(1, restauranteIDEncontrado);
                insercionTiposCocina.setString(2, masTipoCocina.toString());
                insercionTiposCocina.executeUpdate();

            } catch (SQLException e) {
                ventanaError("El restaurante ya posee: " + masTipoCocina.toString() + " como tipo de cocina");
            }
        }


    }

    public void agregarMasRestriccionesDieteticas() {
        Object restauranteAgregarMas = cuadroRestaurantesDisponiblesCaracteristicas.getSelectionModel().getSelectedItem();
        Object masRestricciones = restriccionesDieteticasMas.getSelectionModel().getSelectedItem();
        int idRestriccionEncontrado = 0;
        int idRestauranteEncontrado = 0;

        if (restauranteAgregarMas == null)
            ventanaError("Se debe escoger un restaurante");
        else if (masRestricciones == null)
            ventanaError("Se debe escoger un tipo de restriccion dietetica");
        else {

            try {
                idRestauranteEncontrado = buscarIdRestaurante(restauranteAgregarMas.toString());
                idRestriccionEncontrado = buscarIdRestricciones(masRestricciones.toString());

                String insertarEnRestriccionesRestaurante = "INSERT INTO RESTRICCIONESRESTAURANTE (IDRESTAURANTE,IDRESTRICCIONES)" +
                        "VALUES (?,?)";

                PreparedStatement insercionRestricciones = connection.prepareStatement(insertarEnRestriccionesRestaurante);
                insercionRestricciones.setInt(1, idRestauranteEncontrado);
                insercionRestricciones.setInt(2, idRestriccionEncontrado);
                insercionRestricciones.executeUpdate();


            } catch (SQLException e) {
                ventanaError("El restaurante ya posee: " + masRestricciones.toString() + " como restriccion dietetica");
            }

        }
    }

    public void agregarMasTiemposComida() {
        Object restauranteAgregarMas = cuadroRestaurantesDisponiblesCaracteristicas.getSelectionModel().getSelectedItem();
        Object masTiempoComida = tiempoComidaMas.getSelectionModel().getSelectedItem();
        int idRestauranteEncontrado = 0;
        int idTiempoComidaEncontrado = 0;

        if (restauranteAgregarMas == null)
            ventanaError("Se debe escoger un restaurante");
        else if (masTiempoComida == null)
            ventanaError("Se debe escoger un tiempo de comida");
        else {
            try{
                idRestauranteEncontrado = buscarIdRestaurante(restauranteAgregarMas.toString());
                idTiempoComidaEncontrado = buscarIdTiempoComida(masTiempoComida.toString());

                String insertarEnTiemposComidaRestaurante = "INSERT INTO TIEMPOSCOMIDARESTAURANTE (IDRESTAURANTE,IDTIEMPOCOMIDA)" +
                        "VALUES(?,?)";
                PreparedStatement insercionTiempoComida = connection.prepareStatement(insertarEnTiemposComidaRestaurante);
                insercionTiempoComida.setInt(1,idRestauranteEncontrado);
                insercionTiempoComida.setInt(2,idTiempoComidaEncontrado);
                insercionTiempoComida.executeUpdate();

            }
            catch(SQLException e){
                ventanaError("El restaurante ya posee: " + masTiempoComida.toString() + " como tiempo de comida");
            }
        }
    }

    public void agregarMasBuenoPara() {
        Object restauranteAgregarMas = cuadroRestaurantesDisponiblesCaracteristicas.getSelectionModel().getSelectedItem();
        Object masBuenoPara = buenoParaMas.getSelectionModel().getSelectedItem();
        int idRestauranteEncontrado = 0;
        int idBuenoParaEncontrado = 0;

        if (restauranteAgregarMas == null)
            ventanaError("Se debe escoger un restaurante");
        else if (masBuenoPara == null)
            ventanaError("Se debe escoger un tipo de ocasion");
        else{
            try {
                idRestauranteEncontrado = buscarIdRestaurante(restauranteAgregarMas.toString());
                idBuenoParaEncontrado = buscarIdBuenoPara(masBuenoPara.toString());

                String insertarEnBuenoParaRestaurante = "INSERT INTO BUENOPARARESTAURANTE (IDRESTAURANTE,IDBUENOPARA)" +
                        "VALUES(?,?)";
                PreparedStatement insercionBuenoPara = connection.prepareStatement(insertarEnBuenoParaRestaurante);
                insercionBuenoPara.setInt(1,idRestauranteEncontrado);
                insercionBuenoPara.setInt(2,idBuenoParaEncontrado);
                insercionBuenoPara.executeUpdate();
            }
            catch(SQLException e){
                ventanaError("El restaurante ya posee: " + masBuenoPara.toString() + " como ocasion");
            }
        }
    }

    public int buscarIdRestaurante(String nombre) {
        int idRestauranteEncontrado = 0;
        try {
            String buscarIdRestaurante = "SELECT ID FROM RESTAURANTES  WHERE NOMBRE = ?";
            PreparedStatement buscarRestaurante = connection.prepareStatement(buscarIdRestaurante);
            buscarRestaurante.setString(1, nombre);
            ResultSet busquedaIdRestaurante = buscarRestaurante.executeQuery();

            while (busquedaIdRestaurante.next()) {
                idRestauranteEncontrado = busquedaIdRestaurante.getInt("ID");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idRestauranteEncontrado;
    }

    public int buscarIdRestricciones(String nombre){

        int idRestriccionEncontrado= 0;
        try {
            String buscarIdRestriccion = "SELECT ID FROM RESTRICCIONESDIETETICAS WHERE RESTRICCION = ?";
            PreparedStatement buscarRestriccion = connection.prepareStatement(buscarIdRestriccion);
            buscarRestriccion.setString(1, nombre);
            ResultSet idRestriccion = buscarRestriccion.executeQuery();

            while (idRestriccion.next()) {
                idRestriccionEncontrado = idRestriccion.getInt("ID");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idRestriccionEncontrado;
    }

    public int buscarIdTiempoComida(String nombre){
        int idEncontrado = 0;

        try{
            String buscarId = "SELECT ID FROM TIEMPOSCOMIDA WHERE TIPOTIEMPO = ?";
            PreparedStatement busquedaTiempoComida = connection.prepareStatement(buscarId);
            busquedaTiempoComida.setString(1,nombre);
            ResultSet busquedaId = busquedaTiempoComida.executeQuery();

            while(busquedaId.next()){
                idEncontrado = busquedaId.getInt("ID");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idEncontrado;
    }

    public int buscarIdBuenoPara(String nombre){
        int idBuenoPara = 0;

        try{
            String buscarId = "SELECT ID FROM BUENOPARA WHERE TIPOBUENO = ?";
            PreparedStatement busquedaBuenoPara = connection.prepareStatement(buscarId);
            busquedaBuenoPara.setString(1,nombre);
            ResultSet busquedaId = busquedaBuenoPara.executeQuery();

            while(busquedaId.next()){
                idBuenoPara = busquedaId.getInt("ID");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idBuenoPara;

    }

    public int buscarIdCiudad(String nombre){
        int idEncontrado = 0;
        try{
            if (nombre.contains(",")) {

                nombre = nombre.replace(", ", ",");
                String nombreCiudad = nombre.substring(0, nombre.indexOf(","));
                String provincia = nombre.substring(nombre.indexOf(",") + 1, nombre.length());

                String buscarIDCiudadPorNombreProvincia = "SELECT ID FROM CARGARCIUDADES WHERE NOMBRE = ? AND PROVINCIA = ?";
                PreparedStatement buscarIdCiudad = connection.prepareStatement(buscarIDCiudadPorNombreProvincia);
                buscarIdCiudad.setString(1, nombreCiudad);
                buscarIdCiudad.setString(2, provincia);
                ResultSet busquedaIdCiudad = buscarIdCiudad.executeQuery();

                while (busquedaIdCiudad.next()) {
                    idEncontrado = Integer.parseInt(busquedaIdCiudad.getString("ID"));
                }

            }
            else{
                String buscarIDCiudadPorNombre = "SELECT ID FROM CARGARCIUDADES WHERE NOMBRE = ?";
                PreparedStatement buscarCiudadId = connection.prepareStatement(buscarIDCiudadPorNombre);
                buscarCiudadId.setString(1, nombre);
                ResultSet busquedaIDporNombre = buscarCiudadId.executeQuery();

                while (busquedaIDporNombre.next()) {
                    idEncontrado = Integer.parseInt(busquedaIDporNombre.getString("ID"));
                }
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idEncontrado;

    }

    public String buscarIsoPais(String nombre){
        String iso3Encontrado = "";
        try {
            if (nombre.contains("/")) {
                iso3Encontrado = nombre.substring(nombre.indexOf("/") + 1, nombre.length());

            } else {
                String buscarCodigoDelPais = "SELECT ISO3 FROM CARGARPAISES  WHERE NOMBRE = ?";
                PreparedStatement codigoPais = connection.prepareStatement(buscarCodigoDelPais);
                codigoPais.setString(1, nombre);
                ResultSet codigoPaisBuscado = codigoPais.executeQuery();

                while (codigoPaisBuscado.next()) {
                    iso3Encontrado = codigoPaisBuscado.getString("ISO3");
                }
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return iso3Encontrado;
    }

    public int buscarIdEstablecimiento(String nombre){
        int idEncontrado = 0;
        try{
            String buscarEstablecimiento = "SELECT ID FROM ESTABLECIMIENTO WHERE TIPOESTABLECIMIENTO = ?";
            PreparedStatement buscarId = connection.prepareStatement(buscarEstablecimiento);
            buscarId.setString(1,nombre);
            ResultSet busquedaId = buscarId.executeQuery();
            while(busquedaId.next()){
                idEncontrado = busquedaId.getInt("ID");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return idEncontrado;
    }

    public int buscarIdRangoPrecio(String nombre){
        int idEncontrado = 0;
        try{
            String buscarRangoPrecio = "SELECT ID FROM RANGOPRECIO WHERE TIPORANGO = ?";
            PreparedStatement buscarId = connection.prepareStatement(buscarRangoPrecio);
            buscarId.setString(1,nombre);
            ResultSet busquedaId = buscarId.executeQuery();
            while(busquedaId.next()){
                idEncontrado = busquedaId.getInt("ID");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }

        return idEncontrado;
    }

    public void actualizarRestaurante(){
        try {
            if (cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem() != null) {
                String restaurantePorActualizar = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem().toString();


                if (cuadroActualizarCiudadRestaurante.getSelectionModel().getSelectedItem() != null) {
                    String ciudadNueva = cuadroActualizarCiudadRestaurante.getSelectionModel().getSelectedItem().toString();
                    int idCiudadActualizar = buscarIdCiudad(ciudadNueva);
                    String actualizarCiudad = "UPDATE RESTAURANTES SET IDCIUDAD =? WHERE NOMBRE = ?";
                    PreparedStatement actualizarCiudadRestaurante = connection.prepareStatement(actualizarCiudad);
                    actualizarCiudadRestaurante.setString(1,String.valueOf(idCiudadActualizar));
                    actualizarCiudadRestaurante.setString(2,restaurantePorActualizar);
                    actualizarCiudadRestaurante.executeUpdate();

                }

                if (cuadroActualizarPaisRestaurante.getSelectionModel().getSelectedItem() != null) {
                    String paisNuevo = cuadroActualizarPaisRestaurante.getSelectionModel().getSelectedItem().toString();
                    String isoPaisNuevo =  buscarIsoPais(paisNuevo);
                    String actualizarPais = "UPDATE RESTAURANTES SET IDPAIS =? WHERE NOMBRE =?";
                    PreparedStatement actualizarPaisRestaurante = connection.prepareStatement(actualizarPais);
                    actualizarPaisRestaurante.setString(1,isoPaisNuevo);
                    actualizarPaisRestaurante.setString(2,restaurantePorActualizar);
                    actualizarPaisRestaurante.executeUpdate();
                }

                if (!cuadroActualizarDescripcionRestaurante.getText().equals("")) {
                    String descripcionNueva = cuadroActualizarDescripcionRestaurante.getText();
                    String actualizarDescripcion = "UPDATE RESTAURANTES SET DESCRIPCION =? WHERE NOMBRE =?";
                    PreparedStatement actualizarDescripcionRestaurante = connection.prepareStatement(actualizarDescripcion);
                    actualizarDescripcionRestaurante.setString(1,descripcionNueva);
                    actualizarDescripcionRestaurante.setString(2,restaurantePorActualizar);
                    actualizarDescripcionRestaurante.executeUpdate();
                }

                if (!cuadroActualizarInstruccionesRestaurante.getText().equals("")) {

                    String instruccionNueva = cuadroActualizarInstruccionesRestaurante.getText();
                    String actualizarInstruccion = "UPDATE RESTAURANTES SET INSTRUCCIONES =? WHERE NOMBRE =?";
                    PreparedStatement actualizarInstruccionRestaurante = connection.prepareStatement(actualizarInstruccion);
                    actualizarInstruccionRestaurante.setString(1,instruccionNueva);
                    actualizarInstruccionRestaurante.setString(2,restaurantePorActualizar);
                    actualizarInstruccionRestaurante.executeUpdate();

                }

                if (!cuadroActualizarDireccionRestaurante.getText().equals("")) {
                    String direccionNueva = cuadroActualizarDireccionRestaurante.getText();
                    String actualizarDireccion = "UPDATE RESTAURANTES SET DIRECCION =? WHERE NOMBRE =?";
                    PreparedStatement actualizarDireccionRestaurante = connection.prepareStatement(actualizarDireccion);
                    actualizarDireccionRestaurante.setString(1,direccionNueva);
                    actualizarDireccionRestaurante.setString(2,restaurantePorActualizar);
                    actualizarDireccionRestaurante.executeUpdate();
                }

                if (!cuadroActualizarNombreRestaurante.getText().equals("")) {
                    String nombreAUsar = cuadroActualizarNombreRestaurante.getText();
                    String actualizarNombre = "UPDATE RESTAURANTES SET NOMBRE =? WHERE NOMBRE =?";
                    PreparedStatement actualizarNombreRestaurante = connection.prepareStatement(actualizarNombre);
                    actualizarNombreRestaurante.setString(1,nombreAUsar);
                    actualizarNombreRestaurante.setString(2,restaurantePorActualizar);
                    actualizarNombreRestaurante.executeUpdate();
                }


            } else {
                ventanaError("Se debe seleccionar un restaurante");
            }
        }
        catch(SQLException e){
            ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
        }

    }

    public ObservableList<String> restaurantesTotales(){
        ArrayList<String> restaurantesEncontrados = new ArrayList<>();
        try {
            String buscarRestaurantes = "SELECT NOMBRE FROM RESTAURANTES";

            ResultSet busquedaRestaurantes = statement.executeQuery(buscarRestaurantes);

            while (busquedaRestaurantes.next()) {
                restaurantesEncontrados.add(busquedaRestaurantes.getString("NOMBRE"));
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        ObservableList<String> listaRestaurantes = FXCollections.observableArrayList(restaurantesEncontrados);
        return listaRestaurantes;
    }

    public void limpiarActualizarRestaurante(){
        cuadroActualizarNombreRestaurante.clear();
        cuadroActualizarCiudadRestaurante.getSelectionModel().clearSelection();
        cuadroActualizarPaisRestaurante.getSelectionModel().clearSelection();
        cuadroActualizarDescripcionRestaurante.clear();
        cuadroActualizarInstruccionesRestaurante.clear();
        cuadroActualizarDireccionRestaurante.clear();
        cuadroActualizarEstablecimiento.getSelectionModel().clearSelection();
        cuadroActualizarRangoPrecio.getSelectionModel().clearSelection();
        cuadroActualizarTipoCocina.getSelectionModel().clearSelection();
        cuadroActualizarBuenoPara.getSelectionModel().clearSelection();
        cuadroActualizarRestriccionesDieteticas.getSelectionModel().clearSelection();
        cuadroActualizarTiempoComida.getSelectionModel().clearSelection();
    }

    public void actualizarTabPlatillos(){

        ObservableList<String> listaRestaurantes = restaurantesTotales();

        cuadroActualizarRestaurantes.setItems(listaRestaurantes);
        cuadroRestaurantesPlatillos.setItems(listaRestaurantes);
        cuadroRestauranteEliminarPlatillo.setItems(listaRestaurantes);
        }

    public void actualizarEstablecimiento(){

        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object establecimientoNuevo = cuadroActualizarEstablecimiento.getSelectionModel().getSelectedItem();

        if(nombreRestaurante == null || establecimientoNuevo ==null)
            ventanaError("Se debe escoger un restaurante y un establecimiento");
        else{

            try{
                int idBuscarEstablecimientoNuevo = buscarIdEstablecimiento(establecimientoNuevo.toString());
                String actualizarEstablecimiento = "UPDATE RESTAURANTES SET IDESTABLECIMIENTO = ? WHERE NOMBRE =?";
                PreparedStatement actualizarEstablecimientoRestaurante = connection.prepareStatement(actualizarEstablecimiento);

                actualizarEstablecimientoRestaurante.setInt(1,idBuscarEstablecimientoNuevo);
                actualizarEstablecimientoRestaurante.setString(2,nombreRestaurante.toString());
                actualizarEstablecimientoRestaurante.executeUpdate();
            }
            catch(SQLException e){
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }

    }

    public void actualizarRangoPrecio(){
        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object rangoPrecioNuevo = cuadroActualizarRangoPrecio.getSelectionModel().getSelectedItem();

        if(nombreRestaurante == null || rangoPrecioNuevo ==null)
            ventanaError("Se debe escoger un restaurante y un rango de precio");
        else{
            try{
                int idBuscarRangoPrecioNuevo = buscarIdRangoPrecio(rangoPrecioNuevo.toString());
                String actualizarRangoPrecio = "UPDATE RESTAURANTES SET IDRANGOPRECIO = ? WHERE NOMBRE =?";
                PreparedStatement actualizarRangoPrecioRestaurante = connection.prepareStatement(actualizarRangoPrecio);

                actualizarRangoPrecioRestaurante.setInt(1,idBuscarRangoPrecioNuevo);
                actualizarRangoPrecioRestaurante.setString(2,nombreRestaurante.toString());
                actualizarRangoPrecioRestaurante.executeUpdate();
            }
            catch(SQLException e){
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }
    }

    public void eliminarTipoCocina(){

        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object eliminarTipoCocina = cuadroActualizarTipoCocina.getSelectionModel().getSelectedItem();

        if(nombreRestaurante ==null || eliminarTipoCocina ==null)
            ventanaError("Se debe escoger un restaurante y un tipo de cocina");
        else{
            try{
                int idRestaurante = buscarIdRestaurante(nombreRestaurante.toString());

                String eliminarTipoCocinaRestaurante = "DELETE FROM TIPOSCOCINARESTAURANTE WHERE IDRESTAURANTE = ? AND NOMBRECOCINA =?";
                PreparedStatement procesoEliminarTipoCocina = connection.prepareStatement(eliminarTipoCocinaRestaurante);
                procesoEliminarTipoCocina.setInt(1,idRestaurante);
                procesoEliminarTipoCocina.setString(2,eliminarTipoCocina.toString());
                procesoEliminarTipoCocina.executeUpdate();

            }
            catch(SQLException e){
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }
    }

    public void eliminarRestriccionDietetica() {

        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object eliminarRestriccionDietetica = cuadroActualizarRestriccionesDieteticas.getSelectionModel().getSelectedItem();

        if (nombreRestaurante == null || eliminarRestriccionDietetica == null)
            ventanaError("Se debe escoger un restaurante y una restriccion dietetica");
        else {
            try {
                int idRestaurante = buscarIdRestaurante(nombreRestaurante.toString());
                int idRestriccion = buscarIdRestricciones(eliminarRestriccionDietetica.toString());

                String eliminarRestriccionDieteticaRestaurante = "DELETE FROM RESTRICCIONESRESTAURANTE WHERE IDRESTAURANTE = ? AND IDRESTRICCIONES =?";
                PreparedStatement procesoEliminarRestriccion = connection.prepareStatement(eliminarRestriccionDieteticaRestaurante);
                procesoEliminarRestriccion.setInt(1, idRestaurante);
                procesoEliminarRestriccion.setInt(2, idRestriccion);
                procesoEliminarRestriccion.executeUpdate();

            } catch (SQLException e) {
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }
    }

    public void eliminarTiempoComida(){

        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object eliminarTiempoComida = cuadroActualizarTiempoComida.getSelectionModel().getSelectedItem();

        if(nombreRestaurante ==null || eliminarTiempoComida ==null)
            ventanaError("Se debe escoger un restaurante y un tiempo de comida");
        else{
            try{
                int idRestaurante = buscarIdRestaurante(nombreRestaurante.toString());
                int idTiempoComida = buscarIdTiempoComida(eliminarTiempoComida.toString());

                String eliminarTiempoComidaRestaurante = "DELETE FROM TIEMPOSCOMIDARESTAURANTE WHERE IDRESTAURANTE = ? AND IDTIEMPOCOMIDA=?";
                PreparedStatement procesoEliminarTiempoComida = connection.prepareStatement(eliminarTiempoComidaRestaurante);
                procesoEliminarTiempoComida.setInt(1,idRestaurante);
                procesoEliminarTiempoComida.setInt(2,idTiempoComida);
                procesoEliminarTiempoComida.executeUpdate();

            }
            catch(SQLException e){
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }


    }

    public void eliminarBuenoPara(){

        Object nombreRestaurante = cuadroActualizarRestaurantes.getSelectionModel().getSelectedItem();
        Object eliminarBuenoPara = cuadroActualizarBuenoPara.getSelectionModel().getSelectedItem();

        if(nombreRestaurante ==null || eliminarBuenoPara ==null)
            ventanaError("Se debe escoger un restaurante y un tipo de ocasion");
        else{
            try{
                int idRestaurante = buscarIdRestaurante(nombreRestaurante.toString());
                int idBuenoPara = buscarIdBuenoPara(eliminarBuenoPara.toString());

                String eliminarBuenoParaRestaurante = "DELETE FROM BUENOPARARESTAURANTE WHERE IDRESTAURANTE = ? AND IDBUENOPARA =?";
                PreparedStatement procesoEliminarBuenoPara = connection.prepareStatement(eliminarBuenoParaRestaurante);
                procesoEliminarBuenoPara.setInt(1,idRestaurante);
                procesoEliminarBuenoPara.setInt(2,idBuenoPara);
                procesoEliminarBuenoPara.executeUpdate();

            }
            catch(SQLException e){
                ventanaError("Hubo un error al actualizar la informacion. Intente de nuevo");
            }

        }
    }

    public void agregarPlatillo(){
        Object restauranteAgregarPlatillo = cuadroRestaurantesPlatillos.getSelectionModel().getSelectedItem();
        String nombrePlatillo = cuadroNombreNuevoPlatillo.getText();
        String descripcionPlatillo= cuadroDescripcionNuevoPlatillo.getText();
        if(restauranteAgregarPlatillo ==null || nombrePlatillo.equals("") || descripcionPlatillo.equals("")){
            ventanaError("Se debe ingresar todos los datos del platillo");
        }
        else{
            try{
                int ultimoId = 0;
                int idRestaurante = buscarIdRestaurante(restauranteAgregarPlatillo.toString());
                String agregarPlatillo = "INSERT INTO PLATILLOS (NOMBRE,IDRESTAURANTE,DESCRIPCION) VALUES (?,?,?)";
                PreparedStatement insercionPlatillo = connection.prepareStatement(agregarPlatillo,Statement.RETURN_GENERATED_KEYS);
                insercionPlatillo.setString(1,nombrePlatillo);
                insercionPlatillo.setInt(2,idRestaurante);
                insercionPlatillo.setString(3,descripcionPlatillo);
                insercionPlatillo.executeUpdate();

                ResultSet ultimoIdPlatillo = insercionPlatillo.getGeneratedKeys();

                while(ultimoIdPlatillo.next()){
                    ultimoId = ultimoIdPlatillo.getInt(1);
                    System.out.println("ID ultimo platillo:" + ultimoId);
                }

                String insertarEnContienePlatillos = "INSERT INTO CONTIENEPLATILLOS (IDRESTAURANTE,IDPLATILLO) VALUES (?,?)";
                PreparedStatement insercionContienePlatillos = connection.prepareStatement(insertarEnContienePlatillos);
                insercionContienePlatillos.setInt(1,idRestaurante);
                insercionContienePlatillos.setInt(2,ultimoId);
                insercionContienePlatillos.executeUpdate();

            }
            catch(SQLException e){
                e.printStackTrace();
                ventanaError("El platillo ingresado ya existe. Intente de nuevo");
            }


        }
    }

    public void eliminarPlatillo(){
        Object restaurante = cuadroRestauranteEliminarPlatillo.getSelectionModel().getSelectedItem();
        Object platillo = cuadroPlatilloEliminarPlatillo.getSelectionModel().getSelectedItem();

        if(restaurante==null || platillo ==null)
            ventanaError("Se debe escoger el restaurante y el platillo a eliminar");
        else{
            try {
                int idRestauranteAEliminar = buscarIdRestaurante(restaurante.toString());

                String eliminarPlatillo = "DELETE FROM PLATILLOS WHERE NOMBRE =? AND IDRESTAURANTE = ?";
                PreparedStatement eliminarComida = connection.prepareStatement(eliminarPlatillo);
                eliminarComida.setString(1,platillo.toString());
                eliminarComida.setInt(2,idRestauranteAEliminar);
                eliminarComida.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public void limpiarInformacionAgregarPlatillo(){
        cuadroRestaurantesPlatillos.getSelectionModel().clearSelection();
        cuadroNombreNuevoPlatillo.clear();
        cuadroDescripcionNuevoPlatillo.clear();
    }

    public void actualizarTabConsultas(){
        ObservableList<String> colaboradoresDisponibles = colaboradoresTotales();
        ObservableList<String> restaurantesDisponibles = restaurantesTotales();

        cuadroBuscarAmigosColaborador.setItems(colaboradoresDisponibles);
        cuadroNombreComentariosRestaurante.setItems(restaurantesDisponibles);


    }

    public ObservableList<String> colaboradoresTotales(){

        ArrayList<String> colaboradoresDisponibles  = new ArrayList<>();
        String colaboradorActual= "";
        ObservableList<String> listaColaboradores = null;
        try{
            String buscarColaborades = "SELECT NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO FROM COLABORADORES";
            PreparedStatement buscarColaboradoresTotales = connection.prepareStatement(buscarColaborades);
            ResultSet busquedaColaboradores = buscarColaboradoresTotales.executeQuery();

            while(busquedaColaboradores.next()){
                colaboradorActual= busquedaColaboradores.getString("NOMBRE") +" "+busquedaColaboradores.getString("APELLIDOPATERNO")+ " "+busquedaColaboradores.getString("APELLIDOMATERNO");
                colaboradoresDisponibles.add(colaboradorActual);
                colaboradorActual = "";
            }

            listaColaboradores = FXCollections.observableArrayList(colaboradoresDisponibles);

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaColaboradores;

    }

    public String buscarNombreColaborador(String correo){
        String nombreBuscado = "";
        try{

            String buscarNombreColaborador = "SELECT NOMBRE FROM COLABORADORES WHERE CORREO = ?";
            PreparedStatement busquedaNombre = connection.prepareStatement(buscarNombreColaborador);
            busquedaNombre.setString(1,correo);
            ResultSet adquirirNombre = busquedaNombre.executeQuery();
            while(adquirirNombre.next()){
                nombreBuscado = adquirirNombre.getString("NOMBRE");
            }


        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return nombreBuscado;

    }

    public void actualizarTabMasConsultas(){

        ObservableList <String> listaColaboradores = colaboradoresTotales();
        ObservableList <String> listaRestaurantes = restaurantesTotales();

        cuadroColaboradorBaresRecomendados.setItems(listaColaboradores);
        cuadroColaboradorPlatillosValorados.setItems(listaColaboradores);
        cuadroRestaurantePlatillosValorados.setItems(listaRestaurantes);

    }

    public void actualizarTabComentarios(){
        ObservableList<String> restaurantesDisponibles = restaurantesTotales();
        agregarComentarioRestaurante.setItems(restaurantesDisponibles);
        try {
            String buscarComentarios = "SELECT NOMBRERESTAURANTE,TEXTO,ANHO,MES,CORREOCOLABORADOR FROM COMENTARIOS";
            ArrayList<Comentario> comentarios = new ArrayList<>();
            ResultSet busquedaComentarios = statement.executeQuery(buscarComentarios);


            while(busquedaComentarios.next()){
                String buscarNombreRestaurant = buscarRestaurantePorId(busquedaComentarios.getInt("NOMBRERESTAURANTE"));
                comentarios.add(new Comentario(buscarNombreRestaurant,busquedaComentarios.getString("TEXTO"),
                        String.valueOf(busquedaComentarios.getInt("ANHO")),busquedaComentarios.getString("MES"),busquedaComentarios.getString("CORREOCOLABORADOR")));
            }
            ObservableList<Comentario> listaComentarios = FXCollections.observableArrayList(comentarios);
            tablaRestaurantesComentarios.setItems(listaComentarios);

        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }

    public String buscarRestaurantePorId(int id){
        String restauranteEncontrado = "";

        try{
            String buscarNombreRestaurante = "SELECT NOMBRE FROM RESTAURANTES WHERE ID=?";
            PreparedStatement buscarRestaurante = connection.prepareStatement(buscarNombreRestaurante);
            buscarRestaurante.setInt(1,id);
            ResultSet busquedaRestaurante = buscarRestaurante.executeQuery();

            while(busquedaRestaurante.next()){
                restauranteEncontrado= busquedaRestaurante.getString("NOMBRE");
            }
        }
        catch(SQLException e){
            e.printStackTrace();

        }
        return restauranteEncontrado;
    }

    public void agregarComentario(){
        Object nombreRestaurante = agregarComentarioRestaurante.getSelectionModel().getSelectedItem();
        Object mesComentario = agregarComentarioMes.getSelectionModel().getSelectedItem();
        Object annoComentario = agregarComentarioAnno.getSelectionModel().getSelectedItem();
        Object clasificacionCliente = agregarComentarioClasificacionCliente.getSelectionModel().getSelectedItem();
        Object valoracion = agregarComentarioValoracion.getSelectionModel().getSelectedItem();
        String opinion = agregarComentarioOpinion.getText();

        if(nombreRestaurante==null || mesComentario==null ||annoComentario==null || clasificacionCliente==null || valoracion ==null ||
                opinion.equals("") ||correoColaboradorLogueado.equals(""))
            ventanaError("Debe ingresar todos los datos del comentario o estar logueado como colaborador");

        else{
            try {
                int idRestaurante = buscarIdRestaurante(nombreRestaurante.toString());
                String insertarComentario = "INSERT INTO COMENTARIOS (CORREOCOLABORADOR,TEXTO,VALORACION,ANHO,MES,CLASIFICACIONCLIENTE,NOMBRERESTAURANTE)" +
                        "VALUES (?,?,?,?,?,?,?)";
                PreparedStatement insercionComentario = connection.prepareStatement(insertarComentario);
                insercionComentario.setString(1,correoColaboradorLogueado);
                insercionComentario.setString(2,opinion);
                insercionComentario.setInt(3,Integer.parseInt(valoracion.toString()));
                insercionComentario.setInt(4,Integer.parseInt(annoComentario.toString()));
                insercionComentario.setString(5,mesComentario.toString());
                insercionComentario.setString(6,clasificacionCliente.toString());
                insercionComentario.setInt(7,idRestaurante);

                insercionComentario.executeUpdate();

            }
            catch(SQLException e){
                ventanaError("No puede ingresar mas de un comentario de un restaurante el mismo mes");
            }


        }

    }

    public void limpiarInformacionComentario(){
        agregarComentarioRestaurante.getSelectionModel().clearSelection();
        agregarComentarioMes.getSelectionModel().clearSelection();
        agregarComentarioValoracion.getSelectionModel().clearSelection();
        agregarComentarioAnno.getSelectionModel().clearSelection();
        agregarComentarioClasificacionCliente.getSelectionModel().clearSelection();
        agregarComentarioOpinion.clear();
    }

    public void settearPlatillosRestauranteComentario(){
        if(tablaRestaurantesComentarios.getSelectionModel().getSelectedItem() ==null) {
            ventanaError("No hay comentarios seleccionados");
            cuadroPlatillosRestaurante.getItems().removeAll(cuadroPlatillosRestaurante.getItems());
        }
        else{
            Comentario comentario = (Comentario) tablaRestaurantesComentarios.getSelectionModel().getSelectedItem();
            if(!comentario.getColaborador().equals(correoColaboradorLogueado) || correoColaboradorLogueado.equals("")){
                ventanaError("Debe loguearse para agregar un comentario de platillo o el usuario logueado no corresponde");
            }
            else {

                comentarioSeleccionado = comentario;
                ObservableList<String> platillosRestaurante = platillosRestaurantes(comentario.getRestaurante());
                cuadroPlatillosRestaurante.setItems(platillosRestaurante);
            }
        }


    }

    public ObservableList<String> platillosRestaurantes(String nombreRestaurante){
        ObservableList<String> listaPlatillos = null;
        try {
            ArrayList<String> platillos = new ArrayList<>();

            int buscarIdRestaurante = buscarIdRestaurante(nombreRestaurante);
            String buscarPlatillosAsociados = "SELECT NOMBRE FROM  PLATILLOS WHERE IDRESTAURANTE = ?";
            PreparedStatement busquedaPlatillos = connection.prepareStatement(buscarPlatillosAsociados);

            busquedaPlatillos.setInt(1,buscarIdRestaurante);
            ResultSet extraccionDePlatillos = busquedaPlatillos.executeQuery();

            while (extraccionDePlatillos.next()){
                platillos.add(extraccionDePlatillos.getString("NOMBRE"));
            }
            listaPlatillos = FXCollections.observableArrayList(platillos);

            cuadroPlatilloEliminarPlatillo.setItems(listaPlatillos);


        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return listaPlatillos;
    }

    public void agregarComentarioPlatillo(){

        Object platilloSeleccionado = cuadroPlatillosRestaurante.getSelectionModel().getSelectedItem();
        String comentarioPlatillo = cuadroComentarioPlatillo.getText();
        Object valoracionPlatillo = cuadroValoracionPlatillo.getSelectionModel().getSelectedItem();

        if(platilloSeleccionado==null || comentarioSeleccionado==null ||comentarioPlatillo.equals("") || valoracionPlatillo==null ||correoColaboradorLogueado.equals(""))
            ventanaError("Debe ingresar todos los datos del comentario, seleccionar un comentario para asociar y debe estar logueado");
        else{
            try{
                int idRestaurante =  buscarIdRestaurante(comentarioSeleccionado.getRestaurante());
                String comentario = comentarioSeleccionado.getComentario();
                String anno = comentarioSeleccionado.getAnno();
                String mes = comentarioSeleccionado.getMes();
                String colaborador = comentarioSeleccionado.getColaborador();

                int idComentarioAsociar = devolverIdAsociadoComentario(idRestaurante,comentario,anno,mes,colaborador);
                int idPlatillo = buscarIdPlatillo(platilloSeleccionado.toString(),idRestaurante);
                String insertarEnComentarioPlatillos = "INSERT INTO COMENTARIOSPLATILLOS (IDCOMENTARIO,TEXTO,IDPLATILLO,VALORACION)" +
                        "VALUES(?,?,?,?)";

                PreparedStatement insercionComentarioPlatillo = connection.prepareStatement(insertarEnComentarioPlatillos);
                insercionComentarioPlatillo.setInt(1,idComentarioAsociar);
                insercionComentarioPlatillo.setString(2,comentarioPlatillo);
                insercionComentarioPlatillo.setInt(3,idPlatillo);
                insercionComentarioPlatillo.setInt(4,Integer.parseInt(valoracionPlatillo.toString()));

                insercionComentarioPlatillo.executeUpdate();

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }


    }

    public int devolverIdAsociadoComentario(int restaurante, String comentario, String anno, String mes, String colaborador){
        int idBuscado = 0;
        try{
            String buscarId = "SELECT ID FROM COMENTARIOS WHERE NOMBRERESTAURANTE =? AND TEXTO =? AND ANHO=? AND MES=? AND CORREOCOLABORADOR=?";
            PreparedStatement buscarIdComentario = connection.prepareStatement(buscarId);
            buscarIdComentario.setInt(1,restaurante);
            buscarIdComentario.setString(2,comentario);
            buscarIdComentario.setInt(3,Integer.parseInt(anno));
            buscarIdComentario.setString(4,mes);
            buscarIdComentario.setString(5,colaborador);

            ResultSet busquedaId = buscarIdComentario.executeQuery();
            while(busquedaId.next()){
                idBuscado = busquedaId.getInt("ID");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idBuscado;

    }

    public void limpiarTabComentarios(){

        agregarComentarioRestaurante.getSelectionModel().clearSelection();
        agregarComentarioMes.getSelectionModel().clearSelection();
        agregarComentarioValoracion.getSelectionModel().clearSelection();
        agregarComentarioAnno.getSelectionModel().clearSelection();
        agregarComentarioClasificacionCliente.getSelectionModel().clearSelection();
        agregarComentarioOpinion.clear();
        cuadroComentarioPlatillo.clear();
        cuadroPlatillosRestaurante.getSelectionModel().clearSelection();
        cuadroValoracionPlatillo.getSelectionModel().clearSelection();
    }

    public int buscarIdPlatillo(String nombre, int idRestaurante){
        int idBuscado = 0;
        try{
            String buscarId = "SELECT ID FROM PLATILLOS WHERE NOMBRE =? AND IDRESTAURANTE =?";
            PreparedStatement idPlatillo = connection.prepareStatement(buscarId);
            idPlatillo.setString(1,nombre);
            idPlatillo.setInt(2,idRestaurante);
            ResultSet busquedaId = idPlatillo.executeQuery();

            while(busquedaId.next()){
                idBuscado = busquedaId.getInt("ID");
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return idBuscado;
    }

    public void consultarComentariosRestaurante(){
        Object restauranteSeleccionado = cuadroNombreComentariosRestaurante.getSelectionModel().getSelectedItem();
        Object ciudadSeleccionada = cuadroCiudadComentariosRestaurante.getSelectionModel().getSelectedItem();
        if (restauranteSeleccionado == null || ciudadSeleccionada == null)
            ventanaError("Se deben seleccionar el nombre del restaurante y la ciudad");
        else{
            try{
                ArrayList<Comentario> comentarios = new ArrayList<>();
                List<Comentario> comentariosTop10 = new ArrayList<>();
                String nombreRestaurante = restauranteSeleccionado.toString();

                int idRestaurante = buscarIdRestaurante(nombreRestaurante);
                String comentariosRestaurante = "SELECT ANHO, MES, TEXTO FROM COMENTARIOS WHERE NOMBRERESTAURANTE = ?";
                PreparedStatement buscarComentarios = connection.prepareStatement(comentariosRestaurante);
                buscarComentarios.setInt(1, idRestaurante);
                ResultSet fechasComentarios = buscarComentarios.executeQuery();

                while (fechasComentarios.next()){
                    String fechaAUsar = fechaAUsar(fechasComentarios.getString("MES"),fechasComentarios.getString("ANHO"));
                    comentarios.add(new Comentario (fechaAUsar,fechasComentarios.getString("TEXTO")));
                }

                Collections.sort(comentarios, new Comparator<Comentario>() {
                    @Override
                    public int compare(Comentario o1, Comentario o2) {
                        return o1.fechaUsar.compareTo(o2.fechaUsar);
                    }
                });

                for (Comentario comentario : comentarios) {
                    comentario.fecha = comentario.settearFecha(comentario.fechaUsar);
                }
                if(comentarios.size()>10){
                    comentariosTop10 = comentarios.subList(comentarios.size()-10,comentarios.size());
                    ObservableList<Comentario> comentariosCropped = FXCollections.observableList(comentariosTop10);
                    tablaComentariosRestaurante.setItems(comentariosCropped);
                }
                else {
                    ObservableList<Comentario> comentariosPorFecha = FXCollections.observableArrayList(comentarios);
                    tablaComentariosRestaurante.setItems(comentariosPorFecha);
                }



            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void consultarRestaurantesVegetarianos(){
        Object ciudadSeleccionada = cuadroCiudadRestaurantesVegetarianos.getSelectionModel().getSelectedItem();
        if(ciudadSeleccionada == null)
            ventanaError("Debe seleccionar una ciudad");
        else{
            try {
                ArrayList<Restaurante> restaurantesVegetarianos = new ArrayList<>();
                String nombreCiudad = ciudadSeleccionada.toString();
                int idCiudad = buscarIdCiudad(nombreCiudad);
                int idRestric = buscarIdRestricciones("Vegetarianas");
                int idTiempoCom = buscarIdTiempoComida("Cena");
                int idRangoPrecio = buscarIdRangoPrecio("Intermedio");
                String restaurantesSelecc = "SELECT NOMBRE FROM RESTAURANTES, RESTRICCIONESRESTAURANTE rest, " +
                        "TIEMPOSCOMIDARESTAURANTE tiempos WHERE IDCIUDAD = ? AND IDRANGOPRECIO = ? " +
                        "AND ID = rest.IDRESTAURANTE AND IDRESTRICCIONES = ? AND ID = tiempos.IDRESTAURANTE AND " +
                        "IDTIEMPOCOMIDA = ?";

                PreparedStatement buscarRestaurantes = connection.prepareStatement(restaurantesSelecc);
                buscarRestaurantes.setString(1, String.valueOf(idCiudad));
                buscarRestaurantes.setInt(2, idRangoPrecio);
                buscarRestaurantes.setInt(3, idRestric);
                buscarRestaurantes.setInt(4, idTiempoCom);
                ResultSet listaRestaurantes = buscarRestaurantes.executeQuery();

                while (listaRestaurantes.next()){
                    restaurantesVegetarianos.add(new Restaurante (listaRestaurantes.getString("NOMBRE")));
                }

                ObservableList<Restaurante> restaurantesVegetarianosCena = FXCollections.observableArrayList(restaurantesVegetarianos);
                tablaRestaurantesVegetarianos.setItems(restaurantesVegetarianosCena);

            }
            catch(SQLException e){
                e.printStackTrace();
            }


        }
    }

    public void consultarAmigosColaborador(){
        Object colaboradorSeleccionado = cuadroBuscarAmigosColaborador.getSelectionModel().getSelectedItem();
        Object correoColaboradorSeleccionado = cuadroBuscarAmigosColaboradorCorreo.getSelectionModel().getSelectedItem();

        if(colaboradorSeleccionado ==null || correoColaboradorSeleccionado==null)
            ventanaError("Debe seleccionar un colaborador");
        else{
            try {
                ArrayList<Amigo> amigosColaborador = new ArrayList<>();
                ArrayList<String> correosAmigos = new ArrayList<>();
                String correoColaborador = correoColaboradorSeleccionado.toString();

                String buscarCorreoAmigos = "SELECT CORREOAMIGO FROM AMIGOS WHERE CORREOCOLABORADOR =? AND ACEPTADO=?";
                PreparedStatement buscarCorreoAmigosColaborador = connection.prepareStatement(buscarCorreoAmigos);
                buscarCorreoAmigosColaborador.setString(1,correoColaborador);
                buscarCorreoAmigosColaborador.setString(2,"SI");
                ResultSet tuplesCorreoAmigos = buscarCorreoAmigosColaborador.executeQuery();

                while(tuplesCorreoAmigos.next()){
                    correosAmigos.add(tuplesCorreoAmigos.getString("CORREOAMIGO"));
                }

                String buscarCorreoOtroLado = "SELECT CORREOCOLABORADOR FROM AMIGOS WHERE CORREOAMIGO =? AND ACEPTADO=?";
                PreparedStatement buscarCorreoAmigosColaboradorOtroLado = connection.prepareStatement(buscarCorreoOtroLado);
                buscarCorreoAmigosColaboradorOtroLado.setString(1,correoColaborador);
                buscarCorreoAmigosColaboradorOtroLado.setString(2,"SI");
                ResultSet correoOtroLado = buscarCorreoAmigosColaboradorOtroLado.executeQuery();

                while(correoOtroLado.next()){
                    correosAmigos.add(correoOtroLado.getString("CORREOCOLABORADOR"));
                }
                for(int i =0;i<correosAmigos.size();i++){
                    String nombreColaborador = buscarNombreColaborador(correosAmigos.get(i));
                    amigosColaborador.add(new Amigo(nombreColaborador,correosAmigos.get(i)));
                }



                ObservableList<Amigo> listaAmigos = FXCollections.observableArrayList(amigosColaborador);

                tablaAmigosColaborador.setItems(listaAmigos);


            }
            catch(SQLException e){
                e.printStackTrace();
            }


        }

    }

    public ArrayList<String> listaAmigosColaborador(String correoColaborador){
        ArrayList<String> correosAmigos = new ArrayList<>();
        try {


            String buscarCorreoAmigos = "SELECT CORREOAMIGO FROM AMIGOS WHERE CORREOCOLABORADOR =? AND ACEPTADO=?";
            PreparedStatement buscarCorreoAmigosColaborador = connection.prepareStatement(buscarCorreoAmigos);
            buscarCorreoAmigosColaborador.setString(1, correoColaborador);
            buscarCorreoAmigosColaborador.setString(2, "SI");
            ResultSet tuplesCorreoAmigos = buscarCorreoAmigosColaborador.executeQuery();

            while (tuplesCorreoAmigos.next()) {
                correosAmigos.add(tuplesCorreoAmigos.getString("CORREOAMIGO"));
            }

            String buscarCorreoOtroLado = "SELECT CORREOCOLABORADOR FROM AMIGOS WHERE CORREOAMIGO =? AND ACEPTADO=?";
            PreparedStatement buscarCorreoAmigosColaboradorOtroLado = connection.prepareStatement(buscarCorreoOtroLado);
            buscarCorreoAmigosColaboradorOtroLado.setString(1, correoColaborador);
            buscarCorreoAmigosColaboradorOtroLado.setString(2, "SI");
            ResultSet correoOtroLado = buscarCorreoAmigosColaboradorOtroLado.executeQuery();

            while (correoOtroLado.next()) {
                correosAmigos.add(correoOtroLado.getString("CORREOCOLABORADOR"));
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return correosAmigos;

    }

    public String fechaAUsar(String mes,String anno){
        String fechaCorrecta = "";
        switch (mes){
            case "Enero":
                fechaCorrecta = "JAN-"+anno;
                break;
            case "Febrero":
                fechaCorrecta = "FEB-"+anno;
                break;
            case "Marzo":
                fechaCorrecta = "MAR-"+anno;
                break;
            case "Abril":
                fechaCorrecta = "APR-"+anno;
                break;
            case "Mayo":
                fechaCorrecta = "MAY-"+anno;
                break;
            case "Junio":
                fechaCorrecta = "JUN-"+anno;
                break;
            case "Julio":
                fechaCorrecta = "JUL-"+anno;
                break;
            case "Agosto":
                fechaCorrecta = "AUG-"+anno;
                break;
            case "Setiembre":
                fechaCorrecta = "SEP-"+anno;
                break;
            case "Octubre":
                fechaCorrecta = "OCT-"+anno;
                break;
            case "Noviembre":
                fechaCorrecta = "NOV-"+anno;
                break;
            case "Diciembre":
                fechaCorrecta = "DEC-"+anno;
                break;

        }
        return fechaCorrecta;
    }

    public void consultarBaresRecomendados(){
        Object ciudadSeleccionada = cuadroCiudadBaresRecomendados.getSelectionModel().getSelectedItem();
        Object colaboradorSeleccionado = cuadroColaboradorBaresRecomendados.getSelectionModel().getSelectedItem();
        Object cuadroColaboradorCorreo = cuadroColaboradoresBaresRecomendadosCorreo.getSelectionModel().getSelectedItem();

        if (ciudadSeleccionada == null || colaboradorSeleccionado == null || cuadroColaboradorCorreo==null){
            ventanaError("Se deben seleccir colaborador para realizar la búsqueda");
        }
        else{
            try{
                ArrayList<String> nombreBares = new ArrayList<>();
                ArrayList<Restaurante> consulta = new ArrayList<>();

                int idBar = buscarIdEstablecimiento("Bar");
                int idCiudad = buscarIdCiudad(ciudadSeleccionada.toString());
                String selectTuples = "SELECT com.VALORACION,com.CORREOCOLABORADOR,com.NOMBRERESTAURANTE FROM COMENTARIOS com," +
                        "RESTAURANTES rest,COLABORADORES col,AMIGOS am WHERE IDCIUDAD= ? AND IDESTABLECIMIENTO =? AND rest.ID= com.NOMBRERESTAURANTE AND com.CORREOCOLABORADOR = col.CORREO AND col.CORREO =am.CORREOCOLABORADOR AND am.CORREOAMIGO=? AND am.ACEPTADO=?";

                PreparedStatement busquedaUnLado = connection.prepareStatement(selectTuples);
                busquedaUnLado.setString(1,String.valueOf(idCiudad));
                busquedaUnLado.setInt(2,idBar);
                busquedaUnLado.setString(3,cuadroColaboradorCorreo.toString());
                busquedaUnLado.setString(4,"SI");

                ResultSet busquedaUnLadoTuples = busquedaUnLado.executeQuery();
                while(busquedaUnLadoTuples.next()){
                    String nombreRest = buscarRestaurantePorId(busquedaUnLadoTuples.getInt("NOMBRERESTAURANTE"));
                    consulta.add(new Restaurante (nombreRest,busquedaUnLadoTuples.getString("CORREOCOLABORADOR"),
                            String.valueOf(busquedaUnLadoTuples.getInt("VALORACION"))));

                }

                String selectTuplesOtroLado = "SELECT com.VALORACION,com.CORREOCOLABORADOR,com.NOMBRERESTAURANTE FROM COMENTARIOS com," +
                        "RESTAURANTES rest,COLABORADORES col,AMIGOS am WHERE IDCIUDAD= ? AND IDESTABLECIMIENTO =? AND rest.ID= com.NOMBRERESTAURANTE AND com.CORREOCOLABORADOR = col.CORREO AND col.CORREO =am.CORREOAMIGO AND am.CORREOCOLABORADOR=? AND am.ACEPTADO=?";

                PreparedStatement busquedaOtroLado = connection.prepareStatement(selectTuplesOtroLado);
                busquedaOtroLado.setString(1,String.valueOf(idCiudad));
                busquedaOtroLado.setInt(2,idBar);
                busquedaOtroLado.setString(3,cuadroColaboradorCorreo.toString());
                busquedaOtroLado.setString(4,"SI");

                ResultSet busquedaOtroLadoTuples = busquedaOtroLado.executeQuery();
                while(busquedaOtroLadoTuples.next()){
                    String nombreRest = buscarRestaurantePorId(busquedaOtroLadoTuples.getInt("NOMBRERESTAURANTE"));
                    consulta.add(new Restaurante (nombreRest,busquedaOtroLadoTuples.getString("CORREOCOLABORADOR"),
                            String.valueOf(busquedaOtroLadoTuples.getInt("VALORACION"))));

                }
//****************************************SACO PROMEDIO
                ArrayList<Restaurante> repetidos = new ArrayList<>();
                int contador = 0;
                float promedio = 0;
                boolean yaSumo = false;
                boolean huboRepetido = false;
               String restActual = "";
               String amigoActual = "";

                for (Restaurante restaurante : consulta) {
                    for (Restaurante restaurante1 : consulta) {
                        amigoActual= restaurante.getAmigo();
                        restActual = restaurante.getNombre();
                        if (restaurante.getAmigo().equals(restaurante1.getAmigo())  && restaurante.getNombre().equals(restaurante1.getNombre())) {
                            if (restaurante.equals(restaurante1))
                                contador++;
                            else {
                                huboRepetido = true;
                                if (yaSumo) {
                                    promedio += Integer.parseInt(restaurante1.getValoracion());
                                } else {
                                    promedio += Integer.parseInt(restaurante.getValoracion()) + Integer.parseInt(restaurante1.getValoracion());
                                    yaSumo = true;
                                }
                                contador++;
                            }
                        }

                    }
                    if(huboRepetido) {
                        promedio = promedio/contador;
                        boolean existe = false;
                        Restaurante restRepetido = new Restaurante(restActual,amigoActual, String.valueOf(promedio));
                        for (Restaurante repetido : repetidos) {
                            if(restRepetido.getNombre().equals(repetido.getNombre()) && restRepetido.getAmigo().equals(repetido.getAmigo()))
                                existe=true;
                        }
                        if(!existe)
                            repetidos.add(restRepetido);

                    }
                    amigoActual="";
                    restActual="";
                    promedio=0;
                    contador= 0;
                    huboRepetido=false;
                    yaSumo=false;
                }
                int contadorAux = 0;
                boolean entro = false;
                for (Restaurante repetido : repetidos) {
                    while(contadorAux<consulta.size()) {

                        Restaurante actual = consulta.get(contadorAux);
                        if (repetido.getNombre().equals(actual.getNombre()) && actual.getAmigo().equals(repetido.getAmigo())) {
                            consulta.remove(actual);
                            contadorAux = 0;
                            entro = true;
                        }
                        if(!entro)
                            contadorAux++;
                        entro=false;

                    }
                    contadorAux=0;
                }
                consulta.addAll(repetidos);
                //****************************************SACO PROMEDIO
                Collections.sort(consulta, new Comparator<Restaurante>() {
                    @Override
                    public int compare(Restaurante o1, Restaurante o2) {
                        return Float.valueOf(o2.getValoracion()).compareTo(Float.valueOf(o1.getValoracion()));//(int)Float.parseFloat(o2.getValoracion()) - Float.parseFloat(o1.getValoracion()));
                    }
                });
                ObservableList<Restaurante> listaConsultada = FXCollections.observableArrayList(consulta);
                tablaBaresRecomendados.setItems(listaConsultada);

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void consultarComentariosPlatillos(){
        Object restauranteSeleccionado = cuadroRestaurantePlatillosValorados.getSelectionModel().getSelectedItem();
        Object colaboradorSeleccionado = cuadroColaboradorPlatillosValorados.getSelectionModel().getSelectedItem();
        Object correoSeleccionado = cuadroColaboradorPlatillosValoradosCorreo.getSelectionModel().getSelectedItem();
        if (restauranteSeleccionado == null || colaboradorSeleccionado == null || correoSeleccionado == null)
            ventanaError("Se deben seleccionar el nombre del restaurante y el colaborador, junto a su correo");
        else{
            try{
                ArrayList<ComentarioPlatillo> valoracionPlatillos = new ArrayList<>();
                String nombreRestaurante = restauranteSeleccionado.toString();
                String correoColaborador = correoSeleccionado.toString();
                int idRestaurante = buscarIdRestaurante(nombreRestaurante);

                String comentariosUnLado = "SELECT comp.IDPLATILLO, comp.VALORACION, com.CORREOCOLABORADOR FROM COMENTARIOSPLATILLOS comp,COMENTARIOS com, COLABORADORES col, AMIGOS am  " +
                "WHERE com.ID = comp.IDCOMENTARIO AND NOMBRERESTAURANTE = ? AND com.CORREOCOLABORADOR = col.CORREO"+
                        " AND col.CORREO = am.CORREOCOLABORADOR AND am.CORREOAMIGO = ? AND am.ACEPTADO = ?";

                PreparedStatement buscarComentarios = connection.prepareStatement(comentariosUnLado);
                buscarComentarios.setInt(1, idRestaurante);
                buscarComentarios.setString(2,correoColaborador);
                buscarComentarios.setString(3,"SI");
                ResultSet busquedaComentariosPlatillosUnLado = buscarComentarios.executeQuery();

                while (busquedaComentariosPlatillosUnLado.next()){
                    String nombrePlatillo = buscarPlatilloPorId(idRestaurante,busquedaComentariosPlatillosUnLado.getInt("IDPLATILLO"));
                    valoracionPlatillos.add(new ComentarioPlatillo (busquedaComentariosPlatillosUnLado.getString("CORREOCOLABORADOR"),nombrePlatillo,
                            String.valueOf(busquedaComentariosPlatillosUnLado.getInt("VALORACION"))));
                }

                String comentariosOtroLado = "SELECT comp.IDPLATILLO, comp.VALORACION, com.CORREOCOLABORADOR FROM COMENTARIOSPLATILLOS comp,COMENTARIOS com, COLABORADORES col, AMIGOS am  " +
                        "WHERE com.ID = comp.IDCOMENTARIO AND NOMBRERESTAURANTE = ? AND com.CORREOCOLABORADOR = col.CORREO"+
                        " AND col.CORREO = am.CORREOAMIGO AND am.CORREOCOLABORADOR = ? AND am.ACEPTADO = ?";
                PreparedStatement buscarComentariosOtroLado = connection.prepareStatement(comentariosOtroLado);
                buscarComentariosOtroLado.setInt(1,idRestaurante);
                buscarComentariosOtroLado.setString(2,correoColaborador);
                buscarComentariosOtroLado.setString(3,"SI");
                ResultSet busquedaComentariosPlatillosOtroLado = buscarComentariosOtroLado.executeQuery();

                while(busquedaComentariosPlatillosOtroLado.next()){
                    String nombrePlatillo = buscarPlatilloPorId(idRestaurante,busquedaComentariosPlatillosOtroLado.getInt("IDPLATILLO"));
                    valoracionPlatillos.add(new ComentarioPlatillo (busquedaComentariosPlatillosOtroLado.getString("CORREOCOLABORADOR"),nombrePlatillo,
                            String.valueOf(busquedaComentariosPlatillosOtroLado.getInt("VALORACION"))));
                }

                Collections.sort(valoracionPlatillos, new Comparator<ComentarioPlatillo>() {
                    @Override
                    public int compare(ComentarioPlatillo o1, ComentarioPlatillo o2) {
                        return Integer.parseInt(o2.getValoracion())-Integer.parseInt(o1.getValoracion());
                    }
                });

                ObservableList<ComentarioPlatillo> platillosPorValoracion = FXCollections.observableArrayList(valoracionPlatillos);
                tablaPlatillosValorados.setItems(platillosPorValoracion);

            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }

    }

    public String buscarPlatilloPorId(int idRestaurante,int idPlatillo){
        String nombreEncontrado = "";
        try{

            String nombrePlatillo = "SELECT NOMBRE FROM PLATILLOS WHERE IDRESTAURANTE =? AND ID=?";
            PreparedStatement buscarPlatillo = connection.prepareStatement(nombrePlatillo);
            buscarPlatillo.setInt(1,idRestaurante);
            buscarPlatillo.setInt(2,idPlatillo);
            ResultSet busquedaNombrePlatillo = buscarPlatillo.executeQuery();

            while(busquedaNombrePlatillo.next()){
                nombreEncontrado = busquedaNombrePlatillo.getString("NOMBRE");
            }

        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return nombreEncontrado;
    }



}
