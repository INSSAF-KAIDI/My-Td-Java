package Td2.Ex1;

public class ProgrammePoint {

        public static <String> void main(String[] args) {

            Point point = new Point('A', 10.0);


            point.affiche();


            point.translate(5.0);


            point.affiche();
        }


}
