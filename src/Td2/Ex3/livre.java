package Td2.Ex3;

class Livre {

    private java.lang.String titre;
    private java.lang.String auteur;
    private double prix;
    private int annee;


    public Livre() {
        titre = "";
        auteur = "";
        prix = 0.0;
        annee = 0;
    }

    public Livre(String titre) {
        this.titre = titre;
        auteur = "";
        prix = 0.0;
        annee = 0;
    }

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        prix = 0.0;
        annee = 0;
    }

    public Livre(String titre, String auteur, double prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        annee = 0;
    }

    public Livre(String titre, String auteur, double prix, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        this.annee = annee;
    }

    // Accesseurs
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Livre{"
                + "titre='" + titre + '\''
                + ", auteur='" + auteur + '\''
                + ", prix=" + prix
                + ", annee=" + annee
                + '}';
    }
}

public class ProgrammeLivre {

    public static void main(String[] args) {
        Livre livre = new Livre("Le Seigneur des Anneaux", "J.R.R. Tolkien", 25.0, 1954);

        System.out.println(livre);
    }
}
