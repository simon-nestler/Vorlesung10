public class Hund extends Tier {
    private String name;

    public Hund(String name) {
        this.name = name;
    }

    public String getName() {
        gerauschMachen();
        return name;
    }

    @Override
    public void gerauschMachen() {
        super.gerauschMachen();
        System.out.println("Der Hund bellt");
    }
}
