package homeTask3.Part2;

public class HourlyWageWorker implements Salary {
int workingHours;
    HourlyWageWorker(int workingHours){
        this.workingHours=workingHours;
    }
    @Override
    public void getSalary() {
        int pricePerHourInUSD = 20;
        System.out.println("Salary for " + workingHours +" working hours : " + workingHours * pricePerHourInUSD + " USD");

    }
}
