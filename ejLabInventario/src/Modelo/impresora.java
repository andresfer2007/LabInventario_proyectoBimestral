package Modelo;

public class impresora extends Activo{
    private String tipo;
    private int numCartuchos;

    public impresora(String tipo, int numCartuchos, String codigo, String nombre, String marca, String modelo, String fechaCompra, String estado, double valorCompra) {
        super(codigo, nombre, marca, modelo, fechaCompra, estado, valorCompra);
        this.tipo = tipo;
        this.numCartuchos = numCartuchos;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumCartuchos() {
        return numCartuchos;
    }

    public void setNumCartuchos(int numCartuchos) {
        this.numCartuchos = numCartuchos;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 0;
    }
    
    
}
