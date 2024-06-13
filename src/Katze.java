public class Katze extends Tier {

    public Katze(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Miau! Miau!");
    }
}
