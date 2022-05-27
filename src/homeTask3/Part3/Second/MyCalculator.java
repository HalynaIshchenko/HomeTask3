package homeTask3.Part3.Second;

import homeTask3.Part3.First.Numerable;

public class MyCalculator implements Numerable {

    private final double number1;
    private final double number2;

    MyCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;

    }

    @Override
    public void divide() {
        System.out.println("Divide : " + number1 / number2);
    }

    @Override
    public void minus() {
        System.out.println("Minus : " + (number1 - number2));
    }

    @Override
    public void multiply() {
        System.out.println("Multiply : " + number1 * number2);

    }

    @Override
    public void plus() {
        System.out.println("Plus : " + number1 + number2);

    }
}
