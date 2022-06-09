package homeTask3.Part1;

public class Rose extends Flower {


    public Rose(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
