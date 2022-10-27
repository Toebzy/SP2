public class DieselCar extends AFuelCar {

    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String hasParticleFilter() {
        if (particleFilter==true){
            return ("yes");
        };
        return ("no");
    }

    @Override
    public String getFuelType() {
        return("Diesel");
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "DieselCar{" +
                "particleFilter=" + hasParticleFilter() +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", fuel type = "+ getFuelType()+
                '}';
    }
}
