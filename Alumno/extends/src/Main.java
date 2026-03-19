import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Alumno a1 = new Alumno("Manuel", 19, 8.5);
        Profesor p1 = new Profesor("Betina", 58, "Arte");

        personas.add(p1);
        personas.add(a1);

        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
}