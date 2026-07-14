
package Modelo;

public class LicenciaSoftware extends Activo{
    private String software;
    private String fechaExpiracion;
    private int numLicencias;

    public LicenciaSoftware(String software, String fechaExpiracion, int numLicencias, String codigo, String nombre, String marca, String modelo, String fechaCompra, String estado, double valorCompra) {
        super(codigo, nombre, marca, modelo, fechaCompra, estado, valorCompra);
        this.software = software;
        this.fechaExpiracion = fechaExpiracion;
        this.numLicencias = numLicencias;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getNumLicencias() {
        return numLicencias;
    }

    public void setNumLicencias(int numLicencias) {
        this.numLicencias = numLicencias;
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return 0;
    }
}
