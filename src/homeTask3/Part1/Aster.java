package homeTask3.Part1;

public class Aster extends Flower {
    public Aster(){
        super();
        super.price = 11;
        super.color = "violet";

    }

    @Override
    public String toString() {
        return "Aster{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
