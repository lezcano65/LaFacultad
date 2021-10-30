public class Main {
    public static void main(String[] args) {
        //probando
        Facultad facultad = new Facultad("UTN-FRR");
        facultad.agregarCarrera(new Carrera("ISI"));
        facultad.agregarCarrera(new Carrera("TUP"));
        facultad.agregarCarrera(new Carrera("IQ"));
        facultad.listarContenido();
        facultad.eliminarCarrera("IQ");
        facultad.listarContenido();



    }
}
