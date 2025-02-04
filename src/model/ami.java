package model;

public class Ami {
    private String nom;
    private int biereMax;
    private boolean estBouree = false;

    public Ami(String nom, int biereMax) {
        this.nom = nom;
        this.biereMax = biereMax;
        System.out.println("l'ami " + nom + " à été créé.");
    }

    public String getNom() {
        return this.nom;
    }

    public void boitUneBiere(){
        if (biereMax > 0) {
            biereMax--;
            System.out.println("le frero " + nom +" a bu une bière");
        } else {
            System.out.println("le frero " + nom + " est bourrée");
            estBouree = true;
        }
    }

    public boolean getEstBouree() {
        return this.estBouree;
    }

    public void getBiereRestantes() {
        System.out.println(this.nom + " peut encore boire " + this.biereMax + " bière.");   
    }
}
