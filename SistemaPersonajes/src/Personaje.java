abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;

    public Personaje(String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    public abstract void atacar();

    public void recibirdanio() {
        int danio = (int)(Math.random() * 50 + 10);
        vida-= danio;
        System.out.println("Recibio " + danio + " de daño \uD83D\uDCA5");
    }

    public void curar (int cura) {
        vida += cura;
        System.out.println("Recupero " + cura + " de vida \uD83E\uDE79");
    }

    public void subirNivel (int subida) {
        nivel += subida;
        System.out.println(nombre + " subio " + subida + " niveles!");
    }

    @Override
    public String toString () {
        return "Nombre: " + nombre + " - Nivel: " + nivel + " - HP: " + vida;
    }
}