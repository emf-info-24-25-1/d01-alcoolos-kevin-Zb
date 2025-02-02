package model;

public class ami {
    private String nom;
    private int biereMax;
    private boolean estBouree = false;

    public ami(String nom, int biereMax) {
        this.nom = nom;
        this.biereMax = biereMax;
        System.out.println("l'ami " + nom + " à été créé.");
    }

    public String getNom() {
        return this.nom;
    }

    public void boitUneBiere(){
        System.out.println(this.nom + " boit une bière");
        this.biereMax = this.biereMax - 1;
        if (this.biereMax == 0) {
            this.estBouree = true;
        }
    }

    public boolean getEstBouree() {
        return this.estBouree;
    }

    public void getBiere() {
        System.out.println(this.nom + " peut encore boire " + this.biereMax + " bière.");
    }
}
