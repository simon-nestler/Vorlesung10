public class App {
    public static void main(String[] args) throws Exception {
        Hund hund = new Hund("Bello");

        char c = 'e';
        hund.meineMethode(c);
        System.out.println("Der Wert von c: " + c);

        // System.out.println(hund.getName());
    }
}
