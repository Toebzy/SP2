public class DieselCar extends AFuelCar {

    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public String hasParticleFilter() {
        if (particleFilter==true){
            return ("Yes");
        };
        return ("No");
    }

    @Override
    public String getFuelType() {
        return("Diesel");
    }

    @Override
    public int getRegistrationFee() {

        int RegistrationFee = 0;

        if (kmPrLitre >= 15 && kmPrLitre < 20) {
            RegistrationFee+=2440;
        }
        else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            RegistrationFee+= 4190;
        }
        else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            RegistrationFee+= 8270;
        }
        else if (kmPrLitre < 5) {
            RegistrationFee+= 25730;
        }
        if (!particleFilter) {
            RegistrationFee +=1000;
        }
        return RegistrationFee;
    }


    @Override
    public String toString() {
        return "DieselCar   |" +
                "Particle Filter = " + hasParticleFilter() +
                ", kmPrLitre = " + kmPrLitre +
                ", registration number = " + registrationNumber + '\'' +
                ", make = " + make + '\'' +
                ", model = " + model + '\'' +
                ", doors = " + numberOfDoors +
                ", fuel type = "+ getFuelType()+
                '|';
    }
}
