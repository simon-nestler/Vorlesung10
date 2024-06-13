public class Hund extends Tier {

    private int alter;

    public Hund(String name) {
        super(name);
    }

    public Hund(String name, int alter) {
        super(name);
        this.alter = alter;
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
