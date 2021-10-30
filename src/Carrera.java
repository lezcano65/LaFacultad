import java.util.LinkedList;

public class Carrera implements Informacion{
    String nombre;
    LinkedList<Materia> coleccionMaterias;

    public void agregarMateria(Materia materia){
        coleccionMaterias.add(materia);
    }

    public void eliminarCarrera(String nombreMateria) {
        boolean bandera = false;
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombreMateria)) {
                coleccionMaterias.remove(materia);
                bandera = true;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontró la materia a eliminar");
        }else{System.out.println("No se encontró la materia a eliminar");}
    }

    public void encontrarCarrera(String nombreMateria) {
        boolean bandera = false;
        for (Materia materia : coleccionMaterias) {
            if (materia.getNombre().equals(nombreMateria)) {
                bandera = true;
                break;
            }
        }
        if (bandera){
            System.out.println("Se encontró la materia a eliminar");
        }else{System.out.println("No se encontró la materia a eliminar");}
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera(String nombre, LinkedList<Materia> coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public LinkedList<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(LinkedList<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }


    @Override
    public String listarContenido() {
        return null;
    }

    @Override
    public int verCantidad() {
        return coleccionMaterias.size();
    }
}
