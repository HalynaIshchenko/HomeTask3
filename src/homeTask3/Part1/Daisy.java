package homeTask3.Part1;

public class Daisy extends Flower {
    public Daisy(){
        super();
        super.price = 14;
        super.color = "white";

    }

    @Override
    public String toString() {
        return "Daisy{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
