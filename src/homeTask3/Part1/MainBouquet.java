package homeTask3.Part1;

public class MainBouquet {
    public static void main(String[] args) {
        Flower aster = new Aster("violet", 11);
        Flower peony = new Peony("pink", 12);
        Flower daisy = new Daisy("white", 14);
        Flower rose = new Rose("blue", 15);

        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(aster);
        bouquet.addFlower(aster);
        bouquet.addFlower(aster);
        bouquet.addFlower(daisy);
        bouquet.addFlower(daisy);
        bouquet.addFlower(daisy);
        bouquet.addFlower(rose);
        bouquet.addFlower(rose);
        bouquet.addFlower(rose);
        bouquet.addFlower(peony);
        bouquet.addFlower(peony);
        System.out.println(bouquet.getBouquet());
        System.out.println("Sum: " + bouquet.getSum());
    }
}
