public class Hund extends Tier {

    public Hund(String name) {
        super(name);
    }

    public String getName() {
        gerauschMachen();
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void gerauschMachen() {
        super.gerauschMachen();
        System.out.println("Der Hund bellt");
    }
}
