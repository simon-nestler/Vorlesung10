public class Tier {
    protected String name;

    public Tier(String name) {
        this.name = name;
    }

    public void meineMethode2(final char c) {
        char b = c;

        if (c == 'e') {
            b = 'a';
        }
    }

    public void meineMethode(StringBuilder text) {
        text.append(" World!");
        System.out.println("Innerhalb: " + text);
    }

    public void gerauschMachen() {
        System.out.println("Tier macht ein Geräusch");
    }
}
