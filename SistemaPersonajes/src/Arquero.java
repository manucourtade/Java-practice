class Arquero extends Personaje implements HabilidadEspecial {
    public Arquero(String nombre, int nivel, int vida) {
        super(nombre, nivel, vida);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una flecha \uD83C\uDFF9");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa Flecha Explosiva 💥");
    }
}