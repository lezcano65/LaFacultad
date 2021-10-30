public class Profesor extends Persona{
    double basico;
    int antiguedad;

    public Profesor(String nombre, String Apellido, int legajo,double bas,int antig) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
        this.basico = bas;
        this.antiguedad = antig;
    }

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

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                ", sueldo basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
