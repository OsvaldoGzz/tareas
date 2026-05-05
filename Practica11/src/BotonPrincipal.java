package practica11;

import javafx.scene.control.Button;

public class BotonPrincipal extends Button {

    public BotonPrincipal(String texto) {
        super(texto);
        getStyleClass().add("boton-principal");
        setPrefWidth(120);
    }
}