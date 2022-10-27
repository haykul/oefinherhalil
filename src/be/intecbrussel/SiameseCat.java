package be.intecbrussel;

public class SiameseCat extends Felis{
    public SiameseCat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "SiameseCat{" +
                super.toString() +
                '}';
    }
}
