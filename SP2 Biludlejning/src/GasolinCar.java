public class GasolinCar extends AFuelCar  {


    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return ("Gasolin");
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "GasolinCar {" +
                "km/l =" + kmPrLitre +
                ", registration number ='" + registrationNumber + '\'' +
                ", make ='" + make + '\'' +
                ", model ='" + model + '\'' +
                ", doors =" + numberOfDoors +
                ", fuel type = "+ getFuelType()+
                '}';
    }
}
