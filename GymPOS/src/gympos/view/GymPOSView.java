package gympos.view;

import gympos.controller.GymController;
import gympos.model.Cliente;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class GymPOSView extends Application {

    private GymController controller;
    private ObservableList<Cliente> listaClientes;
    private TableView<Cliente> tabla;

    private TextField txtId;
    private TextField txtNombre;
    private TextField txtTelefono;
    private TextField txtCorreo;

    @Override
    public void start(Stage stage) {
        controller = new GymController();
        controller.cargarDatosIniciales();

        listaClientes = FXCollections.observableArrayList(controller.obtenerClientes());

        BorderPane root = new BorderPane();

        root.setTop(crearMenu());
        root.setCenter(crearTabla());
        root.setRight(crearFormulario());

        Scene scene = new Scene(root, 850, 450);

        stage.setTitle("GymPOS - Clientes");
        stage.setScene(scene);
        stage.show();
    }

    private MenuBar crearMenu() {
        MenuBar menuBar = new MenuBar();

        Menu menuArchivo = new Menu("Archivo");
        MenuItem salir = new MenuItem("Salir");

        salir.setOnAction(e -> {
            mostrarMensaje("Salida", "Cerrando sistema GymPOS.");
        });

        menuArchivo.getItems().add(salir);

        Menu menuAyuda = new Menu("Ayuda");
        MenuItem acerca = new MenuItem("Acerca de");

        acerca.setOnAction(e -> {
            mostrarMensaje("Acerca de", "Sistema GymPOS para control basico de clientes.");
        });

        menuAyuda.getItems().add(acerca);

        menuBar.getMenus().addAll(menuArchivo, menuAyuda);

        return menuBar;
    }

    private TableView<Cliente> crearTabla() {
        tabla = new TableView<>();

        TableColumn<Cliente, String> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Cliente, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Cliente, String> colTelefono = new TableColumn<>("Telefono");
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        TableColumn<Cliente, String> colCorreo = new TableColumn<>("Correo");
        colCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));

        TableColumn<Cliente, Integer> colPuntos = new TableColumn<>("Puntos");
        colPuntos.setCellValueFactory(new PropertyValueFactory<>("puntos"));

        tabla.getColumns().addAll(colId, colNombre, colTelefono, colCorreo, colPuntos);
        tabla.setItems(listaClientes);

        tabla.setOnMouseClicked(e -> {
            Cliente seleccionado = tabla.getSelectionModel().getSelectedItem();

            if (seleccionado != null) {
                txtId.setText(seleccionado.getId());
                txtNombre.setText(seleccionado.getNombre());
                txtTelefono.setText(seleccionado.getTelefono());
                txtCorreo.setText(seleccionado.getCorreo());
            }
        });

        return tabla;
    }

    private GridPane crearFormulario() {
        GridPane panel = new GridPane();

        panel.setPadding(new Insets(15));
        panel.setVgap(8);
        panel.setHgap(8);

        txtId = new TextField();
        txtNombre = new TextField();
        txtTelefono = new TextField();
        txtCorreo = new TextField();

        txtId.setPromptText("ID");
        txtNombre.setPromptText("Nombre");
        txtTelefono.setPromptText("Telefono");
        txtCorreo.setPromptText("Correo");

        Button btnAgregar = new Button("Agregar");
        Button btnActualizar = new Button("Actualizar");
        Button btnEliminar = new Button("Eliminar");
        Button btnLimpiar = new Button("Limpiar");

        btnAgregar.setOnAction(e -> agregarCliente());
        btnActualizar.setOnAction(e -> actualizarCliente());
        btnEliminar.setOnAction(e -> eliminarCliente());
        btnLimpiar.setOnAction(e -> limpiarCampos());

        panel.add(new Label("Formulario Cliente"), 0, 0);
        panel.add(txtId, 0, 1);
        panel.add(txtNombre, 0, 2);
        panel.add(txtTelefono, 0, 3);
        panel.add(txtCorreo, 0, 4);

        HBox botones1 = new HBox(5, btnAgregar, btnActualizar);
        HBox botones2 = new HBox(5, btnEliminar, btnLimpiar);

        panel.add(botones1, 0, 5);
        panel.add(botones2, 0, 6);

        return panel;
    }

    private void agregarCliente() {
        if (!validarCampos()) {
            mostrarMensaje("Error", "Llena todos los campos.");
            return;
        }

        controller.agregarCliente(
                txtId.getText(),
                txtNombre.getText(),
                txtTelefono.getText(),
                txtCorreo.getText()
        );

        actualizarTabla();
        limpiarCampos();
    }

    private void actualizarCliente() {
        if (!validarCampos()) {
            mostrarMensaje("Error", "Llena todos los campos.");
            return;
        }

        controller.actualizarCliente(
                txtId.getText(),
                txtNombre.getText(),
                txtTelefono.getText(),
                txtCorreo.getText()
        );

        actualizarTabla();
        limpiarCampos();
    }

    private void eliminarCliente() {
        String id = txtId.getText();

        if (id.trim().isEmpty()) {
            mostrarMensaje("Error", "Escribe o selecciona un ID.");
            return;
        }

        controller.eliminarCliente(id);
        actualizarTabla();
        limpiarCampos();
    }

    private void actualizarTabla() {
        listaClientes.setAll(controller.obtenerClientes());
        tabla.refresh();
    }

    private void limpiarCampos() {
        txtId.clear();
        txtNombre.clear();
        txtTelefono.clear();
        txtCorreo.clear();
    }

    private boolean validarCampos() {
        return !txtId.getText().trim().isEmpty()
                && !txtNombre.getText().trim().isEmpty()
                && !txtTelefono.getText().trim().isEmpty()
                && !txtCorreo.getText().trim().isEmpty();
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}