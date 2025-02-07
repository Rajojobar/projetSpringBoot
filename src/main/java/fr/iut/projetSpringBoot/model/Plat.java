package fr.iut.projetSpringBoot.model;

public class Plat {

    private int id;

    private String nom;

    private int nbCalories;

    private int nbLipides;

    private int nbProteines;

    private int nbGlucides;

    public Plat() {
    }

    public Plat(int id, String nom, int nbCalories, int nbLipides, int nbProteines, int nbGlucides) {
        this.id = id;
        this.nom = nom;
        this.nbCalories = nbCalories;
        this.nbLipides = nbLipides;
        this.nbProteines = nbProteines;
        this.nbGlucides = nbGlucides;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbCalories() {
        return nbCalories;
    }

    public int getNbLipides() {
        return nbLipides;
    }

    public int getNbProteines() {
        return nbProteines;
    }

    public int getNbGlucides() {
        return nbGlucides;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbCalories(int nbCalories) {
        this.nbCalories = nbCalories;
    }

    public void setNbLipides(int nbLipides) {
        this.nbLipides = nbLipides;
    }

    public void setNbProteines(int nbProteines) {
        this.nbProteines = nbProteines;
    }

    public void setNbGlucides(int nbGlucides) {
        this.nbGlucides = nbGlucides;
    }
}
