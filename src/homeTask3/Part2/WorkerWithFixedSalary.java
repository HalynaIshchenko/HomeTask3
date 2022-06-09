package homeTask3.Part2;

public class WorkerWithFixedSalary implements Salary {
    @Override
    public void getSalary() {
        final int priceInUSD = 3000;
        System.out.printf("Salary for a month: %s  USD \n", priceInUSD);

    }
}
