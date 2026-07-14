
package Modelo;

public abstract class Activo {
    protected String codigo;
    protected String nombre;
    protected String marca;
    protected String modelo;
    protected String fechaCompra;
    protected String estado;
    protected double valorCompra;

    public Activo(String codigo, String nombre, String marca, String modelo, String fechaCompra, String estado, double valorCompra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.estado = estado;
        this.valorCompra = valorCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    
    
    public void mostrarInformacion(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Estado: " + estado);
        System.out.println("Valor de compra: $" + valorCompra);
    }
    public abstract double calcularCostoMantenimiento();
}
