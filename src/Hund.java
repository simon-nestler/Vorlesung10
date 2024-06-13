public class Hund extends Tier {

    public Hund(String name) {
        super(name);
    }

    @Override
    public void geraeuschMachen() {
        System.out.println("Wau! Wau!");
    }

    @Override
    public void setAlter(int alter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAlter'");
    }
}
