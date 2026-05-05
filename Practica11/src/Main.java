package practica11;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    private ObservableList<Producto> productos;

    private TableView<Producto> tabla;

    private CampoTextoValidado txtCodigo;
    private CampoTextoValidado txtNombre;
    private CampoTextoValidado txtCategoria;
    private CampoTextoValidado txtPrecio;
    private CampoTextoValidado txtStock;
    private CampoTextoValidado txtBuscar;

    private Producto productoSeleccionado;

    @Override
    public void start(Stage stage) {

        productos = FXCollections.observableArrayList();

        cargarDatos();

        BorderPane root = new BorderPane();

        root.setTop(crearMenu());
        root.setCenter(crearTabla());
        root.setRight(crearFormulario());

        Scene scene = new Scene(root, 900, 500);

        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        stage.setTitle("Practica 11 - JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    private MenuBar crearMenu() {
        MenuBar menuBar = new MenuBar();

        Menu menuArchivo = new Menu("Archivo");
        MenuItem salir = new MenuItem("Salir");

        salir.setOnAction(e -> mostrarDialogo("Salir", "Se cerrara la aplicacion."));

        menuArchivo.getItems().add(salir);

        Menu menuAyuda = new Menu("Ayuda");
        MenuItem acerca = new MenuItem("Acerca de");

        acerca.setOnAction(e -> mostrarDialogo("Acerca de", "Sistema simple de productos con JavaFX."));

        menuAyuda.getItems().add(acerca);

        menuBar.getMenus().addAll(menuArchivo, menuAyuda);

        return menuBar;
    }

    private BorderPane crearTabla() {
        BorderPane panel = new BorderPane();
        panel.setPadding(new Insets(10));

        txtBuscar = new CampoTextoValidado("Buscar por nombre o categoria");

        TableColumn<Producto, String> colCodigo = new TableColumn<>("Codigo");
        colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));

        TableColumn<Producto, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Producto, String> colCategoria = new TableColumn<>("Categoria");
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));

        TableColumn<Producto, Double> colPrecio = new TableColumn<>("Precio");
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        TableColumn<Producto, Integer> colStock = new TableColumn<>("Stock");
        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));

        tabla = new TableView<>();
        tabla.getColumns().addAll(colCodigo, colNombre, colCategoria, colPrecio, colStock);

        FilteredList<Producto> filtrados = new FilteredList<>(productos, p -> true);

        txtBuscar.textProperty().addListener((obs, viejo, nuevo) -> {
            filtrados.setPredicate(producto -> {
                if (nuevo == null || nuevo.isEmpty()) {
                    return true;
                }

                String filtro = nuevo.toLowerCase();

                return producto.getNombre().toLowerCase().contains(filtro)
                        || producto.getCategoria().toLowerCase().contains(filtro);
            });
        });

        SortedList<Producto> ordenados = new SortedList<>(filtrados);
        ordenados.comparatorProperty().bind(tabla.comparatorProperty());

        tabla.setItems(ordenados);

        tabla.setOnMouseClicked((MouseEvent e) -> {
            productoSeleccionado = tabla.getSelectionModel().getSelectedItem();

            if (productoSeleccionado != null) {
                txtCodigo.setText(productoSeleccionado.getCodigo());
                txtNombre.setText(productoSeleccionado.getNombre());
                txtCategoria.setText(productoSeleccionado.getCategoria());
                txtPrecio.setText(String.valueOf(productoSeleccionado.getPrecio()));
                txtStock.setText(String.valueOf(productoSeleccionado.getStock()));
            }
        });

        panel.setTop(txtBuscar);
        panel.setCenter(tabla);

        return panel;
    }

    private GridPane crearFormulario() {
        GridPane panel = new GridPane();
        panel.setPadding(new Insets(15));
        panel.setVgap(8);
        panel.setHgap(8);

        txtCodigo = new CampoTextoValidado("Codigo");
        txtNombre = new CampoTextoValidado("Nombre");
        txtCategoria = new CampoTextoValidado("Categoria");
        txtPrecio = new CampoTextoValidado("Precio");
        txtStock = new CampoTextoValidado("Stock");

        BotonPrincipal btnAgregar = new BotonPrincipal("Agregar");
        BotonPrincipal btnActualizar = new BotonPrincipal("Actualizar");
        BotonPrincipal btnEliminar = new BotonPrincipal("Eliminar");
        BotonPrincipal btnLimpiar = new BotonPrincipal("Limpiar");

        txtNombre.addEventFilter(KeyEvent.KEY_RELEASED, e -> validarTiempoReal());

        btnAgregar.setOnAction(e -> agregarProducto());
        btnActualizar.setOnAction(e -> actualizarProducto());
        btnEliminar.setOnAction(e -> eliminarProducto());
        btnLimpiar.setOnAction(e -> limpiarCampos());

        panel.add(new Label("Formulario"), 0, 0);
        panel.add(txtCodigo, 0, 1);
        panel.add(txtNombre, 0, 2);
        panel.add(txtCategoria, 0, 3);
        panel.add(txtPrecio, 0, 4);
        panel.add(txtStock, 0, 5);

        HBox botones1 = new HBox(5, btnAgregar, btnActualizar);
        HBox botones2 = new HBox(5, btnEliminar, btnLimpiar);

        panel.add(botones1, 0, 6);
        panel.add(botones2, 0, 7);

        return panel;
    }

    private void agregarProducto() {
        if (!validarFormulario()) {
            mostrarDialogo("Error", "Revisa los datos del formulario.");
            return;
        }

        Producto p = new Producto(
                txtCodigo.getText(),
                txtNombre.getText(),
                txtCategoria.getText(),
                Double.parseDouble(txtPrecio.getText()),
                Integer.parseInt(txtStock.getText())
        );

        productos.add(p);
        limpiarCampos();
    }

    private void actualizarProducto() {
        if (productoSeleccionado == null) {
            mostrarDialogo("Aviso", "Selecciona un producto primero.");
            return;
        }

        if (!validarFormulario()) {
            mostrarDialogo("Error", "Revisa los datos.");
            return;
        }

        productoSeleccionado.setCodigo(txtCodigo.getText());
        productoSeleccionado.setNombre(txtNombre.getText());
        productoSeleccionado.setCategoria(txtCategoria.getText());
        productoSeleccionado.setPrecio(Double.parseDouble(txtPrecio.getText()));
        productoSeleccionado.setStock(Integer.parseInt(txtStock.getText()));

        tabla.refresh();
        limpiarCampos();
    }

    private void eliminarProducto() {
        if (productoSeleccionado != null) {
            productos.remove(productoSeleccionado);
            limpiarCampos();
        } else {
            mostrarDialogo("Aviso", "Selecciona un producto para eliminar.");
        }
    }

    private boolean validarFormulario() {
        boolean valido = true;

        txtCodigo.marcarError(txtCodigo.estaVacio());
        txtNombre.marcarError(txtNombre.estaVacio());
        txtCategoria.marcarError(txtCategoria.estaVacio());

        if (txtCodigo.estaVacio() || txtNombre.estaVacio() || txtCategoria.estaVacio()) {
            valido = false;
        }

        try {
            double precio = Double.parseDouble(txtPrecio.getText());
            txtPrecio.marcarError(precio <= 0);
            if (precio <= 0) {
                valido = false;
            }
        } catch (Exception e) {
            txtPrecio.marcarError(true);
            valido = false;
        }

        try {
            int stock = Integer.parseInt(txtStock.getText());
            txtStock.marcarError(stock < 0);
            if (stock < 0) {
                valido = false;
            }
        } catch (Exception e) {
            txtStock.marcarError(true);
            valido = false;
        }

        return valido;
    }

    private void validarTiempoReal() {
        txtNombre.marcarError(txtNombre.estaVacio());
    }

    private void limpiarCampos() {
        txtCodigo.clear();
        txtNombre.clear();
        txtCategoria.clear();
        txtPrecio.clear();
        txtStock.clear();
        productoSeleccionado = null;
    }

    private void mostrarDialogo(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private void cargarDatos() {
        productos.add(new Producto("P001", "Audifonos", "Electronica", 800, 5));
        productos.add(new Producto("P002", "Mouse", "Electronica", 250, 10));
        productos.add(new Producto("P003", "Teclado", "Electronica", 600, 8));
        productos.add(new Producto("P004", "Mochila", "Escolar", 500, 12));
    }

    public static void main(String[] args) {
        launch(args);
    }
}