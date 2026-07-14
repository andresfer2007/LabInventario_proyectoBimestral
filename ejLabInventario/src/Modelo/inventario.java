
package Modelo;
import java.util.ArrayList;

public class inventario {
    private ArrayList<Activo> Activos; 

    public inventario() {
        this.Activos = new ArrayList<>();
    }

    public ArrayList<Activo> getActivos() {
        return Activos;
    }

    public void setActivos(ArrayList<Activo> Activos) {
        this.Activos = Activos;
    }
    
    public void agragaActivo(Activo nuevo){
        Activos.add(nuevo);
    }
    public void eliminarActivo(Activo actual){
        Activos.remove(actual);
    }
    public Activo buscarActivo(String codigo){

        for(Activo activo : Activos){

            if(activo.getCodigo().equals(codigo)){
                return activo;
            }

        }

        return null;
    }        
    
    public void modificarActivo(String codigo, String nuevoEstado){
        Activo activo = buscarActivo(codigo);

        if(activo != null){

            activo.setEstado(nuevoEstado);
            

        }
    }
    public void listarActivos(){
        for(Activo activo: Activos){
            activo.mostrarInformacion();
        }
    }
    public double calcularCostoTotal(){
        double total=0;
        for(Activo activo: Activos){
            total+= activo.calcularCostoMantenimiento();
        }
        return total;
    }
    
}
