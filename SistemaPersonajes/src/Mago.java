class Mago extends Personaje implements HabilidadEspecial {
    public Mago(String nombre, int nivel, int vida) {
        super(nombre, nivel, vida);
    }

    @Override
    public void atacar () {
        System.out.println(nombre + " lanza un hechizo \uD83E\uDDD9");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa Bola de Fuego 🔥");
    }
}