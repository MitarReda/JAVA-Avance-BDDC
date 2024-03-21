public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(-5);
        } catch (NombreNegatifException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier = new EntierNaturel(10);
            System.out.println("Valeur de l'entier: " + entier.getVal());

            entier.setVal(-3);
        } catch (NombreNegatifException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier = new EntierNaturel(1);
            System.out.println("Valeur de l'entier: " + entier.getVal());

            entier.decrementer();
            entier.decrementer();
            System.out.println("Valeur après décrémentation: " + entier.getVal());

            entier.decrementer(); // Génère une exception
        } catch (NombreNegatifException e) {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Valeur erronée: " + e.getValeurErronee());
        }
    }
}