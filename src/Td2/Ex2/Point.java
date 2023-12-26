package Td2.Ex2;

class Point {

    private double abscisse;
    private double ordonnee;

    public Point() {
        abscisse = 0.0;
        ordonnee = 0.0;
    }


    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public double getAbscisse() {
        return abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }


    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }


    public double norme() {
        return Math.sqrt(abscisse * abscisse + ordonnee * ordonnee);
    }
}

public class ProgrammePoint {

    public static void main(String[] args) {

        Point point = new Point(10.0, 20.0);


        System.out.println("Abscisse : " + point.getAbscisse());
        System.out.println("Ordonnee : " + point.getOrdonnee());


        double norme = point.norme();


        System.out.println("Norme : " + norme);
    }
}

