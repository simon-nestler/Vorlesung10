abstract public class Tier extends Lebewesen {
    protected String name;

    public Tier(String name) {
        this.name = name;
    }

    abstract public void geraeuschMachen();
}
