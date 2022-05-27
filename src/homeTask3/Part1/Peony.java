package homeTask3.Part1;

import homeTask3.Part1.Flower;

public class Peony extends Flower {
    public Peony(){
        super();
        super.price = 12;
        super.color = "pink";

    }

    @Override
    public String toString() {
        return "Peony{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
