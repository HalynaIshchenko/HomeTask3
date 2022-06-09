package homeTask3.Part1;

public class Peony extends Flower {


    public Peony(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Peony{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
