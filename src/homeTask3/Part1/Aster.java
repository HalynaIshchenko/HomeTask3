package homeTask3.Part1;

public class Aster extends Flower {


    public Aster(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Aster{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
