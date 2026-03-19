class Alumno extends Persona {
    private double promedio;

    Alumno(String nombre, int edad, double promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return this.promedio;
    }

    public String toString() {
        String var10000 = this.getNombre();
        return var10000 + " - Edad " + this.getEdad() + " - Promedio " + this.promedio;
    }
}