import java.util.ArrayList;

public class FleetOfCars {


    private static final ArrayList<Car> fleet = new ArrayList<>();

    public static void addCar(Car car) {
        fleet.add(car);
    }

    public static int getTotalRegistrationFeeForFleet(){
        int totalRegistration=0;
        for(Car car : fleet){
            totalRegistration+=car.getRegistrationFee();
        }
        return totalRegistration;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : fleet) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }



}
