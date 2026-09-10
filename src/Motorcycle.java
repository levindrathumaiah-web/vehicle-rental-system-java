public class Motorcycle extends Vehicle {

    private double helmetFee;

    public Motorcycle(String vehicleId, String brand,
                      double dailyRate, int days,
                      double helmetFee) {

        super(vehicleId, brand, dailyRate, days);
        this.helmetFee = helmetFee;
    }

    public double getHelmetFee() {
        return helmetFee;
    }

    public void setHelmetFee(double helmetFee) {
        this.helmetFee = helmetFee;
    }

    @Override
    public double calculateRentalCost() {
        return (getDailyRate() * getDays()) + helmetFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("(Helmet Fee: Rs " + helmetFee + ")");
    }
}