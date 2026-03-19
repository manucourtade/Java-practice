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