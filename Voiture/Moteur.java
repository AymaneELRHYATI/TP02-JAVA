package Voiture;

public class Moteur {
    private String nom;
    private int puissance;

    public Moteur(String nom, int puissance) {
        this.nom = nom;
        this.puissance = puissance;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public String toString() {
        return "Moteur{nom='" + this.nom + "', puissance=" + this.puissance + "}";
    }
}
