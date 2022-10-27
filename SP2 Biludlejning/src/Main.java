public class Main {
    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        fleetOfCars.addCar(new GasolineCar("ZA 43 345", "Toyota", "Aygo", 5, 13));
        fleetOfCars.addCar(new GasolineCar("AB 22 985", "Ford", "Focus", 6, 20));

        fleetOfCars.addCar(new ElectricCar("BL 39 543", "Tesla", "X", 7, 110,310));
        fleetOfCars.addCar(new ElectricCar("HG 30 123", "BMW", "Picanto", 5, 170, 430));

        fleetOfCars.addCar(new DieselCar("TP 65 435", "Honda", "Ridgeline", 4, 9, true));
        fleetOfCars.addCar(new DieselCar("TC 10 326", "Ferrari", "BroomBroom", 2, 4, false));

        System.out.println("------------------------------------------------CAR FLEET---------------------------------------------------------------------------------------------------------");
        System.out.println(fleetOfCars);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(("Total Registration fee for all cars in fleet = [") +fleetOfCars.getTotalRegistrationFeeForFleet()+"] dkk");
        System.out.println("-----------------------------------------------------------");
    }
}