import java.util.ArrayList;

public class Tierpark {
    private ArrayList<Tier> tiere = new ArrayList<Tier>();

    public void addTier(Tier tier) {
        tiere.add(tier);
    }

    public void geraeuschMachen() {
        for (Tier tier : tiere) {
            tier.geraeuschMachen();
        }

        tiere = new ArrayList<Tier>();
        addTier(new Katze("Minka"));
    }
}
