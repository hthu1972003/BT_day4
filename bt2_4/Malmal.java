package opp.bt2_4;

public class Mammal extends Animal{
    private String name1;

    public Mammal(String name) {
        super(String name);
    }
    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name1 + '\'' +
                '}';
    }
}