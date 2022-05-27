package homeTask3;

public class MainBouquet {
    public static void main(String[] args) {
        Flower aster = new Aster();
        Flower daisy = new Daisy();
        Flower rose = new Rose();
        Flower peony = new Peony();

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
