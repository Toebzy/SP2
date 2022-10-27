public class Main {
    public static void main(String[] args) {

        FleetOfCars fleet = new FleetOfCars();

        FleetOfCars.addCar(new GasolinCar("AB 12 345", "Ford", "Focus", 5, 20));
        FleetOfCars.addCar(new GasolinCar("AB 12 345", "Ford", "Focus", 5, 20));
        FleetOfCars.addCar(new GasolinCar("AB 12 345", "Ford", "Focus", 5, 20));

        FleetOfCars.addCar(new ElectricCar("AB 12 345", "Ford", "Focus", 5, 1,200));
        FleetOfCars.addCar(new ElectricCar("AB 12 345", "Ford", "Focus", 5, 20,200));
        FleetOfCars.addCar(new ElectricCar("AB 12 345", "Ford", "Focus", 5, 20, 200));

        FleetOfCars.addCar(new DieselCar("AB 12 345", "Ford", "Focus", 5, 20, true));
        FleetOfCars.addCar(new DieselCar("AB 12 345", "Ford", "Focus", 5, 20, true));
        FleetOfCars.addCar(new DieselCar("AB 12 345", "Ford", "Focus", 5, 20, false));
        System.out.println(fleet);
    }
}