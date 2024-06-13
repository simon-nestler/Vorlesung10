public class App {
    public static void main(String[] args) throws Exception {
        Hund hund = new Hund("Bello");

        hund.meineMethode2('e');

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Vorher: " + sb);
        hund.meineMethode(sb);
        System.out.println("Nachher: " + sb);

        // System.out.println(hund.getName());
    }
}
