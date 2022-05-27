package homeTask3.Part2;

public class WorkerWithFixedSalary implements Salary{
    @Override
    public void getSalary() {
        final int priceInUSD=3000;
        System.out.println("Salary for a month: " + priceInUSD + " USD");

    }
}
