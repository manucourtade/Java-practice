class Guerrero extends Personaje implements HabilidadEspecial {
    public Guerrero(String nombre, int nivel, int vida) {
        super(nombre, nivel, vida);
    }

    @Override
    public void atacar () {
        System.out.println(nombre + " ataca con espada ⚔\uFE0F");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa dobles espadas venenosas  ☢\uFE0F");
    }
}