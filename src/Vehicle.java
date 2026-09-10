public class Vehicle {

    private String vehicleId;
    private String brand;
    private double dailyRate;
    private int days;

    public Vehicle(String vehicleId, String brand, double dailyRate, int days) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.dailyRate = dailyRate;
        this.days = days;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double calculateRentalCost() {
        return dailyRate * days;
    }

    public void displayDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Daily Rate: Rs " + dailyRate);
        System.out.println("Rental Days: " + days);
        System.out.println("Total Cost: Rs " + calculateRentalCost());
    }
}