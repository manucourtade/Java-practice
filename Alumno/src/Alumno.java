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

    int cantidadAprobado () {
        int suma = 0;

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).aprobado()) {
                suma ++;
            }
        }
        return suma;
    }

    void mostrarDesaprobados () {
        for (int i = 0; i < alumnos.size(); i++) {
            if (!alumnos.get(i).aprobado()) {
                System.out.println((alumnos.get(i)));
            }
        }
    }

    void mejorpeorAlumno() {
        Alumno mejor = alumnos.get(0);
        Alumno peor = alumnos.get(0);

        for (int i = 1; i < alumnos.size(); i++) {
            if (alumnos.get(i).promedio() > mejor.promedio()) {
                mejor = alumnos.get(i);
            }
            if (alumnos.get(i).promedio() < peor.promedio()) {
                peor = alumnos.get(i);
            }

        }
        System.out.println("El alumno " + mejor.getNombre() + " Tiene el mejor promedio con " + mejor.promedio());
        System.out.println("El alumno " + peor.getNombre() + " Tiene el peor promedio con " + peor.promedio());
    }

    Alumno buscarAlumno(String nombre) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getNombre().equals(nombre)) {
                return alumnos.get(i);
            }
        }
        return null;
    }

    void promedioGeneral () {
        double suma = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            suma+= alumnos.get(i).promedio();
        }
        double promedioGen = suma / alumnos.size();
        if (alumnos.size() == 0) {
            System.out.println("No hay alumnos");
            return;
        }
        System.out.println("El promedio general del curso es de: " + promedioGen);
    }

    void ordenarCurso () {
        int cant = alumnos.size();
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant - 1; j++) {
                if (alumnos.get(j).promedio() < alumnos.get(j + 1).promedio()) {
                    Alumno aux = alumnos.get(j);
                    alumnos.set(j, alumnos.get(j + 1));
                    alumnos.set(j + 1,aux);
                }
            }
        }
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
        //curso.mostrarAprobados();
        //curso.mostrarDesaprobados();
        //curso.mejorpeorAlumno();
        curso.promedioGeneral();
        //int cant = curso.cantidadAprobado();
        //System.out.println("Hay " + cant + " alumnos aprobados!");
        curso.ordenarCurso();
        curso.mostrarAlumnos();

        /*Alumno encontrado = curso.buscarAlumno("Manuel");
        if (encontrado != null) {
            System.out.println("Alumno encontrado: " + encontrado);
        } else  {
            System.out.println("No se encontro");
        }*/

    }
}