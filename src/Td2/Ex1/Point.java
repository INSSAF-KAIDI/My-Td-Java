package Td2.Ex1;

public class Point {

        private char nom;
        private double abscisse;

        public Point(char nom, double abscisse) {
            this.nom = nom;
            this.abscisse = abscisse;
        }

        public void affiche() {
            System.out.println("Nom : " + nom + ", abscisse : " + abscisse);
        }

        public void translate(double translation) {
            abscisse += translation;
        }
    }

