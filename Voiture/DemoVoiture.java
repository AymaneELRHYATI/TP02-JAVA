package Voiture;

public class DemoVoiture {
    public DemoVoiture() {
    }

    public static void main(String[] args) {
        Moteur m1 = new Moteur("Peugeot", 8);
        m1.setPuissance(20);
        System.out.println(m1.toString());
        Voiture v1 = new Voiture("2005", "Peugeot", 60.0);
        System.out.println(v1.toString());
        System.out.println(v1.deQuellePuissance());
        v1.demarre();
        System.out.println(v1.getEstDemaree());
        v1.accelere(20.0);
        System.out.println(v1.getVitesse());
    }
}
