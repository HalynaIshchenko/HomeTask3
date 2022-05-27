package homeTask3;

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
