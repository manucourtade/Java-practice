import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        personajes.add(new Guerrero("Kratos", 10, 250));
        personajes.add(new Mago("Gandalf", 50, 180));
        personajes.add(new Arquero("Legolas", 30, 100));

        for (Personaje p: personajes) {
            p.recibirdanio();
            System.out.println(p);
            p.atacar();

            if (p instanceof HabilidadEspecial) {
                ((HabilidadEspecial)p).usarHabilidad();
            }
            System.out.println("----------------------------------");
        }
    }
}