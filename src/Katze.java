public class Katze extends Tier {

    public Katze(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Miau! Miau!");
    }

    @Override
    public void setAlter(int alter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAlter'");
    }
}
