public class App {
    public static void main(String[] args) throws Exception {
        Tierpark tierpark = new Tierpark();
        tierpark.addTier(new Hund("Bello"));

        tierpark.geraeuschMachen();
        tierpark.geraeuschMachen();
    }
}
