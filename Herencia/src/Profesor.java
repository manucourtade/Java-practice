class Profesor extends Persona {
    private String materia;

    Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    public String toString() {
        String var10000 = this.getNombre();
        return var10000 + " - Edad " + this.getEdad() + " - Materia " + this.materia;
    }
}