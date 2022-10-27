public class ElectricCar  extends  ACar{

    private final int batteryCapacity;
    private final int maxRange;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacity() {   //getters
        return batteryCapacity;
    }
    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (getBatteryCapacity() * 1000) / getMaxRange());
    }

    public int getRegistrationFee() {
        int kmPrLitre = Math.round(100 / (getWhPrKm() / 91.25));
        if (kmPrLitre < 5) {
            return 10470;
        } else if (kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre < 20) {
            return 1050;
        } else {
            return 330;
        }
    }

    @Override
    public String toString() {
        return "ElectricCar |" +
                "BatteryCapacity = " + batteryCapacity +
                ", maxRange = " + maxRange +
                ", registration number = " + registrationNumber + '\'' +
                ", make = " + make + '\'' +
                ", model = " + model + '\'' +
                ", doors = " + numberOfDoors +
                '|';
    }
}
