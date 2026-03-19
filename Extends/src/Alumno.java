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