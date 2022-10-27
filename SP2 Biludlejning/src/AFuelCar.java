public abstract class AFuelCar extends ACar {

    protected int kmPrLitre;


    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public int getKmPrLitre() {
        return kmPrLitre;
    }
    public abstract String getFuelType();   //abstract fuel type

    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", fuel type = "+ getFuelType()+
                '}';
    }
}
