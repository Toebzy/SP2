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

    int getWhPrKm(){
        return 0;
    }

    @Override
    public int getRegistrationFee(){
        return 0;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
