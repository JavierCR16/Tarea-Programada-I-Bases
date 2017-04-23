package Interfaz;

import Auxiliares.SolicitudAmistad;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    Connection connection;

    Statement statement;

    String correoColaboradorLogueado ="";

    public void initialize(URL fxmlLocations, ResourceBundle resources) {
        establecerConexion();
        setDatosDefecto();
        configurarColumnasTablas();

        botonAgregarColaborador.setOnAction(event -> {

            agregarColaborador();
            limpiarInformacionColaboradores();


        });

        botonLoguear.setOnAction(event->{
            loguearUsuario();
            cuadroIngresarUsuario.clear();
        });

        botonRefrescarColaboradores.setOnAction(event->{
            setListaColaboradoresDisponibles();
        });

        cuadroEnviarSolicitudColaboradores.setOnAction(event->{
            cuadroEnviarSolicitudColaboradoresCorreo.getItems().removeAll(cuadroEnviarSolicitudColaboradoresCorreo.getItems());
            if(cuadroEnviarSolicitudColaboradores.getSelectionModel().getSelectedItem()!=null) {
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
                        if(!correoColaboradorLogueado.equals(busquedaCorreo.getString("CORREO")))
                            cuadroEnviarSolicitudColaboradoresCorreo.getItems().add(busquedaCorreo.getString("CORREO"));
                    }

                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        });

        cuadroEnviarSolicitudColaboradoresCorreo.setOnAction(event->{
            if(cuadroEnviarSolicitudColaboradoresCorreo.getSelectionModel().getSelectedItem()!=null){
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

        botonAceptarSolicitud.setOnAction(event->{
            aceptarRechazarSolicitud(true);
            refrescarSolicitudesAmistad();
        });

        botonRechazarSolicitud.setOnAction(event -> {
            aceptarRechazarSolicitud(false);
            refrescarSolicitudesAmistad();
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
        Object paisColaborador= cuadroPaisNuevoColaborador.getSelectionModel().getSelectedItem();
        String sexo = "";
        String pais = "";

        if(sexoColaborador!=null)
            sexo= sexoColaborador.toString();
        if(paisColaborador!=null)
            pais = paisColaborador.toString();

        if (nombreColaborador.equals("") | apellidosColaborador.equals("") | correoColaborador.equals("") | usuarioColaborador.equals(""))
            ventanaError("El nombre, apellidos, correo y usuario son obligatorios.");


        else{
            String apellidoPaterno="";
            String apellidoMaterno="";
            boolean huboError = false;

            try {

             apellidoPaterno = apellidosColaborador.substring(0,apellidosColaborador.indexOf(" "));
             apellidoMaterno = apellidosColaborador.substring(apellidosColaborador.indexOf(" ")+1,apellidosColaborador.length());

            }catch(Exception e){
                huboError=true;
                ventanaError("Debe de Ingresar Ambos Apellidos");
            }
            if(!huboError) {
                escribirColaboradorBase(nombreColaborador,apellidoPaterno,apellidoMaterno,correoColaborador,usuarioColaborador,
                        residenciaColaborador,sexo,pais);
            }
        }

    }

    public void escribirColaboradorBase(String nombre,String paterno, String materno, String correo, String usuario,String residencia,String sexo,String pais){
        String insercionColaborador ="INSERT INTO COLABORADORES" +
                "(CORREO,NOMBREUSUARIO,NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,PAIS,PROVINCIA,SEXO)" + " VALUES(?,?,?,?,?,?,?,?)";
        //ORDEN : CORREO, USUARIO, NOMBRE, PATERNO, MATERNO, PAIS, PROVINCIA, SEXO

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insercionColaborador);
            preparedStatement.setString(1,correo);
            preparedStatement.setString(2,usuario);
            preparedStatement.setString(3,nombre);
            preparedStatement.setString(4,paterno);
            preparedStatement.setString(5,materno);


            if (residencia.equals("") && sexo.equals("") && pais.equals("")){

                preparedStatement.setNull(6, Types.VARCHAR);
                preparedStatement.setNull(7,Types.VARCHAR);
                preparedStatement.setNull(8,Types.VARCHAR);

            }
            else if(residencia.equals("") && sexo.equals("")){
                preparedStatement.setString(6, pais);
                preparedStatement.setNull(7,Types.VARCHAR);
                preparedStatement.setNull(8,Types.VARCHAR);
            }
            else if(sexo.equals("") && pais.equals("")){

                preparedStatement.setNull(6,Types.VARCHAR);
                preparedStatement.setString(7, residencia);
                preparedStatement.setNull(8,Types.VARCHAR);
            }
            else if(residencia.equals("") && pais.equals("")){
                preparedStatement.setNull(6,Types.VARCHAR);
                preparedStatement.setNull(7,Types.VARCHAR);
                preparedStatement.setString(8, sexo);

            }
            else if(residencia.equals("")){
                preparedStatement.setString(6,pais);
                preparedStatement.setNull(7,Types.VARCHAR);
                preparedStatement.setString(8, sexo);
            }
            else if(pais.equals("")){
                preparedStatement.setNull(6,Types.VARCHAR);
                preparedStatement.setString(7,residencia);
                preparedStatement.setString(8, sexo);
            }
            else if(sexo.equals("")){
                preparedStatement.setString(6,pais);
                preparedStatement.setString(7, residencia);
                preparedStatement.setNull(8,Types.VARCHAR);
            }
            else{
                preparedStatement.setString(6,pais);
                preparedStatement.setString(7, residencia);
                preparedStatement.setString(8,sexo);
            }
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }
        catch(SQLException e){
            e.printStackTrace();
            ventanaError("El Usuario o Correo ingresados ya existen. Intente de nuevo.");
        }

    }

    public void setDatosDefecto() {

        String limpiarTablaPaises = "TRUNCATE TABLE CARGARPAISES";

        String sqlCargarPaises = //FIXME  Revisar tabla CARGARPAISES y ver porque no esta insertando, puede ser un error en el with o el formato del csv

                "BULK INSERT PROGRABASES1.dbo.CARGARPAISES" +
                        " FROM 'C:\\Users\\Randall\\Desktop\\PrograBases\\Tarea-Programada-I-Bases\\ArchivosCargar\\paises.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = ',',ROWTERMINATOR = '\r\n', CODEPAGE = 'ACP')";

        String limpiarTablaCocina = "TRUNCATE TABLE CARGARTIPOSCOCINA";

        String sqlCargarTiposCocina =
                "BULK INSERT PROGRABASES1.dbo.CARGARTIPOSCOCINA" +
                        " FROM 'C:\\Users\\Randall\\Desktop\\PrograBases\\Tarea-Programada-I-Bases\\ArchivosCargar\\tiposCocina.csv'" +
                        " WITH( FIRSTROW = 2,FIELDTERMINATOR = '',ROWTERMINATOR = '\r\n', CODEPAGE='ACP')";

        String limpiarTablaCiudades = "TRUNCATE TABLE CARGARCIUDADES";

     //   String sqlCargaCiudades =
        //        "BULK INSERT PROGRABASES1.dbo.CARGARCIUDADES" +
        //                " FROM 'C:\\Users\\paula_000\\Desktop\\Tarea Programada Bases de Datos I\\Tarea-Programada-I-Bases\\ArchivosCargar\\cities15000.txt'" +
         //               " WITH(FIELDTERMINATOR = ' ',ROWTERMINATOR = ' ', CODEPAGE='ACP')";

        ArrayList<String> arregloCocina = new ArrayList<>();

        ArrayList<String> arregloPaises = new ArrayList<>();

    //    ArrayList<String> arregloCiudades = new ArrayList<>();

        try {
            statement.executeUpdate(limpiarTablaCocina);
            statement.executeUpdate(limpiarTablaPaises);
//            statement.executeUpdate(sqlCargaCiudades);
            statement.executeUpdate(sqlCargarPaises);
            statement.executeUpdate(sqlCargarTiposCocina);

            ResultSet busquedaTiposCocina = statement.executeQuery("SELECT TIPOCOCINA FROM CARGARTIPOSCOCINA");

            while (busquedaTiposCocina.next()) {
                arregloCocina.add(busquedaTiposCocina.getString("TIPOCOCINA").substring(0, 1).toUpperCase() + busquedaTiposCocina.getString("TIPOCOCINA").substring(1));
            }

            ResultSet busquedaNombresPaises = statement.executeQuery("SELECT NOMBRE FROM CARGARPAISES");

            while (busquedaNombresPaises.next()) {
                arregloPaises.add(busquedaNombresPaises.getString("NOMBRE").substring(0, 1).toUpperCase() + busquedaNombresPaises.getString("NOMBRE").substring(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        ObservableList<String> listaCocina = FXCollections.observableArrayList(arregloCocina);
        ObservableList<String> listaPaises = FXCollections.observableArrayList(arregloPaises);

        cuadroSexoNuevoColaborador.getItems().addAll("Hombre", "Mujer");
        cuadroEstablecimiento.getItems().addAll("Restaurante", "Venta de Postres", "Cafetería", "Pastelería", "Bar");
        cuadroRangoPrecio.getItems().addAll("Comida Popular", "Intermedio", "Comida Fina");
        cuadroTipoCocina.setItems(listaCocina);
        cuadroPaisNuevoRestaurante.setItems(listaPaises);
        cuadroRestriccionesDieteticas.getItems().addAll("Vegetarianas", "Veganas", "Sin Gluten");
        cuadroBuenoPara.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        cuadroTiempoComida.getItems().addAll("Desayuno", "Brunch", "Almuerzo", "Cena");
        tiempoComidaMas.getItems().addAll("Desayuno", "Brunch", "Almuerzo", "Cena");
        restriccionesDieteticasMas.getItems().addAll("Vegetarianas", "Veganas", "Sin Gluten");
        buenoParaMas.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        tipoCocinaMas.setItems(listaCocina);
        cuadroPaisNuevoColaborador.setItems(listaPaises);
        cuadroActualizarEstablecimiento.getItems().addAll("Restaurante", "Venta de Postres", "Cafetería", "Pastelería", "Bar");
        cuadroActualizarRangoPrecio.getItems().addAll("Comida Popular", "Intermedio", "Comida Fina");
        cuadroActualizarTiempoComida.getItems().addAll("Desayuno", "Brunch", "Almuerzo", "Cena");
        cuadroActualizarRestriccionesDieteticas.getItems().addAll("Vegetarianas", "Veganas", "Sin Gluten");
        cuadroActualizarTipoCocina.setItems(listaCocina);
        cuadroActualizarPaisRestaurante.setItems(listaPaises);
        cuadroActualizarBuenoPara.getItems().addAll("Reuniones de Negocios", "Grupos", "Niños", "Bar", "Atmósfera Romántica", "Cenas Especiales");
        agregarComentarioClasificacionCliente.getItems().addAll("Familia", "Pareja", "Con Amigos", "Negocios", "Solo");
        agregarComentarioValoracion.getItems().addAll("1", "2", "3", "4", "5");
        agregarComentarioMes.getItems().addAll("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio"
                , "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre");

    }

    public void ventanaError(String errorDado){

        try{
            Stage escenario = new Stage();

            FXMLLoader loader = new FXMLLoader();
            Parent root = loader.load(getClass().getResource("VentanaError.fxml").openStream());
            ControladorVentanaError controladorVentara = loader.getController();
            controladorVentara.labelError.setText(errorDado);
            escenario.setTitle("Error");
            escenario.setScene(new Scene(root, 456, 184));
            escenario.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void loguearUsuario(){

        String usuarioIngresado = cuadroIngresarUsuario.getText();
        String buscarUsuario = "SELECT NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO FROM COLABORADORES WHERE NOMBREUSUARIO=?";
        ResultSet busquedaUsuarioResultado = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(buscarUsuario);
            preparedStatement.setString(1,usuarioIngresado);
            busquedaUsuarioResultado = preparedStatement.executeQuery();
            if(!busquedaUsuarioResultado.next()) {
                colaboradorLogueado.setText("Colaborador no existe");
                correoColaboradorLogueado="";
            }
            else {
                colaboradorLogueado.setText(busquedaUsuarioResultado.getString("NOMBRE") + " " +
                        busquedaUsuarioResultado.getString("APELLIDOPATERNO") + " " + busquedaUsuarioResultado.getString("APELLIDOMATERNO"));
                correoColaboradorLogueado = busquedaUsuarioResultado.getString("CORREO");
                cuadroCorreoLogueado.setText(correoColaboradorLogueado);
            }
        }

        catch(SQLException e){
            e.printStackTrace();
        }


    }

    public void limpiarInformacionColaboradores(){
        cuadroNombreNuevoColaborador.clear();
        cuadroApellidosNuevoColaborador.clear();
        cuadroCorreoNuevoColaborador.clear();
        cuadroUsuarioNuevoColaborador.clear();
        cuadroResidenciaNuevoColaborador.clear();
        cuadroSexoNuevoColaborador.getSelectionModel().clearSelection();
    }

    public void setListaColaboradoresDisponibles(){
        String buscarColaboradores = "SELECT  NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES WHERE CORREO!=?";
        ResultSet busquedaColaboradores = null;
        ArrayList<String> arregloColaboradores = new ArrayList<>();
        ArrayList<String> amigosColaborador = new ArrayList<>();
        ArrayList<String> deQuienAmigosColaborador = new ArrayList<>();

        try{
            if(!correoColaboradorLogueado.equals("")){
            PreparedStatement preparedStatement = connection.prepareStatement(buscarColaboradores);
            preparedStatement.setString(1,correoColaboradorLogueado);
            busquedaColaboradores= preparedStatement.executeQuery();
            while(busquedaColaboradores.next()){
                arregloColaboradores.add(busquedaColaboradores.getString("NOMBRE")+ " " +
                        busquedaColaboradores.getString("APELLIDOPATERNO")+" "
                        +busquedaColaboradores.getString("APELLIDOMATERNO"));
            }
            ObservableList<String> listaColaboradores = FXCollections.observableArrayList(arregloColaboradores);//EL TOTAL



            String buscarAmigos = "SELECT NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES,AMIGOS WHERE" +
                    " CORREO=CORREOAMIGO AND CORREOCOLABORADOR=?";
            PreparedStatement buscarQuienesSonAmigos = connection.prepareStatement(buscarAmigos);
            buscarQuienesSonAmigos.setString(1,correoColaboradorLogueado);
            ResultSet amigosDelColaborador = buscarQuienesSonAmigos.executeQuery();

            while(amigosDelColaborador.next()){
                amigosColaborador.add(amigosDelColaborador.getString("NOMBRE")+ " " +
                        amigosDelColaborador.getString("APELLIDOPATERNO")+" "+
                        amigosDelColaborador.getString("APELLIDOMATERNO"));
            }

            String buscarquienEsAmigoColaborador = "SELECT NOMBRE, APELLIDOPATERNO, APELLIDOMATERNO FROM COLABORADORES,AMIGOS WHERE" +
                    " CORREO=CORREOCOLABORADOR AND CORREOAMIGO=?";
            PreparedStatement buscarQuienAmigoColaborador = connection.prepareStatement(buscarquienEsAmigoColaborador);
            buscarQuienAmigoColaborador.setString(1,correoColaboradorLogueado);
            ResultSet quienAmigoColaborador = buscarQuienAmigoColaborador.executeQuery();

            while(quienAmigoColaborador.next()){
                deQuienAmigosColaborador.add(quienAmigoColaborador.getString("NOMBRE")+ " " +
                        quienAmigoColaborador.getString("APELLIDOPATERNO")+" "+
                        quienAmigoColaborador.getString("APELLIDOMATERNO"));
            }

            //cuadroEnviarSolicitudColaboradores.setItems(listaColaboradores);

                for (String s : amigosColaborador) {
                    if(listaColaboradores.contains(s))
                        listaColaboradores.remove(s);
                }
                for (String s : deQuienAmigosColaborador) {
                    if(listaColaboradores.contains(s))
                        listaColaboradores.remove(s);
                }
                cuadroEnviarSolicitudColaboradores.setItems(listaColaboradores);

            }
            else{
                cuadroCorreoLogueado.clear();
                cuadroCorreoAmigo.clear();
                cuadroEnviarSolicitudColaboradores.getItems().removeAll(cuadroEnviarSolicitudColaboradores.getItems());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void enviarSolicitud(){
        String correoEmisor = cuadroCorreoLogueado.getText();
        String correoReceptor = cuadroCorreoAmigo.getText();
        String insercionSolicitud ="INSERT INTO SOLICITUDESAMISTAD" +
                "(CORREOEMISOR,CORREORECEPTOR)" + " VALUES(?,?)";

        if(correoEmisor.equals("")||correoReceptor.equals("")){
            ventanaError("Se deben proveer los dos correos");
        }
        else{
            try{
                String buscarSolicitudYaEnviada = "SELECT CORREOEMISOR,CORREORECEPTOR FROM SOLICITUDESAMISTAD WHERE CORREOEMISOR=? AND CORREORECEPTOR=?";
                PreparedStatement statementPreparado= connection.prepareStatement(buscarSolicitudYaEnviada);
                statementPreparado.setString(1,correoReceptor);
                statementPreparado.setString(2,correoEmisor);
                ResultSet existeSolicitud = statementPreparado.executeQuery();

                String buscarPorSerRepetido = "SELECT CORREOCOLABORADOR,CORREOAMIGO FROM AMIGOS WHERE CORREOCOLABORADOR =? AND CORREOAMIGO=?";
                PreparedStatement statementLadoAmigo = connection.prepareStatement(buscarPorSerRepetido);//ESTO POR SI EXISTIERA UN NOMBRE REPETIDO
                statementLadoAmigo.setString(1,correoEmisor);
                statementLadoAmigo.setString(2,correoReceptor);
                ResultSet unLadoAmigo = statementLadoAmigo.executeQuery();

                PreparedStatement statementOtroLadoAmigo = connection.prepareStatement(buscarPorSerRepetido);
                statementOtroLadoAmigo.setString(1,correoReceptor);
                statementOtroLadoAmigo.setString(2,correoEmisor);
                ResultSet otroLadoAmigo = statementOtroLadoAmigo.executeQuery();

                if(!existeSolicitud.next() & !unLadoAmigo.next()& !otroLadoAmigo.next()) {
                    PreparedStatement preparedStatement = connection.prepareStatement(insercionSolicitud);
                    preparedStatement.setString(1, correoEmisor);
                    preparedStatement.setString(2, correoReceptor);
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                }
                else
                    ventanaError("Ya tiene una solicitud de amistad pendiente");
            }catch(SQLException e){
                ventanaError("Ya se ha enviado la solicitud de amistad");
            }
        }
    }

    public void configurarColumnasTablas(){
        columnaNombreSolicitud.setCellValueFactory(new PropertyValueFactory<SolicitudAmistad,String>("nombre"));
        columnaCorreoSolicitud.setCellValueFactory(new PropertyValueFactory<SolicitudAmistad,String>("correo"));
    }

    public void refrescarSolicitudesAmistad(){
        String buscarSolicitudes = "SELECT NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO  FROM COLABORADORES,SOLICITUDESAMISTAD WHERE CORREO=CORREOEMISOR " +
                "AND CORREORECEPTOR=?";
        ResultSet busquedaSolicitidudes =null;
        ArrayList<SolicitudAmistad> arregloSolicitudes = new ArrayList<>();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(buscarSolicitudes);
            preparedStatement.setString(1,correoColaboradorLogueado);
            busquedaSolicitidudes = preparedStatement.executeQuery();

            while(busquedaSolicitidudes.next()){
                String nombre = busquedaSolicitidudes.getString("NOMBRE")+" "+
                        busquedaSolicitidudes.getString("APELLIDOPATERNO")+" "+
                        busquedaSolicitidudes.getString("APELLIDOMATERNO");
                String correo = busquedaSolicitidudes.getString("CORREO");
                arregloSolicitudes.add(new SolicitudAmistad(nombre,correo));
            }
            ObservableList<SolicitudAmistad> informacionSolicitudes = FXCollections.observableArrayList(arregloSolicitudes);
            tablaSolicitudesAmistad.setItems(informacionSolicitudes);

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void aceptarRechazarSolicitud(boolean aceptado){
        SolicitudAmistad solicitudSeleccionada = (SolicitudAmistad) tablaSolicitudesAmistad.getSelectionModel().getSelectedItem();
        String agregarAmigo ="INSERT INTO AMIGOS"+"(CORREOCOLABORADOR,CORREOAMIGO,ACEPTADO)"+"VALUES(?,?,?)";
        if(aceptado){
            try{
                PreparedStatement insertarAmigo = connection.prepareStatement(agregarAmigo);
                insertarAmigo.setString(1,correoColaboradorLogueado);
                insertarAmigo.setString(2,solicitudSeleccionada.getCorreo());
                insertarAmigo.setString(3,"SI");

                insertarAmigo.executeUpdate();

            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        else{
            try {
                PreparedStatement rechazarAmigo = connection.prepareStatement(agregarAmigo);
                rechazarAmigo.setString(1, correoColaboradorLogueado);
                rechazarAmigo.setString(2, solicitudSeleccionada.getCorreo());
                rechazarAmigo.setString(3, "NO");

                rechazarAmigo.executeUpdate();

            }catch(SQLException e){
                e.printStackTrace();
            }
        }

        try{
            String eliminarSolicitudesAmistad = "DELETE FROM SOLICITUDESAMISTAD WHERE CORREOEMISOR = ? AND CORREORECEPTOR =?";
            PreparedStatement preparedStatement = connection.prepareStatement(eliminarSolicitudesAmistad);
            preparedStatement.setString(1,solicitudSeleccionada.getCorreo());
            preparedStatement.setString(2,correoColaboradorLogueado);
            preparedStatement.executeUpdate();

        }catch(SQLException e){
            e.printStackTrace();
        }


    }

    public void agregarRestaurante(){
        String nombreRestaurante = cuadroNombreNuevoRestaurante.getText();
        Object paisRestaurante = cuadroPaisNuevoRestaurante.getSelectionModel().getSelectedItem().toString();
       // String ciudadRestaurante = cuadroCiudadNuevoRestaurante.getSelectionModel().getSelectedItem().toString();
        String descripcionRestaurante = cuadroDescripcionNuevoRestaurante.getText();
        String instruccionesRestaurante = cuadroInstruccionesNuevoRestaurante.getText();
        String direccionRestaurante = cuadroDireccionNuevoRestaurante.getText();
        Object tipoEstablecimiento = cuadroEstablecimiento.getSelectionModel().getSelectedItem().toString();
        Object rangoPrecio = cuadroRangoPrecio.getSelectionModel().getSelectedItem().toString();
        Object tipoCocina = cuadroTipoCocina.getSelectionModel().getSelectedItem().toString();
        Object tiempoComida = cuadroTiempoComida.getSelectionModel().getSelectedItem().toString();
        Object restriccionesDieteticas = cuadroRestriccionesDieteticas.getSelectionModel().getSelectedItem().toString();
        Object buenoPara = cuadroBuenoPara.getSelectionModel().getSelectedItem().toString();

        if(nombreRestaurante.equals("")|| paisRestaurante ==null || descripcionRestaurante.equals("") || instruccionesRestaurante.equals("")
                || direccionRestaurante.equals("") || tipoEstablecimiento==null||rangoPrecio ==null || tipoCocina ==null  || tiempoComida==null
                || restriccionesDieteticas==null ||buenoPara ==null){
            ventanaError("Se deben ingresar todos los datos del restaurante");
        }
        else{
            try {

                //*****************************************************************************************
                String buscarCodigoDelPais = "SELECT ISO3 FROM CARGARPAISES  WHERE NOMBRE = ?";

                PreparedStatement buscarPaisCodigo = connection.prepareStatement(buscarCodigoDelPais);

                buscarPaisCodigo.setString(1,paisRestaurante.toString());

                ResultSet paisEncontrado = buscarPaisCodigo.executeQuery();

                String nombreIso ="";

                while(paisEncontrado.next()){
                    nombreIso=paisEncontrado.getString("ISO3");
                }

                String insertarEnPais = "INSERT INTO PAISES (CODIGO,NOMBRE) VALUES (?,?)";
                PreparedStatement insercionPais = connection.prepareStatement(insertarEnPais);
                insercionPais.setString(1,nombreIso);
                insercionPais.setString(2,paisRestaurante.toString());
                insercionPais.executeUpdate();
                //********************************************************************************************
                String insertarEnRestaurantes = "INSERT INTO RESTAURANTES (ID,NOMBRE,DESCRIPCION.DIRECCION,INSTRUCCIONES,IDCIUDAD,CODIGOPAIS,IDCARACTERISTICAS)" +
                        "VALUES (?,?,?,?,?,?,?,?)";
                //*************************************************************************************************************
                String insertarEnCaracteristicas = "INSERT INTO CARACTERISTICAS (ID,TIPOESTABLECIMIENTO,RANGOPRECIO)" +
                        "VALUES (?,?,?)";

                int cuantasCaracteristicas = 0;

                String cantidadCaracteristicas = "SELECT COUNT(*) FROM CARACTERISTICAS";

                PreparedStatement contarTuplesCaracteristicas = connection.prepareStatement(cantidadCaracteristicas);
                ResultSet cantCaracteristicas = contarTuplesCaracteristicas.executeQuery();
                while(cantCaracteristicas.next()){
                    cuantasCaracteristicas=cantCaracteristicas.getInt(1); //Cuantas caracteristicas hay
                }

                PreparedStatement insercionCaracteristica = connection.prepareStatement(insertarEnCaracteristicas);
                insercionCaracteristica.setString(1,cuantasCaracteristicas+1+"");
                insercionCaracteristica.setString(2,tipoEstablecimiento.toString());
                insercionCaracteristica.setString(3,rangoPrecio.toString());
                //**************************************************************************************************************

                // TODO INSERTAR EN CIUDADES, FALTA PARSEAR LA CIUDAD ETC ...

                //***************************************************************************************************************

            }catch(SQLException e){
                e.printStackTrace();
            }


        }
    }

}
