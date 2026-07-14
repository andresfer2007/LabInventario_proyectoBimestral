
package Modelo;

public class computadora extends Activo{
    private String procesador;
    private int memoriaRam;
    private int almacenamiento;

    public computadora(String procesador, int memoriaRam, int almacenamiento, String codigo, String nombre, String marca, String modelo, String fechaCompra, String estado, double valorCompra) {
        super(codigo, nombre, marca, modelo, fechaCompra, estado, valorCompra);
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return valorCompra * 0.08;
    }
}
