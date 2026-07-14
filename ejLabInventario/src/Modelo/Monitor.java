
package Modelo;


public class Monitor extends Activo {
    private double tamanio;
    private String resolucion;

    public Monitor(double tamanio, String resolucion, String codigo, String nombre, String marca, String modelo, String fechaCompra, String estado, double valorCompra) {
        super(codigo, nombre, marca, modelo, fechaCompra, estado, valorCompra);
        this.tamanio = tamanio;
        this.resolucion = resolucion;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return 0;
    }
}
