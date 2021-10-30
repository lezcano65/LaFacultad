public class Profesor extends Persona{
    double basico;
    int antiguedad;

<<<<<<< HEAD
=======
    public Profesor(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

>>>>>>> c4b88d0 (Initial commit)
    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return super.toString();
    }
>>>>>>> c4b88d0 (Initial commit)
}
