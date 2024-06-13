public class App {
    public static void main(String[] args) throws Exception {
        final Hund hund = new Hund("Bello");
        hund.setName("Florian");
        hund.setName("Andreas");

        System.out.println(hund.getName());
    }
}
