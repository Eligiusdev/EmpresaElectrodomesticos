package EmpresaElectrodomesticos;

public class Articulo {
    private String referencia;
    private String marca;
    private double precio;
    private int cantidad;
    private String nombreUsuario;
    private String cedulaUsuario;

    public Articulo(String referencia, String marca, double precio, int cantidad, String nombreUsuario, String cedulaUsuario) {
        this.referencia = referencia;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombreUsuario = nombreUsuario;
        this.cedulaUsuario = cedulaUsuario;
    }

    // Getters y Setters
    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getNombreUsuario() { return nombreUsuario; }
    public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }

    public String getCedulaUsuario() { return cedulaUsuario; }
    public void setCedulaUsuario(String cedulaUsuario) { this.cedulaUsuario = cedulaUsuario; }

    @Override
    public String toString() {
        return "Referencia: " + referencia + ", Marca: " + marca + ", Precio: $" + precio + ", Cantidad: " + cantidad + ", Usuario: " + nombreUsuario + " (" + cedulaUsuario + ")";
    }
}