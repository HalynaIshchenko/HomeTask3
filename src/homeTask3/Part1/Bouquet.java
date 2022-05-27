package homeTask3.Part1;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> list = new ArrayList<>();


    public List<Flower> getBouquet() {
        return list;
    }

    public void addFlower(Flower flower) {
        this.list.add(flower);
    }

    public int getSum() {
        int sum = 0;
        for (Flower f : list) {
            sum = f.getPrice() + sum;

        }
        return sum;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "list=" + list +
                '}';
    }
}
