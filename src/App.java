public class App {
    public static void main(String[] args) throws Exception {
        Hund hund = new Hund("Bello");

        hund.meineMethode2('e');

        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(sb);
        hund.meineMethode(sb2);
        sb2 = null;

        // System.out.println(hund.getName());
    }
}
