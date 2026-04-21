package practica03;

public class Producto {

    private String nombre;
    private String codigo;
    private double precio;
    private int stock;
    private String categoria;

    public Producto() {
        nombre = "Sin nombre";
        codigo = "ABC123";
        precio = 100;
        stock = 1;
        categoria = "General";
    }

    public Producto(String nombre, String codigo, double precio, int stock, String categoria) {
        setNombre(nombre);
        setCodigo(codigo);
        setPrecio(precio);
        setStock(stock);
        setCategoria(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio debe tener algo.");
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && codigo.matches("[A-Z]{3}[0-9]{3}")) {
            this.codigo = codigo;
        } else {
            System.out.println("Error: el codigo debe tener 3 letras mayusculas y 3 numeros");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0 && precio <= 10000) {
            this.precio = precio;
        } else {
            System.out.println("Error: el precio debe ser mayor que 0 y menor o igual a 10000.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: el stock no puede ser negativo.");
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty()) {
            this.categoria = categoria;
        } else {
            System.out.println("Error: la categoria no puede estar vacia.");
        }
    }

    @Override
    public String toString() {
        return "Producto{" +"nombre='" + nombre + '\'' + ", codigo='" + codigo + '\'' + ", precio=" + precio +
                ", stock=" + stock +", categoria='" + categoria + '\'' +'}';
    }
}