public class Car extends Vehicle {

    private double insuranceFee;

    public Car(String vehicleId, String brand,
               double dailyRate, int days,
               double insuranceFee) {

        super(vehicleId, brand, dailyRate, days);
        this.insuranceFee = insuranceFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateRentalCost() {
        return (getDailyRate() * getDays()) + insuranceFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("(Insurance Fee: Rs " + insuranceFee + ")");
    }
}