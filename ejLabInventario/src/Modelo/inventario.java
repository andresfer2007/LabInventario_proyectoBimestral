
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
    
    public void agragaActivo(Activo nuevo){//tipo un activo
        Activos.add(nuevo);//agrega el activo
    }
    public void eliminarActivo(Activo actual){
        Activos.remove(actual);
        
    }
    public Activo buscarActivo(String codigo){
        for(Activo activo : Activos){//recorre lista hasta el final

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
        for(Activo activo : Activos){
            activo.mostrarInformacion();
            System.out.println("");
        }
    }
    public double calcularCostoTotal(){
        double total =0;
        for(Activo activo : Activos){//recorre la lista
            total += activo.calcularCostoMantenimiento();//llama cada funcion con polimorfismo
        }
        return total;
    }
    
}
