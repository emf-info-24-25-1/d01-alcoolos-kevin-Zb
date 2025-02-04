package app;

import model.Ami;

public class Application {
        public static void main(String[] args) {
                Ami joachim = new Ami("joachim", 10);
                Ami eduardo = new Ami("eduardo", 8);
                Ami kevin = new Ami("kevin", 9);
                do {
                        joachim.getBiereRestantes();
                        joachim.boitUneBiere();

                        System.out.println("-----------------------------------");

                        eduardo.getBiereRestantes();
                        eduardo.boitUneBiere();

                        System.out.println("-----------------------------------");

                        kevin.getBiereRestantes();
                        kevin.boitUneBiere();

                        System.out.println("-----------------------------------");

                } while (!kevin.getEstBouree() && !eduardo.getEstBouree() && !joachim.getEstBouree());
        }
}
