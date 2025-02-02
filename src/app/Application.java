package app;

import model.ami;

public class Application {
        public static void main(String[] args) {
                ami joachim = new ami("joachim", 10);
                ami eduardo = new ami("eduardo", 8);
                ami kevin = new ami("kevin", 9);
                do {
                        joachim.getBiere();
                        joachim.boitUneBiere();
                        eduardo.getBiere();
                        eduardo.boitUneBiere();
                        kevin.getBiere();
                        kevin.boitUneBiere();
                } while (!kevin.getEstBouree() && !eduardo.getEstBouree() && !joachim.getEstBouree());
                if (kevin.getEstBouree()) {
                        System.out.println("kevin est bouré");
                } else if (eduardo.getEstBouree()) {
                        System.out.println("eduardo est bourée");
                } else {
                        System.out.println("joachim est bourée");
                }
        }
}
