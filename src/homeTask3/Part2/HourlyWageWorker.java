package homeTask3.Part2;

public class HourlyWageWorker implements Salary {
private final int workingHours;
    HourlyWageWorker(int workingHours){
        this.workingHours=workingHours;
    }
    @Override
    public void getSalary() {
        int pricePerHourInUSD = 20;
        int salary = workingHours * pricePerHourInUSD;
        System.out.printf("Salary for %s working hours: %s USD \n",   workingHours, salary);


    }
}
