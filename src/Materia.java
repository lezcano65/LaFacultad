import java.util.LinkedList;
import java.util.function.UnaryOperator;

public class Materia extends LinkedList<Materia> implements Informacion{

    String nombre;
    Profesor titular;
    LinkedList<Estudiante> coleccionEstudiantes;

    public void agregarEstudiante (Estudiante nuevo){
        this.coleccionEstudiantes.add(nuevo);
    }

    public void eliminarEstudiante(int legajo){
        boolean bandera = false;
        for(Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                bandera = true;
            }
        }
        if (bandera){
            System.out.println("El estudiante a sido borrado");
        }else System.out.println("No se encontre el estudiante con legajo: "+legajo);

    }

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public void modificarTitular(Profesor titular) {
        this.titular = titular;
    }

    public LinkedList<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(LinkedList<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }


    @Override
    public String listarContenido() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }

    @Override
    public int verCantidad() {
        return coleccionEstudiantes.size();
    }

    @Override
    public void replaceAll(UnaryOperator<Materia> operator) {
        super.replaceAll(operator);
    }
}
