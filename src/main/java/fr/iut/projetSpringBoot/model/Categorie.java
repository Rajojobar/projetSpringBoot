package fr.iut.projetSpringBoot.model;

public class Categorie {

    private int id;

    private String nom;


    public Categorie() {
    }

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
