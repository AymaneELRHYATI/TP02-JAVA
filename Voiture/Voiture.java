package Voiture;

import java.util.Arrays;

public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemaree = false;
    private Moteur leMoteur = new Moteur("Audi", 8);
    private Roue[] les4Roues = new Roue[4];
    private Roue roueDeSecours;

    public Voiture(String modele, String marque, double vitesse) {
        for(int i = 0; i < this.les4Roues.length; ++i) {
            this.les4Roues[i] = new Roue(14, 28);
        }

        this.roueDeSecours = new Roue(14, 28);
        this.modele = modele;
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public int deQuellePuissance() {
        return this.leMoteur.getPuissance();
    }

    public void demarre() {
        this.setEstDemaree(true);
    }

    public void accelere(double vitesse) {
        this.setVitesse(this.vitesse + vitesse);
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return this.vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean getEstDemaree() {
        return this.estDemaree;
    }

    public void setEstDemaree(boolean estDemaree) {
        this.estDemaree = estDemaree;
    }

    public Moteur getLeMoteur() {
        return this.leMoteur;
    }

    public void setLeMoteur(Moteur leMoteur) {
        this.leMoteur = leMoteur;
    }

    public Roue[] getLes4Roues() {
        return this.les4Roues;
    }

    public void setLes4Roues(Roue[] les4Roues) {
        this.les4Roues = les4Roues;
    }

    public Roue getRoueDeSecours() {
        return this.roueDeSecours;
    }

    public void setRoueDeSecours(Roue roueDeSecours) {
        this.roueDeSecours = roueDeSecours;
    }

    public String toString() {
        String var10000 = this.modele;
        return "Voiture{modele='" + var10000 + "', marque='" + this.marque + "', vitesse=" + this.vitesse + ", estDemaree=" + this.estDemaree + ", leMoteur=" + this.leMoteur + ", les4Roues=" + Arrays.toString(this.les4Roues) + ", roueDeSecours=" + this.roueDeSecours + "}";
    }
}
