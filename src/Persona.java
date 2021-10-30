public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int legajo;

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void modificarDatos (int lega,String nom,String ape){
        this.apellido = ape;
        this.nombre = nom;
        this.legajo = lega;
    }

}