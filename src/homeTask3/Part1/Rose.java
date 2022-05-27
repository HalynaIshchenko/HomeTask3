package homeTask3.Part1;

import homeTask3.Part1.Flower;

public class Rose extends Flower {

    public Rose(){
        super();
        super.price = 15;
        super.color = "blue";


    }

    @Override
    public String toString() {
        return "Rose{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
