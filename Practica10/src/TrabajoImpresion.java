package practica10;

public class TrabajoImpresion {

    private String usuario;
    private String documento;

    public TrabajoImpresion(String usuario, String documento) {
        this.usuario = usuario;
        this.documento = documento;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return usuario + " envio: " + documento;
    }
}