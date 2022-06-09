package homeTask3.Part1;

public class Daisy extends Flower {


    public Daisy(String color, int price) {
        super(color, price);
    }

    @Override
    public String toString() {
        return "Daisy{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
