import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;



    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class Alumno extends Persona {
    private double promedio;

    Alumno(String nombre, int edad, double promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return getNombre() + " - Edad " + getEdad() + " - Promedio " + promedio;
    }
}

class Profesor extends Persona {
    private String materia;

    Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public String toString () {
        return getNombre() + " - Edad " + getEdad() + " - Materia " + materia;
    }
}

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