package practica11;

import javafx.scene.control.TextField;

public class CampoTextoValidado extends TextField {

    public CampoTextoValidado(String texto) {
        setPromptText(texto);
        getStyleClass().add("campo-validado");
    }

    public boolean estaVacio() {
        return getText().trim().isEmpty();
    }

    public void marcarError(boolean error) {
        if (error) {
            setStyle("-fx-border-color: red;");
        } else {
            setStyle("");
        }
    }
}