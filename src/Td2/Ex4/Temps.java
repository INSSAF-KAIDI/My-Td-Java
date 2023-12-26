package Td2.Ex4;

class Temps {


    private int heures;
    private int minutes;
    private int secondes;


    public Temps() {
        heures = 0;
        minutes = 0;
        secondes = 0;
    }

    public Temps(int heures) {
        this.heures = heures;
        minutes = 0;
        secondes = 0;
    }

    public Temps(int heures, int minutes) {
        this.heures = heures;
        this.minutes = minutes;
        secondes = 0;
    }

    public Temps(int heures, int minutes, int secondes) {
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }

    // Accesseurs
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        if (heures < 0 || heures > 23) {
            throw new IllegalArgumentException("Les heures doivent être comprises entre 0 et 23");
        }
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Les minutes doivent être comprises entre 0 et 59");
        }
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        if (secondes < 0 || secondes > 59) {
            throw new IllegalArgumentException("Les secondes doivent être comprises entre 0 et 59");
        }
        this.secondes = secondes;
    }

    // Méthodes
    public void ajouterHeures(int heures) {
        this.heures += heures;
        while (this.heures >= 24) {
            this.heures -= 24;
        }
    }

    public void ajouterMinutes(int minutes) {
        this.minutes += minutes;
        while (this.minutes >= 60) {
            this.minutes -= 60;
            this.heures++;
        }
    }

    public void ajouterSecondes(int secondes) {
        this.secondes += secondes;
        while (this.secondes >= 60) {
            this.secondes -= 60;
            this.minutes++;
        }
    }

    // Méthode toString()
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}

public class ProgrammeTemps {

    public static void main(String[] args) {
        // Créer un temps
        Temps temps = new Temps(12, 30, 0);

        // Afficher le temps
        System.out.println(temps);

        // Ajouter des heures
        temps.ajouterHeures(2);

        // Afficher le temps
        System.out.println(temps);

        // Ajouter des minutes
        temps.ajouterMinutes(30);

        // Afficher le temps
        System.out.println(temps);

        // Ajouter des secondes
        temps.ajouterSecondes(30);

        // Afficher le temps
        System.out.println(temps);
    }
}

