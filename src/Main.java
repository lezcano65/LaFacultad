public class Main {
    public static void main(String[] args) {
        //probando
        Profesor profe = new Profesor("facundo","uferer",12345,10,2);
        Materia materia1 = new Materia("Programacion 2",profe);
        Facultad facultad = new Facultad("UTN-FRR");
        facultad.agregarCarrera(new Carrera("ISI",materia1));
        facultad.agregarCarrera(new Carrera("TUP"));
        facultad.agregarCarrera(new Carrera("IQ",materia1));
        System.out.println(facultad.listarContenido());
        facultad.eliminarCarrera("IQ");
        System.out.println(facultad.listarContenido());

    }
}
