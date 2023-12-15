package Voiture;

public class Roue {
    private int largeur;
    private int diametreJante;

    public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }

    public int getLargeur() {
        return this.largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getDiametreJante() {
        return this.diametreJante;
    }

    public void setDiametreJante(int diametreJante) {
        this.diametreJante = diametreJante;
    }

    public String toString() {
        return "Roue{largeur=" + this.largeur + ", diametreJante=" + this.diametreJante + "}";
    }
}

