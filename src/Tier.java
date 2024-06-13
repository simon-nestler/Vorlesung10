public class Tier {
    protected String name;

    public Tier(String name) {
        this.name = name;
    }

    public void meineMethode(char c) {
        c = 'a';
    }

    public void gerauschMachen() {
        System.out.println("Tier macht ein Geräusch");
    }
}
