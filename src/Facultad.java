import java.util.LinkedList;

public class Facultad implements Informacion{

    String nombre;
    LinkedList<Carrera> coleccionCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<Carrera>();
    }

    public void agregarCarrera(Carrera carreraNueva) {
        coleccionCarrera.add(carreraNueva);
    }

    public void eliminarCarrera(String nombreCarrera) {
        boolean bandera = false;
        for (Carrera carrera : coleccionCarrera) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                coleccionCarrera.remove(carrera);
                bandera = true;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontro la carrera a eliminar");
        }else{System.out.println("No se encontro la carrera a eliminar");}
    }

    @Override
    public String listarContenido() {
        return null;
    }

    @Override
    public int verCantidad() {
        return coleccionCarrera.size();
    }
}
