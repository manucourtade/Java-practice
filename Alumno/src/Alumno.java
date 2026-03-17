import java.util.ArrayList;

public class Alumno {

    private String nombre;
    private double nota1;
    private double nota2;

    Alumno(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    double promedio() {
        return (getNota1() + getNota2()) / 2;
    }

    boolean aprobado() {
        return promedio() >= 6;
    }

    @Override
    public String toString() {
        return nombre + " - Promedio: " + promedio() +
                (aprobado() ? " - Aprobado" : " - Desaprobado");
    }

}

class Curso {
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    void mostrarAlumnos () {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }

    void mostrarAprobados () {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).aprobado()) {
                System.out.println((alumnos.get(i)));
            }
        }
    }

    void mostrarDesaprobados () {
        for (int i = 0; i < alumnos.size(); i++) {
            if (!alumnos.get(i).aprobado()) {
                System.out.println((alumnos.get(i)));
            }
        }
    }

    void mejorAlumno() {
        Alumno mejor = alumnos.get(0);

        for (int i = 1; i < alumnos.size(); i++) {
            if (alumnos.get(i).promedio() > mejor.promedio() ) {
                mejor = alumnos.get(i);

            }
        }
        System.out.println("El alumno " + mejor.getNombre() + " Tiene el mejor promedio con " + mejor.promedio());
    }
}

class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Manuel", 8, 9);
        Alumno a2 = new Alumno("Catalina", 10, 6);
        Alumno a3 = new Alumno("Almendra", 5, 8);

        Curso curso = new Curso();

        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        curso.agregarAlumno(a3);

        //curso.mostrarAlumnos();
        curso.mostrarAprobados();
        curso.mostrarDesaprobados();
        curso.mejorAlumno();

    }
}