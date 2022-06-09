package homeTask3.Part1;

public abstract class Flower {
    protected String color;
    protected int price;

    public Flower(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getColor() {
        return color;
    }


}
